package org.experis.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto product1 = new Prodotto("Smartphone","Telefono Samsung",880,22);
        System.out.println(product1.codeName());
        System.out.println(product1.basePrice());
        System.out.println(product1.priceWithIva());

        Prodotto product2 = new Prodotto("Computer","Acer Nitro",1200,22);
        System.out.println(product2.codeName());
        System.out.println(product2.basePrice());
        System.out.println(product2.priceWithIva());

        Prodotto product3 = new Prodotto("Nintendo Switch","Console Nintendo",380,22);
        System.out.println(product3.codeName());
        System.out.println(product3.basePrice());
        System.out.println(product3.priceWithIva());
    }
}
