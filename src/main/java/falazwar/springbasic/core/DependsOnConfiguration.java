package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Bar;
import falazwar.springbasic.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {

  @Lazy
  @Bean
  @DependsOn({
      "bar"
  })
  public Foo foo(){
    log.info("FOOOOOO");
    return new Foo();
  }

  @Bean
  public Bar bar(){
    log.info("BARRRRRR");
    return new Bar();
  }

}
