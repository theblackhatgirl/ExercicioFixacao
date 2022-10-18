package com.ana.taxes;

public class Individual extends TaxPayer{

    private Double healthExpenditures = 0d;

    public Individual(Double healthExpenditures, String name, Double anualIncome){
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }
    @Override
    public Double tax(){
        if(getAnualIncome() < 20_000.00){
           return (getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
        }else{
            return (getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
        }
    }
}
