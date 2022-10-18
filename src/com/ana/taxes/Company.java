package com.ana.taxes;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company(int numberOfEmployees, String name, Double anualIncome){
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax(){
        if (numberOfEmployees < 10){
            return (getAnualIncome() * 0.16);
        }else{
            return (getAnualIncome() * 0.14);
        }
    }
}
