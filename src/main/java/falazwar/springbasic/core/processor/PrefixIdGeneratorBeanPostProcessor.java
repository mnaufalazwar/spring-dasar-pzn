package falazwar.springbasic.core.processor;

import falazwar.springbasic.core.aware.BikeAware;
import falazwar.springbasic.core.aware.IdAware;
import falazwar.springbasic.core.data.Bike;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    log.info("id prefix log for Bean {} ", beanName);
    if(bean instanceof IdAware){
      log.info("set id prefix for instance of IdAware for Bean {} ", beanName);
      IdAware idAware = (IdAware) bean;
      idAware.setId("prefixn - " + idAware.getId());
    } else {
      log.info("set id prefix for instance of not IdAware for Bean {} ", beanName);
//      BikeAware bike = (BikeAware) bean;
//      bike.setId("prefixnotaware - " + bike.getId());
    }

    return bean;
  }

  @Override
  public int getOrder() {
    return 2;
  }
}
