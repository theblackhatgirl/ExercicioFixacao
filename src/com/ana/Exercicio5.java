package com.ana;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++){
            System.out.println(i);
        }
    }
}
