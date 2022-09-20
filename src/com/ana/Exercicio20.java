package com.ana;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("quantas pessoas serao digitadas?");
        int n = Integer.parseInt(scanner.nextLine());

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Altura: ");
            double altura = Double.parseDouble(scanner.nextLine());

            Pessoa pessoa = new Pessoa(nome, idade, altura);

            pessoas[i] = pessoa;
        }

        double somaAlturas = 0;
        int quantidadeMenos16 = 0;
        for (int i = 0; i < n; i++) {
            somaAlturas += pessoas[i].getAltura();

            if(pessoas[i].getIdade() < 16) {
                quantidadeMenos16++;
            }
        }

        System.out.println("Altura media: " + somaAlturas/n);
        System.out.printf("Pessoas com menos de 16 anos: %.2f", (quantidadeMenos16/100.0*n));

        for (int i = 0; i < n; i++){
            if(pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getNome());
            }
        }
    }

    static class Pessoa {
        private String nome;
        private int idade;
        private double altura;

        public Pessoa(String nome, int idade, double altura){
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
        }

        public String getNome(){
            return nome;
        }

        public int getIdade(){
            return idade;
        }

        public double getAltura() {
            return altura;
        }
    }
}
