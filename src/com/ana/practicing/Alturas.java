package com.ana.practicing;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas: ");
        int n = Integer.parseInt(scanner.nextLine());

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];


        double soma = 0;
        double media = 0;
        double menores = 0;

        for (int i = 0; i < n; i++){
            System.out.println("Nome: ");
            nomes[i] = scanner.nextLine();

            System.out.println("Idade: ");
            idades[i] = Integer.parseInt(scanner.nextLine());

            System.out.println("Altura: ");
            alturas[i] = Double.parseDouble(scanner.nextLine());
        }

        for (int i = 0; i < n; i++){

            soma = soma + alturas[i];
            media = soma/n;
        }
        System.out.println("Altura média: "+media);

        for (int i = 0; i < n; i++){
            if (idades[i] < 16){
              menores++;
            }
        }
            menores /= n;

        System.out.println("Pessoas com menos de 16 anos: "+menores);
        for (int i = 0; i < n; i++){
           if (idades[i] < 16){
               System.out.println(nomes[i]);
           }
        }

    }
}

