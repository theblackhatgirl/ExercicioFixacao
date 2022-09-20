package com.ana;

import java.util.Random;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[]args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        int index = random.nextInt(10);

        for (int i = 0; i < 10; i++){
            nomes[i] = scanner.nextLine();
        }
        System.out.println(nomes[index]);
    }
}
