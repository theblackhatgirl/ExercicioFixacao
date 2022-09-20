package com.ana;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n;
        double soma = 0;
        double media;

        System.out.println("Quantos elementos vai ter o vetor? ");
        n = scanner.nextInt();

        double[] amount = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
                amount[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++){
            soma = soma + amount[i];
        }

        media = soma/n;

        System.out.println("Media = "+media);

        System.out.println("Elementos abaixo da media: ");

        for (int i = 0; i < n; i++){
            if(amount[i] < media){
                System.out.println(amount[i]);
            }
        }

    }
}
