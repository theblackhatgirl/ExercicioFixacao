package com.ana;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        System.out.println("Informe quantos números você quer digitar: ");
        int n = scanner.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.println("Agora digite-os: ");
            int x = scanner.nextInt();
            total += x;
        }
        int media = total/n;
        System.out.println(media);
    }
}
