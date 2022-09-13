package com.ana;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite um número: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite um número: ");
        int num3 = scanner.nextInt();

        for (int i = num1; i <num2; i+=num3){
           total = total + i;
        }
        System.out.println("Total: "+total);
    }

}
