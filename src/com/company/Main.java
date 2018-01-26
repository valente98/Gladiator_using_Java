package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner glad = new Scanner(System.in);
        GladiatorInteraction gladiator = new GladiatorInteraction();
        gladiator.intro();
        System.out.println("Gladiator one type in your name:");
        String glad1 = glad.nextLine();
        System.out.println("Gladiator two type in your name:");
        String glad2 = glad.nextLine();
        gladiator.gladiator_intro(glad1, glad2);
        Gladiator gladiatorone = new Gladiator("" + glad1, 200, 0, 12, 20);
        Gladiator gladiatortwo = new Gladiator("" + glad2, 200, 0, 5, 30);
        while (true) {
                gladiator.Gladiator_choices(glad1);
                String choice = glad.nextLine();
                gladiator.Gladiators_choice(choice, gladiatorone, gladiatortwo, glad1, glad2);
                gladiator.Gladiator_info(gladiatorone);
                gladiator.Gladiator_info(gladiatortwo);
                gladiator.Gladiator_choices(glad2);
                String choices = glad.nextLine();
                gladiator.Gladiators_choice(choices, gladiatortwo, gladiatorone, glad2, glad1);
                gladiator.Gladiator_info(gladiatorone);
                gladiator.Gladiator_info(gladiatortwo);
            if (gladiatorone.is_dead() || gladiatortwo.is_dead()) {
                if (!gladiatorone.is_dead()){
                    System.out.println("Gladiator " + glad2 + "! WINS!");
                    break;
                } else if(!gladiatortwo.is_dead()){
                    System.out.println("Gladiator " + glad2 + "! WINS!");
                    break;
                }
            }

        }
    }
}
