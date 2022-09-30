package com.ana.loteria;


public class Numero {

    public static final String ANSI_RESET = "\u001B[0m";
    public static String BG_BLACK = "\u001B[30m";
    public static final String BG_WHITE = "\u001B[37m";

    private int valor;
    private boolean pintado;

    public Numero(int valor){
        this.valor = valor;
        this.pintado = false;
    }

    public void pintar(){
        this.pintado = true;
    }

    public int getValor() {
        return this.valor;
    }

    @Override
    public String toString(){

        String numero;

        if (this.valor < 10){
            numero =  "0" + this.valor;
        }else{
            numero = String.valueOf(this.valor);
        }

        String cor;
        if (this.pintado){
            cor = BG_BLACK;
        }else{
            cor = BG_WHITE;
        }

        return cor + " " + numero + " " + ANSI_RESET + " ";
    }
}

