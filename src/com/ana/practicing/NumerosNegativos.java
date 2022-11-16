package com.ana.practicing;

import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numeros = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (numeros[i] <0){
                System.out.println("Números negativos: " + numeros[i]);
            }
        }
    }

}
