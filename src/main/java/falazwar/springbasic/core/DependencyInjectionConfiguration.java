package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Bar;
import falazwar.springbasic.core.data.Foo;
import falazwar.springbasic.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {

  @Primary
  @Bean(name = "fooFirst")
  public Foo foo1(){
    return new Foo();
  }

  @Bean(name = "fooSecond")
  public Foo foo2(){
    return new Foo();
  }

  @Bean
  public Bar bar(){
    return new Bar();
  }

  @Bean
  public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
    return new FooBar(foo, bar);
  }
}
