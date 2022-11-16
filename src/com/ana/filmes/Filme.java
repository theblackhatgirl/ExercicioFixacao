package com.ana.filmes;

public class Filme {
    private String nome;
    private String genero;
    private String ano;
    private String sinopse;

    public Filme(String nome, String genero, String ano, String sinopse){
       this.nome = nome;
       this.genero = genero;
       this.ano = ano;
       this.sinopse = sinopse;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getAno(){
        return this.ano;
    }
    public void setAno(String ano){
        this.ano = ano;
    }
    public String getSinopse(){
        return this.sinopse;
    }
    public void setSinopse(String sinopse){
        this.sinopse = sinopse;
    }
}
