package com.ana;

public class Exercicio29 {
    public static void main(String[] args) {

        String[][] matriz = new String[10][10];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                matriz[l][c] = " * ";
            }
        }
        for (int i = 0; i < matriz.length; i++){
            System.out.println();
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]);

            }
        }
    }
}