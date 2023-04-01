package falazwar.springbasic.core;

import falazwar.springbasic.core.data.Foo;
import falazwar.springbasic.core.repository.CategoryRepository;
import falazwar.springbasic.core.repository.CustomerRepository;
import falazwar.springbasic.core.repository.ProductRepository;
import falazwar.springbasic.core.service.CategoryService;
import falazwar.springbasic.core.service.CustomerService;
import falazwar.springbasic.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

  ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
  }

  @Test
  void test(){
    Foo foo = applicationContext.getBean(Foo.class);
    ProductService productService = applicationContext.getBean(ProductService.class);
  }

  @Test
  void testConstructorDI(){
    ProductService productService = applicationContext.getBean(ProductService.class);
    ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

    Assertions.assertSame(productRepository, productService.getProductRepository());
  }

  @Test
  void testSetterDI(){
    CategoryService categoryService = applicationContext.getBean("categoryService", CategoryService.class);
    CategoryRepository categoryRepository = applicationContext.getBean("categoryRepository", CategoryRepository.class);

    Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
  }

//  @Test
//  void testFieldDI(){
//    CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
//    CustomerRepository customerRepository = applicationContext.getBean("customerRepository", CustomerRepository.class);
//
//    Assertions.assertSame(customerRepository, customerService.getCustomerRepository());
//  }

  @Test
  void testFieldDI(){
    CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
    CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository", CustomerRepository.class);
    CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository", CustomerRepository.class);

    Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
    Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
  }
}
