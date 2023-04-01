package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeanTest {

  @Test
  void testDuplicate(){
    ApplicationContext context = new AnnotationConfigApplicationContext(BeanDupclicateConfiguration.class);

    Foo foo1 = context.getBean("foo1", Foo.class);
    Foo foo2 = context.getBean("foo2", Foo.class);

    Assertions.assertNotSame(foo1, foo2);

//    Assertions.assertThrows(NoUniqueBeanDefinitionException.class , () -> {
//      context.getBean(Foo.class);
//    });
  }

  @Test
  void testDuplicate2(){
    ApplicationContext context = new AnnotationConfigApplicationContext(BeanDupclicateConfiguration.class);

    Foo foo1 = context.getBean("foo1", Foo.class);
    Foo foo2 = context.getBean(Foo.class);

    Assertions.assertSame(foo1, foo2);
  }

}
