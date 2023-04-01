package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Bar;
import falazwar.springbasic.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeBeanTest {

  ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
  }

  @Test
  void testPrototype() {
    Foo foo1 = applicationContext.getBean(Foo.class);
    Foo foo2 = applicationContext.getBean(Foo.class);
    Foo foo3 = applicationContext.getBean(Foo.class);

    Assertions.assertNotSame(foo1, foo2);
  }

  @Test
  void testCustom(){
    Bar bar1 = applicationContext.getBean(Bar.class);
    Bar bar2 = applicationContext.getBean(Bar.class);
    Bar bar3 = applicationContext.getBean(Bar.class);
    Bar bar4 = applicationContext.getBean(Bar.class);


    Assertions.assertSame(bar1, bar3);
    Assertions.assertSame(bar2, bar4);
    Assertions.assertNotSame(bar1, bar2);
    Assertions.assertNotSame(bar3, bar4);
  }
}
