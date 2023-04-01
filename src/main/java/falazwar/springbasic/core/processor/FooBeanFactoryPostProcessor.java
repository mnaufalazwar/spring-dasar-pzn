package falazwar.springbasic.core.processor;

import falazwar.springbasic.core.data.Foo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

//case ini akan sangat jarang,
//untuk registrasi bean secara programmatic langsung ketika create application context
@Component
public class FooBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
  @Override
  public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
    GenericBeanDefinition definition = new GenericBeanDefinition();
    definition.setScope("singleton");
    definition.setBeanClass(Foo.class);

    registry.registerBeanDefinition("foo", definition);
  }

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    //nothing
  }
}
