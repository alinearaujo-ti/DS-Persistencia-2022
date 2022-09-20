
public class Carro {

  private int ano;
  private String placa;
  private String modelo;
  private String marca;

  public Carro(int ano, String placa, String modelo, String marca) {
    this.ano = ano;
    this.placa = placa;
    this.modelo = modelo;
    this.marca = marca;
  }

  public Carro() {
  }

  public String getPlaca(String placa){
    return placa;
  }

  public void setPlaca(String placa){
    this.placa = placa;
  }
  
  public int getAno(){
    return ano;
  }

  public void setAno (int ano){
    this.ano = ano;
  }

  public String getModelo(String modelo){
    return modelo;
  }

  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public String getMarca(String marca){
    return marca;
  }

  public void setMarca(String marca){
    this.marca = marca;
  }

  public String toString(){
    return "Carro [Placa = " + placa + ", Ano = " + ano + ", Modelo = " + modelo + ", Marca = " + marca + "]";
  }
}