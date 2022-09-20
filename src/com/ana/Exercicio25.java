package com.ana;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n;
        int soma = 0;
        int pares = 0;
        double media;

        System.out.println("Quantos números você vai digitar: ");
        n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++){
            if(numbers[i] % 2 == 0){
                soma = soma + numbers[i];
                pares++;
            }
        }

        if(pares == 0){
            System.out.println("Nenhum número par!");
        }
        else{
            media = soma/pares;
            System.out.println("Media dos pares: "+ media);
        }

    }

}
