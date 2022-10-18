package com.ana;

import java.util.Scanner;

public class Inteiros {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] inteiros = new int[6];

        inteiros[0] = 7;
        inteiros[1] = 2;
        inteiros[2] = 3;
        inteiros[3] = 9;
        inteiros[4] = 8;
        inteiros[5] = 11;

        for (int i = 0; i < inteiros.length; i++){
            inteiros[i] += 5;
            System.out.println(inteiros[i]);

        }
    }
}
