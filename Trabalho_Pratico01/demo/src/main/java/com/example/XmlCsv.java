package com.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class XmlCsv {
    List<Carro> carros;

    public XmlCsv(){
        this.carros = new ArrayList<>();
    }
    String linha;
    public void converte() throws IOException{
        InputStream iS = new FileInputStream("Carros.csv");
        InputStreamReader isR = new InputStreamReader(iS);
        BufferedReader bfR = new BufferedReader(isR);
        
        while((linha = bfR.readLine()) != null){
            String[] temp = linha.split(",");
            carros.add(new Carro(temp[0], temp[1], temp[2], temp[3]));
        }

        ObjectMapper om = new ObjectMapper();
        om.writeValue(new FileOutputStream("Carros.json"), carros);
        XmlMapper xm = new XmlMapper();
        xm.writeValue(new FileOutputStream("Carros.xml"), carros);
        iS.close();
        isR.close();
        bfR.close();
    }

    public static void main(String[] args) throws IOException{
        XmlCsv xC = new XmlCsv();
        xC.converte();
    }
        
        

       
}