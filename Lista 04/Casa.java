import java.io.Serializable;

public class Casa implements Serializable {

  private int numero;
  private String endereco;
  private String modelo;
  private String dono;

  public Casa(int numero, String endereco, String modelo, String dono) {
    this.numero = numero;
    this.endereco = endereco;
    this.modelo = modelo;
    this.dono = dono;
  }

  public Casa() {
  }

  public String getEndereco(String endereco){
    return endereco;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }
  
  public int getNumero(){
    return numero;
  }

  public void setNumero (int numero){
    this.numero = numero;
  }

  public String getModelo(String modelo){
    return modelo;
  }

  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public String getDono(String dono){
    return dono;
  }

  public void setDono(String dono){
    this.dono = dono;
  }

  public String toString(){
    return "Casa [Endereco = " + endereco + ", Numero = " + numero + ", Modelo = " + modelo + ", Nome do dono = " + dono + "]";
  }
}