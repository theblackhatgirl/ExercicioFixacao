package com.ana;
import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("1- Alcool");
        System.out.println("2- Gasolina");
        System.out.println("3- Diesel");
        System.out.println("4- Fim");
        codigo = scanner.nextInt();

        while(codigo != 4){
            switch (codigo) {
                case 1 -> alcool++;
                case 2 -> gasolina++;
                case 3 -> diesel++;
                default -> System.out.println("Código inválido!");
            }
            System.out.println("Código:");
            codigo = scanner.nextInt();
        }
        System.out.println("Muito obrigado!");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
}
