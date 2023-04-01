package falazwar.springbasic.core.processor;

import falazwar.springbasic.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    log.info("id generator log for Bean {} ", beanName);
    if(bean instanceof IdAware){
      log.info("set id generator for instance of IdAware for Bean {} ", beanName);
      IdAware idAware = (IdAware) bean;
      idAware.setId(UUID.randomUUID().toString());
    }

    return bean;
  }

  @Override
  public int getOrder() {
    return 1;
  }
}
