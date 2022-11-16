package com.ana.practicing;

import java.util.Scanner;

public class QuadradoECubo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){

            int x = i;
            int y = i * i;
            int z = i * i * i;

            System.out.printf("%d %d %d%n", x, y, z);
        }
    }
}
