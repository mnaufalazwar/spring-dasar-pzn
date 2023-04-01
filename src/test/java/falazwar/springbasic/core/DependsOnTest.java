package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Bar;
import falazwar.springbasic.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

  ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
  }

  @Test
  void testDependsOn() {
    Bar bar = applicationContext.getBean(Bar.class);
    Foo foo = applicationContext.getBean(Foo.class);
  }
}
