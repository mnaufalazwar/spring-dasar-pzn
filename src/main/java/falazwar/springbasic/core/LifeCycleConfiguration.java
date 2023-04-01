package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Connection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

  @Bean
  public Connection connection(){
    return new Connection();
  }
}
