package falazwar.springbasic.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ={
    "falazwar.springbasic.core.service",
    "falazwar.springbasic.core.configuration",
    "falazwar.springbasic.core.repository"
})
public class ComponentConfiguration {
}
