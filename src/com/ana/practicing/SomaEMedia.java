package com.ana.practicing;

import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        System.out.println("Quantos números você vai digitar?");
        int n = scanner.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextDouble();
        }
        System.out.print("Valores: ");
        for (int i = 0; i < n; i++){
            System.out.print(" "+numeros[i]);

            soma = soma + numeros[i];
            media = soma/n;
        }
        System.out.println();
        System.out.println("Soma =  "+soma);
        System.out.println("Média = "+media);


    }
}
