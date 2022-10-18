package com.ana.taxes;

public abstract class TaxPayer {

    private String name;
    private Double anualIncome;

    public TaxPayer(String name, Double anualIncome){
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public abstract Double tax();

    public String getName(){
        return name;
    }
    public Double getAnualIncome(){
        return anualIncome;
    }
}
