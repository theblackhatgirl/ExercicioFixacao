package com.ana;

import java.util.Scanner;

public class Exercicio18 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int n;

            System.out.print("Quantos números voce vai digitar? ");
            n = scanner.nextInt();

            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Digite um número: ");
                numbers[i] = scanner.nextInt();
            }

            System.out.println("Números negativos:");

            for (int i=0; i<n; i++) {
                if (numbers[i] < 0) {
                    System.out.println((numbers[i]));
                }
            }
        }
    }

