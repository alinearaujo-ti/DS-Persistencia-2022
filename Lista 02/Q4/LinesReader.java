package Q4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Scanner;

public class LinesReader {
    public static void main(String[] args){
      System.out.println(args[0]);
      Properties prop = new Properties(); 
      InputStream inStream = null;
      File file = null;
      FileReader fileReader = null;
      BufferedReader bufferReader = null;

      try {
        inStream = LinesReader.class.getClassLoader().getResourceAsStream("config.properties");
        file = new File(args[0]);
        fileReader = new FileReader(file);

        props.load(inStream);

        String sLinhaInicial = props.getProperty("linha_inicial", "1");
        String sLinhaFinal = props.getProperty("linha_final", "1");

        int linhainicial = Integer.parseInt(sLinhaInicial);
        int linhafinal = Integer.parseInt(sLinhaFinal);

        BufferedReader = new BufferedReader(fileReader);

        if(linhafinal < 0){
          bufferReader.lines().skip(linhainicial - 1).forEach(l -> System.out.print(l));
        }else{
          bufferReader.lines().limit(linhafinal - 1).skip(linhainicial - 1).forEach(l -> System.out.println(l));
        }
        
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }catch (IOException e){
        e.printStackTrace();
      }finally{
        try{
          inStream.close();
          fileReader.close();
          bufferReader.close();
        }catch(IOException e){
          e.printStackTrace();
        }
      }

      
}
