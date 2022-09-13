package com.ana;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = 1; i<num; i+=2){
            System.out.println(i);
        }
    }
}
