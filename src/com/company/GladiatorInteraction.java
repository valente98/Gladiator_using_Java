package com.company;

import java.util.Scanner;

public class GladiatorInteraction {
    public GladiatorInteraction intro(){
        System.out.println("Welcome to Gladiators War!!!");
        System.out.println("Gladiator 1 has a low damage: 12 and high damage: 20");
        System.out.println("Gladiator 2 has a low damage: 5 and high damage: 30");
        System.out.println("CHOOSE WISELY!!");
        return null;
    }
    public void gladiator_intro(String Gladiator_1, String Gladiator_2){
        System.out.println("Gladiator 1 is: "+ Gladiator_1);
        System.out.println("Gladiator 2 is: "+ Gladiator_2);
    }
    public void Gladiator_info(Gladiator gladiator){
        System.out.println(""+gladiator.name+": " +gladiator.health+" HP ||| "+gladiator.rage+" Rage ||| Low damage: "+ gladiator.damage_low +" ||| High damage: "+ gladiator.damage_hi);
    }
    public void Gladiator_choices(String Gladiator){
        System.out.println("Gladiator "+ Gladiator + "... What would you like to do?");
        System.out.println("\t[1] Attack");
        System.out.println("\t[2] Pass");
        System.out.println("\t[3] Quit");
        System.out.println("\t[4] Heal");
        System.out.println("\t[5] Super Heal");
        System.out.println("\t[6] Power Punch");
        System.out.println("\t[7] Helper (only if rage is greater than 40");
        System.out.println("\t[8] Weapons");
    }
    public void weapon_inventory(Gladiator attacker, Gladiator defender){
        System.out.println("Which weapon would you like to use?");
        System.out.println("\t[1] Sword(need to have 50 percent of rage");
        System.out.println("\t[2] Lance(need to have 45 percent of rage");
        System.out.println("\t[3] Bow and Arrow(need to have 40 percent of rage");
        System.out.println("\t[4] Knife(need to have 35 percent of rage");
        Scanner choices = new Scanner(System.in);
        String choice = choices.nextLine();
        if (choice.equals("1") || choice.toLowerCase().equals("one")){
            attacker.sword(defender);
        }else if (choice.equals("2") || choice.toLowerCase().equals("two")){
            attacker.lance(defender);
        }else if (choice.equals("3") || choice.toLowerCase().equals("three")){
            attacker.bow_and_arrow(defender);
        }else if (choice.equals("4") || choice.toLowerCase().equals("four")){
            attacker.knife(defender);
        }else{
            System.out.println("Sorry not enough rage.");
        }
    }

    public void helper(Gladiator attacker, Gladiator defender){
        System.out.println("Which helper would you like to choose to help you?");
        System.out.println("\t[1] Barbarian (Does Double attack on your opponent)");
        System.out.println("\t[2] Healer (takes health away from your opponent and adds it to your health)");
        Scanner choices = new Scanner(System.in);
        String choice = choices.nextLine();
        if (choice.equals("1") || choice.toLowerCase().equals("one")){
            attacker.barbarian(defender);
        }else if (choice.equals("2") || choice.toLowerCase().equals("two")){
            attacker.healer(defender);
        }else{
            System.out.println("Sorry not enough rage.");
        }
    }
    public void Gladiators_choice(String choice, Gladiator attacker, Gladiator defender, String name, String name2) {
            if (choice.equals("1") || choice.toLowerCase().equals("one")) {
                attacker.attack(defender);
            } else if (choice.equals("2") || choice.toLowerCase().equals("two")) {
                attacker.PassRage();
                System.out.println("Gladiator " + name + ". Passes.");
            } else if (choice.equals("4") || choice.toLowerCase().equals("four")) {
                attacker.heal();
            } else if (choice.equals("5") || choice.toLowerCase().equals("five")) {
                if (attacker.super_heal()) {
                    System.out.println("Gladiator " + name + ". You have successfully super heal. \n");
                } else {
                    System.out.println("Sorry you do not have enough rage. You need 30 or more rage.\n");
                }
            } else if (choice.equals("6") || choice.toLowerCase().equals("six")) {
                attacker.punch(defender);
            } else if (choice.equals("7") || choice.toLowerCase().equals("seven")) {
                helper(attacker, defender);
            } else if (choice.equals("8") || choice.toLowerCase().equals("eight")) {
                weapon_inventory(attacker, defender);
            } else {
                System.out.println("Sorry invalid choice. You lost your turn.");
            }
        }

    }

