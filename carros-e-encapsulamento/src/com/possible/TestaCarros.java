package com.possible;

public class TestaCarros {

    public static void main(String[] args) {

        Carro carro1 = new Carro(1987, "Ford" ,1300);
        System.out.println("O ano do carro 1 é " + carro1.getAno());
        System.out.println("O preço do carro 1 é " + carro1.getPreco());
        System.out.println("O modelo do carro 1 é " + carro1.getModelo());


    }

}
