package com.ana.filmes;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Filme> filmList = new ArrayList<>();

    public List<Filme> getFilms(){
        return this.filmList;
    }
    public void addFilme (Filme filme){
        filmList.add(filme);
    }
}
