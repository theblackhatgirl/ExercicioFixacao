package com.ana.practicing;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= n; i++){
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

    }

}

