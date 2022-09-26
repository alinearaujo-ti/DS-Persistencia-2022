package com.example;
import java.io.*;
import java.util.*;

public class Cadastrar{
    public void dados(Carro car) throws IOException{
        FileWriter fileWriter = new FileWriter("Carros.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.println(car.getAno() + "," + car.getPlaca() + "," + car.getMarca() + "," + car.getDono());
        printWriter.flush();
        fileWriter.close();
        bufferedWriter.close();
        printWriter.close();

    }

    public static void main(String[] args) throws IOException{
        Cadastrar cadastrar = new Cadastrar();
        Scanner scanner = new Scanner(System.in);
        String ano, placa, marca, dono;
        System.out.println("Digite o ano do carro: ");
        ano = scanner.nextLine();
        System.out.println("Digite a placa do carro: ");
        placa = scanner.nextLine();
        System.out.println("Digite a marca do carro: ");
        marca = scanner.nextLine();
        System.out.println("Digite o nome do dono do carro: ");
        dono = scanner.nextLine();

        cadastrar.dados(new Carro(ano, placa, marca, dono));

        scanner.close();
    }
}
    