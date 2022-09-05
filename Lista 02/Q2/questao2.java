package Q2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class questao2 {
  
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do primeiro arquivo:");
        String arquivo1 = scanner.nextLine();
        System.out.println("Qual o nome do segundo arquivo:");
        String arquivo2 = scanner.nextLine();
        System.out.println("Qual o nome do terceiro arquivo:");
        String arquivo3 = scanner.nextLine();

        InputStream ler_arquivo1 = new FileInputStream(arquivo1);
        InputStream ler_arquivo2 = new FileInputStream(arquivo2);

        Scanner texto1 = new Scanner(ler_arquivo1);
        Scanner texto2 = new Scanner(ler_arquivo2);

        PrintStream printa = new PrintStream(arquivo3);

        while(texto1.hasNextLine() || texto2.hasNextLine()){
            if (texto1.hasNextLine()) {
              printa.println(texto1.nextLine());
            } else {
              printa.println(texto2.nextLine());
            }
        }

        texto1.close();
        texto2.close();
        printa.close();
        scanner.close();        
    }
}
