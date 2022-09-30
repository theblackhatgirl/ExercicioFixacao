package com.ana.loteria;

import java.util.Scanner;

public class MegaSena {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cartela cartela = new Cartela();
        int[] numeros = new int[6];
        System.out.println("Digite seus números da sorte: ");
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }

        cartela.pintarTodos(numeros);
        cartela.show();

    }
}




