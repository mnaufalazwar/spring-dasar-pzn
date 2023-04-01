package falazwar.springbasic.core.data;

import falazwar.springbasic.core.aware.BikeAware;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class Bike implements BikeAware {

  @Getter
  private String id = "666";
  @Override
  public void setId(String id) {
    this.id = id;
  }
}
