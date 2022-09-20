package com.ana;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n;
        double media;

        System.out.println("Quantidade de alunos:");
        n = scanner.nextInt();

        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite nome: ");
            scanner.nextLine();
            nomes[i] = scanner.nextLine();
            System.out.println("Digite a primeira nota: ");
            notas1[i] = scanner.nextDouble();
            System.out.println("Digite a segunda nota: ");
            notas2[i] = scanner.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++){
            media = (notas1[i] + notas2[i]) /2;

            if (media >= 6.0){
                System.out.println(nomes[i]);
            }
        }
    }
}
