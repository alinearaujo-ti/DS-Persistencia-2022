import java.util.List;

/*import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "visitados")
*/
public class Carros {
    

    public Carros() {}

    public Carros(List<Carro> carros){
        this.carros = carros;
    }

    private List<Carro> carros; 

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public List<Carro> getCarros() {
        return carros;
    }
    @Override
    public String toString() {
        return this.carros.toString();
    }

}
