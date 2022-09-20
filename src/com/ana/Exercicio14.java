package com.ana;

import java.util.Random;

public class Exercicio14 {
    public static void main(String[] args){
        Random random = new Random();

        String nomes[] = new String[10];
        nomes[0] = "ana";
        nomes[1] = "luan";
        nomes[2] = "sandra";
        nomes[3] = "lucas";
        nomes[4] = "amabile";
        nomes[5] = "lucindo";
        nomes[6] = "jacky";
        nomes[7] = "sofia";
        nomes[8] = "zeh";
        nomes[9] = "rocha";

        int index = random.nextInt(10);
        System.out.println(nomes[index]);
    }
}
