package com.ana;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n;
        int idade = 0;
        int velho = 0;

        System.out.println("Quantidade de pessoas: ");
        n = scanner.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Nome: ");
            nomes[i] = scanner.next();
            System.out.println("Idade: ");
            idades[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++){
            if (idades[i] > idade){
               velho = i;
            }
        }
        System.out.println("Pessoa mais velha: "+nomes[velho]);

    }
}
