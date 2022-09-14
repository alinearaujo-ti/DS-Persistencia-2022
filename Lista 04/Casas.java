import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "visitados")

public class Casas {
    private List<Casa> casas; 

    public Casas() {}

    public Casas(List<Casa> casas){
        this.casas = casas;
    }

    @JacksonXmlElementWrapper(localName = "casas")
    @JacksonXmlProperty(localName = "casa")

    public List<Casa> getCasas() {
        return casas;
    }

    public void setCasas(List<Casa> casas) {
        this.casas = casas;
    }

    @Override
    public String toString() {
        return this.casas.toString();
    }

}
