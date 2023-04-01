package falazwar.springbasic.core.service;

import falazwar.springbasic.core.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

  @Getter
  private ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository){
    this.productRepository = productRepository;
  }

  public ProductService(ProductRepository productRepository, String name){
    this.productRepository = productRepository;
  }
}
