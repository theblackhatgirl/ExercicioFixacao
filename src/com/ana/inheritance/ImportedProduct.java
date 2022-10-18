package com.ana.inheritance;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct(Double customsFee, String name, Double price){
        super(name, price);
        this.customsFee = customsFee;
    }
    @Override
    public String priceTag(){
       return name+" $ "+totalPrice()+" Customs fee: $ "+customsFee;
    }
    public Double totalPrice(){
       return price+customsFee;
    }
}
