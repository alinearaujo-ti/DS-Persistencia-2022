import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class DeserializaXML {
    public static void main(String[] args) throws Exception{
        
        File file = new File("casas.xml");
        XmlMapper XmlMapper = new XmlMapper();
        Casa c = XmlMapper.readValue(file, Casa.class);
        System.out.println(c);
      
    }
}
