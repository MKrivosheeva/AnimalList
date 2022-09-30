package main;

import animals.Animal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalTypes;

public class AnimalCreate {
    protected static Animal animal = null;

    public static Animal setAnimalProperties(Animal animal) {
        animal.setName(AnimalProperties.inputName());
        animal.setAge(AnimalProperties.inputAge());
        animal.setWeight(AnimalProperties.inputWeight());
        animal.setColor(AnimalProperties.inputColor());
        animal.say();
        return animal;
    }

    public static Animal setAnimal() {
        boolean correctAnimal;
        String userAnimalType;
        System.out.println("Введите на английском вид животного (cat, dog, duck)?");
        do {
            userAnimalType = new InputService().inputText().trim().toUpperCase();
            correctAnimal = false;

            for(AnimalTypes thisAnimal: AnimalTypes.values()) {
                if(thisAnimal.name().equals(userAnimalType)) {
                    correctAnimal = true;
                    break;
                }
            }
            if(!correctAnimal) {
                System.out.println("Таких животных в нашем зоопарке не бывает, попробуйте добавить животное ещё раз (cat, dog, duck).");
                continue;
            }
        }
        while (!correctAnimal);
        switch (userAnimalType) {
            case "CAT": {
                animal = new Cat();
                break;
            }
            case "DOG": {
                animal = new Dog();
                break;
            }
            case "DUCK": {
                animal = new Duck();
                break;
            }
        }
        setAnimalProperties(animal);
        return animal;
    }
}

