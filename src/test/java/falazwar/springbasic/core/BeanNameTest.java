package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {

  ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
  }

  @Test
  void testName() {

    Foo foo1 = applicationContext.getBean("fooFirst", Foo.class);
  }
}
