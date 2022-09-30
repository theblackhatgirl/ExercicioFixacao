package com.ana;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[][] matriz = new String[10][10];

        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz.length; c++){
                matriz[l][c] = "  ";
            }
        }

        System.out.println("Digite um número: ");
        int x = scanner.nextInt();
        System.out.println("Digite mais um número:" );
        int y = scanner.nextInt();

        matriz[x][y] = "*";

        for (int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]);
            }
        }

    }
}
