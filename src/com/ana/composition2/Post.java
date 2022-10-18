package com.ana.composition2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//classe
public class Post {
    //atributos, caracteristicas da classe
    //as variaveis não são mais primitivas, são do tipo classe, que guardam um objeto
    private LocalDate moment = LocalDate.now();
    private String title;
    private String content;
    private Integer likes = 0;
    //list é uma interface. arraylist é uma classe que implementa o List
    private List<Comment> comments = new ArrayList<>();

    //construtor
    public Post(String title, String content){
        this.title = title;
        this.content = content;
    }
    //metodo
    public void addComment(Comment comment){
        //operador . acessou o método add do objeto comments
        comments.add(comment);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes).append("Likes - ").append(moment).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments: \n");
        //for each
        for (Comment c : comments){
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }










}

