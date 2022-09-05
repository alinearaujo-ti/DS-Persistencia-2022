package Q1;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class questao1 {
  public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo:");
        String Nomearquivo = scan.nextLine(); 
        System.out.println("Digite a substring que deseja encontrar:");
        String substring = scan.nextLine(); 
        // InputStream é um fluxo de entrada para ler bytes
        InputStream arquivo = new FileInputStream(Nomearquivo);
        Scanner leitura = new Scanner(arquivo);

        while (leitura.hasNextLine()) {
            String linha = leitura.nextLine();
            if (linha.contains(substring)) { 
                System.out.println(linha); 
            }
        }
        arquivo.close();
        leitura.close();
        scan.close();
    }
}
