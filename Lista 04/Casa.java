public class Casa {

  private int numero;
  private String endereco;

  public Casa() {}

  public Casa(int numero, String endereco) {
    this.numero = numero;
    this.endereco = endereco;
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


  @Override
  public String toString(){
    return "Casa [Endereco = " + endereco + ", Numero = " + numero + "]";
  }
}