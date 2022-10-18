package com.ana.inheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number;
        List<Product> products = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++){
            System.out.println("Product #"+i+" data:");
            System.out.println("Common, used or imported (c/u/i)?");
            String cui = scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Price: ");
            Double price = Double.parseDouble(scanner.nextLine());
            if (cui.equals("i")){
                System.out.println("Customs fee: ");
                Double cf = Double.parseDouble(scanner.nextLine());
                Product product = new ImportedProduct(cf, name, price);
                products.add(product);
            }else if (cui.equals("u")){
                System.out.println("Manufacture date:");
                LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product product = new UsedProduct(date, name, price);
                products.add(product);
            }else{
                Product product = new Product(name, price);
                products.add(product);
            }


        }
        System.out.println("PRICE TAGS: ");
        for(Product product : products){
            System.out.println(product.priceTag());
        }
    }
}
