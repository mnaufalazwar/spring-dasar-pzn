package falazwar.springbasic.core.application;

import falazwar.springbasic.core.data.Bar;
import falazwar.springbasic.core.data.Foo;
import falazwar.springbasic.core.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

//@SpringBootApplication //annotation ini sudah termasuk @configuration
//public class FooApplication {
//
//  @Bean
//  public Foo foo(){
//    return new Foo();
//  }
//
////  public static void main(String[] args) {
////    ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
////
////    Foo foo = applicationContext.getBean(Foo.class);
////    System.out.println(foo);
////  }
//
//  //customizing spring application -> misal nambahin listener untuk spring boot event
//  public static void main(String[] args) {
//    SpringApplication application = new SpringApplication(FooApplication.class);
//    application.setBannerMode(Banner.Mode.OFF);
//
//    application.setListeners(
//        List.of(new AppStartingListener())
//    );
//
//    ConfigurableApplicationContext applicationContext = application.run(args);
//
//    Foo foo = applicationContext.getBean(Foo.class);
//    System.out.println("foo : " + foo);
//  }
//}
