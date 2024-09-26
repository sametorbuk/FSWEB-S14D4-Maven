package org.example.rpg;

public abstract class Monster implements Poisonable, Bleedable {
    private String name;
    private int hitPoints;
    private double damage;


    public Monster(String name, double damage, int hitPoints) {
        this.name = name;
        this.damage = damage;
        this.hitPoints = hitPoints;
    }


    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double bleed(){
        return getDamage()*0.25;
    }


    public double poison(){
        return getDamage()*0.3;
    }



    public double attack(){
        return getDamage()+ bleed() +  poison();
    }


}
