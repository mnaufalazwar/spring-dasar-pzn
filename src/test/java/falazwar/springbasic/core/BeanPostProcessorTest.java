package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Car;
import falazwar.springbasic.core.data.Foo;
import falazwar.springbasic.core.processor.IdGeneratorBeanPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class BeanPostProcessorTest {

  @Configuration
  @Import({
      Car.class,
      IdGeneratorBeanPostProcessor.class,
      Foo.class,
  })
  public static class TestConfiguration{

  }

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp(){
    applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testPostProcessor(){
    Car car = applicationContext.getBean(Car.class);
    Foo foo = applicationContext.getBean(Foo.class);

    Assertions.assertNotNull(car.getId());
  }
}
