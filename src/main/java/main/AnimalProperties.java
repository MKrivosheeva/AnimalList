package main;

public class AnimalProperties {
    public static String inputName() {
        System.out.println("Введите имя вашего животного");
        String myNameIs = new InputService().inputText();
        return myNameIs;

    }
    public static Float inputWeight() {
        System.out.println("Введите вес вашего животного (в килограммах)");
        Float myWeightIs = new InputService().inputNumber();
        return myWeightIs;
    }

    public static String inputColor() {
        System.out.println("Введите цвет вашего животного");
        String myColorIs = new InputService().inputText();
        return myColorIs;
    }

    public static Float inputAge() {
        Float myAgeIs;
        System.out.println("Введите возраст животного");
        myAgeIs = new InputService().inputNumber();
        return myAgeIs;
    }

}
