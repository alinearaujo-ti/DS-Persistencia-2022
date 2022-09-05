package Q4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class criarConfig {
  public static void main(String[] args) {
    Properties prop = new Properties();
    try{
      prop.setProperty("linha_inicial", "1");
      prop.setProperty("linha_final", "3");
      prop.store(new FileOutputStream("config.properties"), null);
    }
    catch(final IOException ex) {   
      ex.printStackTrace ();
    }
  }
}
