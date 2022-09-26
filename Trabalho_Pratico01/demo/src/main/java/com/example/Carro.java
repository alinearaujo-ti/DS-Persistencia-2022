package com.example;

import java.io.Serializable;

public class Carro  implements Serializable{
    private String ano;
    private String placa;
    private String marca;
    private String dono;

    public Carro(String ano, String placa, String marca, String dono) {
        this.ano = ano;
        this.placa = placa;
        this.marca = marca;
        this.dono = dono;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    
    @Override
    public String toString() {
        return "Carro: ano=" + ano + ", placa=" + placa + ", marca=" + marca + ", dono=" + dono;
    }
}