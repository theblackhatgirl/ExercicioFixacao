package com.ana;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();

        int[] A = new int[n];
        int [] B = new int[n];
        int[] C = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++){
            int x = scanner.nextInt();
            A[i] = x;
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++){
            int x = scanner.nextInt();
            B[i] = x;
        }
        for (int i = 0; i < n; i++){
            C[i] = A[i] + B[i];
        }
        System.out.println("Vetor resultante: ");
        for (int i = 0; i < n; i++){
            System.out.println(C[i]);
        }


    }
}
