package com.possible;

public class Carro {
        private int ano;
        private String modelo;
        private double preco;
        private static int rodas;


    public Carro(int ano, String modelo, double preco){
        this.ano = ano;
        this.modelo = modelo;
        this.preco = preco;
        System.out.println("Criando um carro");
    }

    // GETTERS AND SETTERS

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
