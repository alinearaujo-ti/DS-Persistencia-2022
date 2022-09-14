import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class SerializaXML {
  public static void main (String []args) throws IOException {

    Casa casa1 = new Casa("Rua do M", 112);
    Casa casa2 = new Casa("Rua Augusta", 952);

    List<Casa> lista = new ArrayList<Casa>();

    lista.add(casa1);
    lista.add(casa2);
    Casas casa = new Casas(lista);
    File file = new File("casas.xml");

    XmlMapper xml = new XmlMapper();
    xml.enable(SerializationFeature.INDENT_OUTPUT);
    xml.writeValue(file, casas);
  }
}
