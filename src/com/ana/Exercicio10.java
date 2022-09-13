package com.ana;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Número: ");
            int num = scanner.nextInt();

            total = total + num;
        }

        System.out.println("Total = "+total);
    }
}
