package org.example.rpg;

public class Troll extends Monster{

    private double damage = 100.0;
    public Troll(String name, double damage, int hitPoints) {
        super(name, damage, hitPoints);
    }


    public double getDamage() {

        return damage;
    }

}
