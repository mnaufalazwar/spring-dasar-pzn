package falazwar.springbasic.core.service;

import falazwar.springbasic.core.repository.CategoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryService {

  @Getter
  private CategoryRepository categoryRepository;

  @Autowired
  public void setCategoryRepository(CategoryRepository categoryRepository){
    this.categoryRepository = categoryRepository;
  }
}
