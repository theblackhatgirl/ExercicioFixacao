package com.ana.practicing;

import java.util.Scanner;

public class DivisaoImpossivel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){

            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if (y == 0){
                System.out.println("Divisão impossível!");
            }else{
                double divisao = x / y;
                System.out.println(divisao);
            }
        }
    }
}
