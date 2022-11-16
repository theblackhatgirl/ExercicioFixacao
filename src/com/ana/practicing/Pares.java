package com.ana.practicing;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, pares;

        System.out.print("Quantos números voce vai digitar? ");
        n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números pares:");

        pares = 0;
        for (int i=0; i<n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(" "+vetor[i]);
                pares++;
            }
        }

        System.out.println("Quantidade de pares: "+pares);
    }
}
