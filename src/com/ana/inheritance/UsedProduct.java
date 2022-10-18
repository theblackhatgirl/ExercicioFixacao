package com.ana.inheritance;

import java.time.LocalDate;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct(LocalDate manufactureDate, String name, Double price){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag(){
        return name+ " (used) "+" $ "+price+" Manufacture date: "+manufactureDate;
    }
}
