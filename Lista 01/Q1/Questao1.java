import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner scann = new Scanner(System.in);
          String origem;
          String stringn1;
          String stringn2;
          int n1;
          int n2;
          System.out.println("Digite o nome do arquivo origem:");
          origem = scann.nextLine();
          
          System.out.println("Digite o n1:");
          stringn1 = scann.nextLine();

          System.out.println("Digite o n2:");
          stringn2 = scann.nextLine();

          try{
            n1 = Integer.parseInt(stringn1);

          }catch(Exception e){
            n1 = 1;
          }

          try{
            n2 = Integer.parseInt(stringn2);

          }catch(Exception e){
            n2 = 1;
          }

          InputStream ler_origem = new FileInputStream(origem);
          Scanner text_origem = new Scanner(ler_origem);
          int i = 0;
          while (text_origem.hasNextLine()){
            i++;
            text_origem.nextLine();
          }

          i = n2 > 1 ? n2: i;
          text_origem.close();
          ler_origem.close();
          InputStream ler_origem2 = new FileInputStream(origem);
          Scanner text_origem2 = new Scanner(ler_origem2);
          
          for(int j = 1; j <= i; j++){
            if((j >= n1)){
                System.out.println(text_origem2.nextLine());
            }else{
                text_origem2.nextLine();
                
            }
      
          }
        
    }
}
