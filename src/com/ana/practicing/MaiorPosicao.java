package com.ana.practicing;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int posicao;
        double maior;

        System.out.println("Quantos números você vai digitar? ");
        n = scanner.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextDouble();
        }
        maior = 0;
        posicao = 0;

        for (int i = 0; i < n; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
                posicao = i;
            }
        }
        System.out.println("Maior número: "+maior);
        System.out.println("Posição do maior número: "+posicao);
    }
}
