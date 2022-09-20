import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializa {
    public static void main (String []args) throws JsonProcessingException {
      
      Carro car1 = new Carro(2010, "PJL552", "Gol", "Fiat");
      Carro car2 = new Carro(2020, "ABC895", "Fox", "Fiat");
      Carro car3 = new Carro(2022, "PTT131", "Corolla", "Fiat");

      List<Carro> lista = new ArrayList<Carro>();
      lista.add(car1);
      lista.add(car2);
      lista.add(car3);
      
      Carros carros = new Carros(lista);
    
    
      try{
        ObjectMapper json = new ObjectMapper();
        json.writeWithDefaultPrettyPrinter().writeValue(new File("carros.json"), carros);

        System.out.printf("OK");
    
      }catch(IOException i) {
        i.printStackTrace();
    }
  }
}
