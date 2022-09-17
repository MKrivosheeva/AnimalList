package main;

import animals.Animal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalTypes;

public class AnimalCreate {
    protected static Animal animal;

    public static Animal setAnimalProperties(Animal animal) {
        animal.setName(AnimalProperties.inputName());
        animal.setAge(AnimalProperties.inputAge());
        animal.setWeight(AnimalProperties.inputWeight());
        animal.setColor(AnimalProperties.inputColor());
        animal.say();
        return animal;
    }

    public static Animal setAnimal() {
        String newAnimal;
        boolean incorrectAnimal;
        String userAnimalType;
        System.out.println("Введите на английском вид животного (cat, dog, duck)?");
        do {
            userAnimalType = new InputService().inputText().trim().toUpperCase();
            incorrectAnimal = false;
            try {
                newAnimal = AnimalTypes.valueOf(userAnimalType).toString();
            } catch (IllegalArgumentException animalError) {
                System.out.println("Таких животных в нашем зоопарке не бывает, попробуйте добавить животное ещё раз (cat, dog, duck)");
                incorrectAnimal = true;
            }
        }
        while (incorrectAnimal);
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

