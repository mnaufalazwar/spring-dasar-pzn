package falazwar.springbasic.core;

import falazwar.springbasic.core.service.MerchantService;
import falazwar.springbasic.core.service.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {

  ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp(){
    applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testInheritance(){
    MerchantService merchantService = applicationContext.getBean(MerchantService.class);
    MerchantServiceImpl merchantService1 = applicationContext.getBean(MerchantServiceImpl.class);

    Assertions.assertSame(merchantService1, merchantService);
  }
}
