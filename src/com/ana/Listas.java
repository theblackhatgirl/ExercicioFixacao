package com.ana;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
      // adicionar um elemento numa certa posicao:
        // list.add(2,"Marco");

        //remover um elemento da lista
        //list.remove("Anna"); ou
        //list.remove(1) ou
        //usar um predicado:
        //list.removeIf(x -> x.charAt(0) == 'M') = remover nomes que começam com a letra M

        //encontrar a posicao de um elemento:
       // System.out.println("Index of Bob: "+ list.indexOf("Bob"));

        //filtrar a lista com nomes que começam com A:
        //List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        //for(String x: result){
        // System.out.println(result);
        // }

        //como encontrar um elemento da lista que atenda um certo predicado:
        //String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        //System.out.println(name);

        // imprimir o tamanho da lista
        // System.out.println(list.size());
        for (String x : list){
            System.out.println(x);
        }

    }
}
