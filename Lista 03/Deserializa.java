import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializa {
    public static void main(String[] args) throws IOException{
        Casa c = null;

        try {
          FileInputStream fileIn = new FileInputStream("C:\\Users\\aline\\Documents\\DEV\\DS-Persistencia-2022\\Lista 03\\auxiliar.txt");
          ObjectInputStream in = new ObjectInputStream(fileIn);
          c = (Casa) in.readObject();
          in.close();
          fileIn.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
        System.out.println(c);
      
    }
}
