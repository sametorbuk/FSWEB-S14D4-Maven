package org.example.model;

public class Bread extends ProductForSale{
     private String size;



    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getType());
        System.out.println(getDescription());
        System.out.println(getPrice());

    }
}
