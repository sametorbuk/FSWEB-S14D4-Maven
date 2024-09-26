package org.example.model;

public class Chocolate extends ProductForSale{
    private String ingredient;


    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getType());
        System.out.println(getDescription());
        System.out.println(getPrice());
    }
}
