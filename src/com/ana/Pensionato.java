package com.ana;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Quantos quartos serão alugados? ");
        n = Integer.parseInt(scanner.nextLine());

        Estudante[] pensionato = new Estudante[10];

        for (int i = 0; i < n; i++){
            System.out.println("Rent #"+(i+1)+": ");
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.nextLine();
            System.out.println("Qual será o número do quarto?");
            int quarto = Integer.parseInt(scanner.nextLine());

            Estudante estudante = new Estudante(nome, email);
            pensionato[quarto] = estudante;
        }
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++){
            if (pensionato[i] != null){
                System.out.println(i+" "+pensionato[i].getNome()+" "+pensionato[i].getEmail());
            }
        }

    }

    static class Estudante{
        private String nome;
        private String email;

        public Estudante(String nome, String email){
            this.nome = nome;
            this.email = email;
        }
        public String getNome(){return nome;}
        public String getEmail(){return email;}

    }
}
