package com.ana;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Terceiro número: ");
        int num3 = scanner.nextInt();

        for (int i = num1; i<num2; i+=num3){
            System.out.println(i);
        }
    }
}
