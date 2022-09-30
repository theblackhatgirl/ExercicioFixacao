package com.ana;

//Fazer um programa para ler um número inteiro N e
//uma matriz de ordem N(n linhas e n colunas)
//em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz

import java.util.Scanner;

public class ExercicioResolvido {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.println(matriz[i][i] + " ");
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if (matriz[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("Números negativos: "+ count);
    }
}
