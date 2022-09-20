import java.io.File;
import java.io.IOException;

public class Deserializa {
    public static void main(String[] args) throws IOException{

        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);
        Carros carros = om.readValue(new File("carros.json"), Carros.class);
        System.out.println(carros.toString());
    }
}
