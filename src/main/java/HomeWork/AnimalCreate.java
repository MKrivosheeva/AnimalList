package HomeWork;

public class AnimalCreate {

    public static Animal setAnimal() {
        Animal animal = new Animal();
        String newAnimal;
        Boolean incorrectAnimal;
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
        while (incorrectAnimal == true);

        switch (userAnimalType) {
            case "CAT": {
                Cat usersCat = new Cat();
                animal = usersCat;
                animal.setName(AnimalProperties.inputName());
                animal.setAge(AnimalProperties.inputAge());
                animal.setWeight(AnimalProperties.inputWeight());
                animal.setColor(AnimalProperties.inputColor());
                animal.say();
                break;
            }
            case "DOG": {
                Dog usersDog = new Dog();
                animal = usersDog;
                animal.setName(AnimalProperties.inputName());
                animal.setAge(AnimalProperties.inputAge());
                animal.setWeight(AnimalProperties.inputWeight());
                animal.setColor(AnimalProperties.inputColor());
                animal.say();

                break;
            }
            case "DUCK": {
                Duck usersDuck = new Duck();
                animal = usersDuck;
                animal.setName(AnimalProperties.inputName());
                animal.setAge(AnimalProperties.inputAge());
                animal.setWeight(AnimalProperties.inputWeight());
                animal.setColor(AnimalProperties.inputColor());
                animal.say();
                break;
            }
        }
        return animal;
    }
}



