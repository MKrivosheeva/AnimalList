package animals.birds;

import main.Animal;
import main.Flying;

public class Duck extends Animal implements Flying {

    @Override
    public void say() {
        System.out.println("Кря"+ "\n");

    }

    @Override
    public void fly() {

        System.out.println("Я лечу");
    }
}



