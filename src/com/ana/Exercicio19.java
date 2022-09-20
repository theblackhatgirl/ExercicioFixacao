package com.ana;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n;
        int soma = 0;
        double media = 0;

        System.out.println("Quantos números você quer digitar? ");
        n = scanner.nextInt();

        double[] numbers = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite um número:");
            numbers[i] = scanner.nextDouble();
        }
        System.out.print("Valores: ");

        for (int i = 0; i < n; i++){
            System.out.println(" "+numbers[i]);
            soma += numbers[i];
        }
        media = soma/n;
        System.out.println("Soma: "+soma);
        System.out.println("Média: "+media);
    }
}
