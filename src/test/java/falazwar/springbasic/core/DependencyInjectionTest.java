package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Bar;
import falazwar.springbasic.core.data.Foo;
import falazwar.springbasic.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

  private ApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
  }

  @Test
  void testDI() {

    Foo foo = context.getBean("fooSecond", Foo.class);
    Bar bar = context.getBean(Bar.class);
    FooBar fooBar = context.getBean(FooBar.class);

    Assertions.assertSame(foo, fooBar.getFoo());
    Assertions.assertSame(bar, fooBar.getBar());

  }

  @Test
  void testNoDI() {

    Foo foo = new Foo();
    Bar bar = new Bar();

    FooBar fooBar = new FooBar(foo, bar);

    Assertions.assertSame(fooBar.getFoo(), foo);
  }
}
