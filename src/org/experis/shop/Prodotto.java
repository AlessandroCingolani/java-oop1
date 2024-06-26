package org.experis.shop;

import java.util.Random;

public class Prodotto {
    // Attributes
    private int codeProduct;
    private String name;
    String description;

    private double price;

    private int iva;
    // constructors


    public Prodotto(String name,String description,double price,int iva) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
        Random random = new Random();
        this.codeProduct = random.nextInt(100000000);
    }

    //methods
    public double basePrice(){
        return price ;
    }

    public double priceWithIva(){
        double importIva = price * (iva/100.0);
        return price + importIva;
    }

    public String codeName (){
        String formattedCode = String.format("%08d",codeProduct);
        return formattedCode + "-" + name;
    }
}
