package com.ana.composition2;

public class Program {
    public static void main(String[] args){
        Post p1 = new Post("Traveling to New Zealand", "I'm going to visit this wonderful country!");
        Post p2 = new Post("Good night guys", "See you tomorrow");

        Comment c1 = new Comment("Have a nice trip");
        p1.addComment(c1);
        Comment c2 = new Comment("Wow, that's awesome!");
        p1.addComment(c2);

        Comment c3 = new Comment("Good night");
        p2.addComment(c3);
        Comment c4 = new Comment("May the force be with you");
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
