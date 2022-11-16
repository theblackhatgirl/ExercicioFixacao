package com.ana.practicing;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Quantos valores vai ter cada vetor? ");
        n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            a[i] = scanner.nextInt();
        }

        int[] b = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            b[i] = scanner.nextInt();
        }

        int[] c = new int[n];

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < n; i++){
            c[i] = a[i] + b[i];
        }
        for (int i = 0; i < n; i++){
            System.out.println(c[i]);
        }
    }
}
