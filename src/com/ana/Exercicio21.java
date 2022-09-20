package com.ana;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n;
        int pairs = 0;

        System.out.println("Quantos números você vai digitar? ");
        n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um número:");
            int x = scanner.nextInt();

            numbers[i] = x;
        }
        System.out.println("Números pares: ");
        for (int i = 0; i < n; i++){
            if (numbers[i] %2 == 0){
                System.out.println(numbers[i]);
                pairs ++;
            }

        }
        System.out.println("Quantidade de pares: "+pairs);
    }
}
