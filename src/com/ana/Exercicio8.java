package com.ana;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = 0; i<num; i+=2){
            System.out.println(i);
        }
    }
}
