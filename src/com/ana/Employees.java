package com.ana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employees {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Quantos funcionários serão registrados? ");
        n = Integer.parseInt(scanner.nextLine());

        List<Funcionario> funcionarioList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario #" + (i+1) + ": ");
            System.out.println("ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Salario: ");
            double salario = Double.parseDouble(scanner.nextLine());

            Funcionario funcionario = new Funcionario(id, nome, salario);

            funcionarioList.add(funcionario);
        }
        System.out.println("Entre com o id do funcionário que receberá aumento de salário: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o número da porcentagem do aumento: ");
        double x = Double.parseDouble(scanner.nextLine());

        Funcionario funcionario = funcionarioList.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
        funcionario.aumentarSalario(x);

        for (Funcionario f : funcionarioList){
            System.out.println(f);
        }

    }




    static class Funcionario{
        private int id;
        private String nome;
        private double salario;

        public Funcionario(int id, String nome, double salario){
            this.id = id;
            this.nome = nome;
            this.salario = salario;
        }
        public int getId(){return id;}
        public String getNome(){return nome;}
        public double getSalario(){return salario;}
        public void aumentarSalario(double x){
            salario = x/100.0*salario+salario;
        }
        @Override
        public String toString(){
            return id+", "+nome+", "+salario;
        }
    }
}
