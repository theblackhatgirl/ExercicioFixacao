package com.ana.taxes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number;
        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++){
            System.out.println("Tax payer #"+ i + " data:");
            System.out.println("Individual or Company (i/c)? ");
            String ic = scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Anual income: ");
            Double income = Double.parseDouble(scanner.nextLine());
            if(ic .equals("i")){
                System.out.println("Health expenditures: ");
                Double health = Double.parseDouble(scanner.nextLine());
                TaxPayer payer = new Individual(health, name, income);
                taxPayers.add(payer);
            }else if(ic.equals("c")){
                System.out.println("Number of employees: ");
                int employees = Integer.parseInt(scanner.nextLine());
                TaxPayer payer = new Company(employees, name, income);
                taxPayers.add(payer);
            }

        }
        Double total = 0d;
        System.out.println("TAXES PAID: ");
        for (TaxPayer payer: taxPayers) {
            System.out.println(payer.getName()+": $ "+payer.tax());
            total = total+ payer.tax();
        }

        System.out.println("TOTAL TAXES: "+total);

    }
}
