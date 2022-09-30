package com.ana;

import java.util.Scanner;

public class Exercicio31 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_RED = "\u001B[41m";

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Cadeira[][] cinema = new Cadeira[10][10];

        for(int f = 0; f < cinema.length; f++) {
            for(int n = 0; n < cinema[0].length; n++) {
                cinema[f][n] = new Cadeira(f, n);
            }
        }

        while (true) {
            showCinema(cinema);

            System.out.print("Qual cadeira gostaria de reservar? ");
            String cadeira = scanner.nextLine();

            if(cadeira.equals("sair")) {
                break;
            }

            int fileira = Integer.parseInt(String.valueOf(cadeira.charAt(1)));
            int numero = Integer.parseInt(String.valueOf(cadeira.charAt(3)));

            if(cinema[fileira][numero].isReservada()) {
                System.out.println("Cadeira reservada. Por favor, escolha outra!");
            }else {
                cinema[fileira][numero].reservar();
            }
        }
    }

    private static void showCinema(Cadeira[][] cinema) {
        for(int f = 0; f < cinema.length; f++) {
            for(int n = 0; n < cinema[0].length; n++) {
                if(cinema[f][n].isReservada()) {
                    System.out.print(BG_RED + cinema[f][n].toString());
                }else {
                    System.out.print(BG_GREEN + cinema[f][n].toString());
                }
                System.out.print(ANSI_RESET);
            }
            System.out.println();
            System.out.println();
        }
    }

    static class Cadeira{
        private int fileira;
        private int numero;
        private boolean reservada;

        public Cadeira(int fileira, int numero) {
            this.fileira = fileira;
            this.numero = numero;
            this.reservada = false;
        }

        public String toString() {
            return " F"+fileira+"N"+numero+" "+ANSI_RESET + " ";
        }

        public void reservar() {
            this.reservada = true;
        }

        public boolean isReservada() {
            return reservada;
        }
    }
}
