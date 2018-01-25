package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO GLADIATOR WARS!");
        System.out.println("Gladiator 1 has a low damage of 12 and a high damage of 20");
        System.out.println("Gladiator 2 has a low damage of 12 and a high damage of 20");
        System.out.println("CHOOSE WISELY....");
        System.out.println("Gladiator one type in your name:");
        Scanner gladiator1 = new Scanner(System.in);
        System.out.println("Gladiator two type in your name:");
        Scanner gladiator2 = new Scanner(System.in);
        Gladiator gladiatorone = new Gladiator("" + gladiator1, 200, 0, 12, 20);
        Gladiator gladiatortwo = new Gladiator("" + gladiator2, 200, 0, 5, 30);
        while(true){

        }
    }

}
