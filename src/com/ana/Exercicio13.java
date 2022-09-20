package com.ana;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String strings = "";

        System.out.println("Digite um número: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<n; i++){
            System.out.println("Agora digite suas strings: ");
            String x = scanner.nextLine();
            strings += x;
        }
        System.out.println(strings);
    }
}
