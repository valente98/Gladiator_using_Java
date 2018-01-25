package com.company;

import java.util.Random;

public class Gladiator {
    public String name;
    public double health;
    public Integer rage;
    public Integer damage_low;
    public Integer damage_hi;
    public String choice;

    Gladiator(String name, Integer health, Integer rage, Integer damage_low, Integer damage_hi){
        this.name = name;
        this.health = health;
        this.rage = rage;
        this.damage_low = damage_low;
        this.damage_hi = damage_hi;
    }
    public void attack(Gladiator other){
        Random rand = new Random();
        int damage_dealt = rand.nextInt(this.damage_hi - this.damage_low) + this.damage_low;
        int randint = rand.nextInt(100 - 1) + 1;
        if(randint <= damage_dealt){
            other.health -= (2 * damage_dealt);
            this.rage = 0;
        }else {
            other.health -= damage_dealt;
            this.rage += 15;
        }
    }
    public void PassRage(){
        this.rage += 30;
    }
    public void heal(){
        if(this.rage >= 10){
            this.rage  =  Math.max((this.rage - 10), 0);
            this.health = Math.min((this.health + 5), 200);
        }
    }
    public boolean is_dead(){
        if (this.health <= 0){
            return true;
        } else {
            return false;
        }
    }
    public void punch(Gladiator other){
        Integer Super_punch = this.damage_hi;
        other.health -= Super_punch * 2;
        this.health -= this.health * .5;
        this.rage = 0;
    }
    public boolean super_heal(){
        if (this.health <= 100 && this.rage >= 30){
            this.health += 20;
            this.rage += 0;
            return true;
        }else{
            return false;
        }
    }
    public void healer(Gladiator other){
        if (this.rage >= 40){
            other.health -= 15;
            this.health += 15;
            this.rage = 0;
        }
    }
    public void barbarian(Gladiator other){
        if (this.rage >= 40){
            this.attack(other);
            this.attack(other);
            this.rage = 0;
        }
    }
    public void sword(Gladiator other){
        if (this.rage >= 50){
            other.health -= 40;
            this.rage = 0;
        }
    }
    public void lance(Gladiator other){
        if (this.rage >= 45){
            other.health -= 35;
            this.rage = 0;
        }

    }
    public void bow_and_arrow(Gladiator other){
        if (this.rage >= 40){
            other.health -= 30;
            this.rage = 0;
        }
    }
    public void knife(Gladiator other){
        if (this.rage >= 35){
            other.health -= 25;
            this.rage = 0;
        }
    }
}