import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Questao2 {
      public static void main(String[] args) throws FileNotFoundException{
          Scanner scann = new Scanner(System.in);
          String origem;
          String destino;
          System.out.println("Digite o nome do arquivo origem:");
          origem = scann.nextLine();
          System.out.println("\n");
          
          System.out.println("Digite o nome do arquivo destino:");
          destino = scann.nextLine();
          System.out.println("\n");

          InputStream ler_origem = new FileInputStream(origem);
          Scanner text_origem = new Scanner(ler_origem);
          
          PrintStream ps = new PrintStream(destino);

          while (text_origem.hasNextLine()){
            if (text_origem.hasNextLine()){
              ps.println(text_origem.nextLine());
            }
          }
          
          ps.close();
          text_origem.close();
          scann.close();
      }
      
}
