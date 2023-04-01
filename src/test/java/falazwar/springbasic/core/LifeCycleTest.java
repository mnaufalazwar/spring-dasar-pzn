package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Connection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

  ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void test(){
    applicationContext.getBean(Connection.class);
  }
}
