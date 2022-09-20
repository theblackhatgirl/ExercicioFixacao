package com.ana;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n;
        int homens = 0;
        int mulheres= 0;
        double menor = 0;
        double maior = 0;
        double media = 0;
        double total = 0;

        System.out.println("Quantidade de pessoas: ");
        n = scanner.nextInt();

        double[] alturas = new double[n];
        String[] generos = new String[n];

        for (int i = 0; i < n; i++){
            System.out.println("Altura:");
            alturas[i] = scanner.nextDouble();
            System.out.println("Gênero: ");
            scanner.nextLine();
            generos[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++){
            if(alturas[i] > maior){
                maior = alturas[i];
            }
            if (alturas[i] < menor){
                menor = alturas[i];
            }
        }
        for (int i = 0; i < n; i++){
            if (generos[i] == "M"){
                homens++;
            }
            else{
                mulheres++;
                total = total + alturas[i];
            }
        }
        media = total / mulheres;

        System.out.println("Menor altura: "+menor);
        System.out.println("Maior altura: "+maior);
        System.out.println("Média das alturas das mulheres: ");
        System.out.println("Quantidade de homens"+homens);
    }
}
