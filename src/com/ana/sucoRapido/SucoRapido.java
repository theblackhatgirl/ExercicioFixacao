package com.ana.sucoRapido;

import java.util.Scanner;

public class SucoRapido {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String p = "p";
        String m = "m";
        String g = "g";
        int sabor;
        String tamanho;
        String acucar;
        String gelo;
        int quant;
        double total = 0;
        String[] sabores = {"Laranja","Morango","Maracuja","Limão","Uva", "Acerola"};


        System.out.println("*Suco Rápido*");
        System.out.println();
        System.out.println("Tamanhos: ");
        System.out.println("P: R$8,00");
        System.out.println("M: R$9,00");
        System.out.println("G: R$10,00");
        System.out.println();

        System.out.println("*Sabores*");
        System.out.println("[1] Laranja");
        System.out.println("[2] Morango");
        System.out.println("[3] Maracuja");
        System.out.println("[4] Limão");
        System.out.println("[5] Uva");
        System.out.println("[6] Acerola");
        System.out.println();

        System.out.println("Qual é o sabor escolhido?");
        sabor = Integer.parseInt(scanner.nextLine());
        System.out.println("Qual o tamanho?");
        tamanho = scanner.nextLine();
        System.out.println("Açucar?");
        acucar = scanner.nextLine();
        System.out.println("Gelo?");
        gelo = scanner.nextLine();
        System.out.println("Quantos iguais a esse?");
        quant = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        if (tamanho.equals(p)){
            total = 8.00*quant;
        }if (tamanho.equals(m)){
            total = 9.00*quant;
        }if(tamanho.equals(g)){
            total = 10.00*quant;
        }

        System.out.println("Pedido: ");
        System.out.print("Qnt: "+quant+" "+"Sabor: "+sabores[sabor -1]+" "+"Tamanho: "+tamanho+" "+"Açucar?"+acucar+" "+"Gelo?"+gelo+" "+"Total:"+total);





    }
}
