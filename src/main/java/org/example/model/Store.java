package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0]=new Coke("Sugar zero" , 22.4 , "Nice");
        products[1] = new Bread("Somun" , 10.4 , "Glutensiz");
        products[2]=new Chocolate("bitter" , 5.6,"60% bitter");
        listProducts(products);
    }










    public static void listProducts(ProductForSale[] products) {

        for(int i = 0 ; i < products.length ; i++){
            products[i].showDetails();
        }
    }
}