package falazwar.springbasic.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

  @Test
  void testDatabase(){

    Database database1 = Database.getInstance();
    Database database2 = Database.getInstance();

    Assertions.assertSame(database1, database2);
  }

}
