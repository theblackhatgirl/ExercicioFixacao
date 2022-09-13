package com.ana;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite uma mensagem: ");
        String msg = scanner.nextLine();

        for (int i = 0; i<num; i++){
            System.out.println(msg);
        }
    }
}
