package falazwar.springbasic.core.configuration;

import falazwar.springbasic.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class FooConfiguration {

  @Bean
  public Foo foo(){
    log.info("crate foo");
    return new Foo();
  }
}
