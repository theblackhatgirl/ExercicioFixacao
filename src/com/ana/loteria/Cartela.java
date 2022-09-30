package com.ana.loteria;

public class Cartela {
    private Numero[][] numeros = new Numero[6][10];

    public Cartela(){
        int numero = 1;

        for (int i = 0; i < this.numeros.length; i++){
            for (int j = 0; j < this.numeros[0].length; j++){
                numeros[i][j] = new Numero(numero);

                numero++;
            }
        }
    }

    public void pintarTodos(int[] numerosEscolhidos){
        for (int i = 0; i < numerosEscolhidos.length; i++){
            int escolhido = numerosEscolhidos[i];

            for (int x = 0; x < this.numeros.length; x++){
                for (int y = 0; y < this.numeros[0].length; y++){
                    Numero numeroAtual = numeros[x][y];

                    if(numeroAtual.getValor() == escolhido){
                        numeroAtual.pintar();
                    }
                }
            }
        }
    }
    public void show(){
        for (int x = 0; x < this.numeros.length; x++){
            for (int y = 0; y < this.numeros[0].length; y++){
                Numero numeroAtual = numeros[x][y];

                System.out.print(numeroAtual);
            }
            System.out.println();
        }
    }
}

