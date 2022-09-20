package com.ana;

import java.util.Random;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[]args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String nomes[] = new String[10];
        nomes[0] = scanner.nextLine();
        nomes[1] = scanner.nextLine();
        nomes[2] = scanner.nextLine();
        nomes[3] = scanner.nextLine();
        nomes[4] = scanner.nextLine();
        nomes[5] = scanner.nextLine();
        nomes[6] = scanner.nextLine();
        nomes[7] = scanner.nextLine();
        nomes[8] = scanner.nextLine();
        nomes[9] = scanner.nextLine();

        int index = random.nextInt(10);
        System.out.println(nomes[index]);
    }
}
