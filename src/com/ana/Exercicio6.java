package com.ana;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        for (int i = num1; i < num2; i++){
            System.out.println(i);
        }
    }
}
