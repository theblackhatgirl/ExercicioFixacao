package com.ana.practicing;

import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n;
        double media;

        System.out.print("Quantos alunos serao digitados? ");
        n = scanner.nextInt();

        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i + 1);
            scanner.nextLine();
            nomes[i] = scanner.nextLine();
            notas1[i] = scanner.nextDouble();
            notas2[i] = scanner.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for (int i=0; i<n; i++) {
            media = (notas1[i] + notas2[i]) / 2;

            if(media >= 6.0) {
                System.out.printf(nomes[i]);
            }
        }


    }
}
}