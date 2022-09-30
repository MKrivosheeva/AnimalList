package main;

public class AnimalProperties {
    public static String inputName() {
        System.out.println("Введите имя вашего животного");
        String myNameIs = new InputService().inputText();
        return myNameIs;

    }
    public static int inputWeight() {
        System.out.println("Введите вес вашего животного (в килограммах)");
        int myWeightIs = new InputService().inputNumber();
        return myWeightIs;
    }

    public static String inputColor() {
        System.out.println("Введите цвет вашего животного");
        String myColorIs = new InputService().inputText();
        return myColorIs;
    }

    public static int inputAge() {
        System.out.println("Введите возраст животного (целое число)");
        Integer myAgeIs = new InputService().inputNumber();
        return myAgeIs;
    }

}
