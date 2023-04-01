package falazwar.springbasic.core.service;

import falazwar.springbasic.core.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

  @Getter
  private CustomerRepository normalCustomerRepository;

  @Getter
  private CustomerRepository premiumCustomerRepository;

  @Autowired
  public CustomerService(
      @Qualifier("normalCustomerRepository") CustomerRepository normalCustomerRepository,
      @Qualifier("premiumCustomerRepository") CustomerRepository premiumCustomerRepository) {
    this.normalCustomerRepository = normalCustomerRepository;
    this.premiumCustomerRepository = premiumCustomerRepository;
  }
}
