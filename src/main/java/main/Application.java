package main;

import animals.Animal;
import data.Commands;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Commands userMenuChoice = Menu.menuChoice();
        while (!userMenuChoice.equals(Commands.EXIT)) {
            switch (userMenuChoice) {
                case ADD: {
                    animals.add(AnimalCreate.setAnimal());
                    userMenuChoice = Menu.menuChoice();
                    break;
                }
                case LIST: {
                    for (Animal item : animals) {
                        System.out.println(item);
                    }
                    userMenuChoice = Menu.menuChoice();
                    break;
                }
            }
        }
    }
}


