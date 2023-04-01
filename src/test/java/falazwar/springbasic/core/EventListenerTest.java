package falazwar.springbasic.core;

import falazwar.springbasic.core.listener.LoginSuccessAgainListener;
import falazwar.springbasic.core.listener.LoginSuccessListener;
import falazwar.springbasic.core.listener.UserListener;
import falazwar.springbasic.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

  @Configuration
  @Import({
      UserService.class,
      LoginSuccessListener.class,
      LoginSuccessAgainListener.class,
      UserListener.class
  })
  public static class TestConfiguration{}

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp(){
    applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testEvent(){
    UserService userService = applicationContext.getBean(UserService.class);

    userService.login("a", "a");
    userService.login("b", "a");
    userService.login("c", "c");
  }
}
