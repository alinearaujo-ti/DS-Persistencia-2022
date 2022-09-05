import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializa {
    public static void main (String []args) throws IOException {
      Casa casa = new Casa();
      casa.setEndereco("Rua do Magisterio");
      casa.setNumero(112);
      casa.setModelo("Casa terrea");
      casa.setDono("Aline Araujo");
      
    try{
        FileOutputStream fileOut = new FileOutputStream ("C:\\Users\\aline\\Documents\\DEV\\DS-Persistencia-2022\\Lista 03\\auxiliar.txt");
        ObjectOutputStream out = new ObjectOutputStream (fileOut);
        out.writeObject(casa);
        out.close();
        fileOut.close();

        System.out.printf("Serializado");
    
      }catch(IOException i) {
        i.printStackTrace();
    }
  }
}
