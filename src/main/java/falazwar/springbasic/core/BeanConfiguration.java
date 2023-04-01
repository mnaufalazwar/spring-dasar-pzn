package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

  @Bean
  public Foo foo(){
    log.info("Membuat foo");
    return new Foo();
  }
}
