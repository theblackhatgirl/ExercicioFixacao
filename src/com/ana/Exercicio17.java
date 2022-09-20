package com.ana;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("Informe quantos nomes você quer digitar: ");
        x = Integer.parseInt(scanner.nextLine());

        String nomes[] = new String[x];

        for (int i = 0; i<x; i++){
            System.out.println("Digitar nome: ");
            nomes[i] = scanner.nextLine();
        }
        for (int i = 0; i<x; i++){
            System.out.println(nomes[i]);
        }
        System.out.println("Digite o número que corresponde ao nome que você quer: ");
        int num = scanner.nextInt();

        System.out.println(nomes[num]);

    }
}
