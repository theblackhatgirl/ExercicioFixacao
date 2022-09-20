package com.ana;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double maior = Double.NEGATIVE_INFINITY;
        int posicao = -1;

        System.out.println("Quantos números você vai digitar? ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            double x = scanner.nextDouble();
            numbers[i] = x;
        }

        for (int i = 0; i < n; i++){
            if(numbers[i] > maior){
                maior = numbers[i];
                posicao = i;
            }
        }

        System.out.println("Maior valor: "+maior);
        System.out.println("Posição do valor maior: "+posicao);
    }
}
