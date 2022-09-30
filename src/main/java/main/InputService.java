package main;

import java.util.Scanner;

public class InputService implements IScanner {

    @Override
    public String inputText() {
        Scanner sc = new Scanner(System.in);
        String thisInputText = sc.nextLine();
        return thisInputText;
    }

    @Override
    public Float inputNumber() {
        Scanner sc = new Scanner(System.in);
        Float thisInputNumber;
        while (!sc.hasNextFloat()) {
            System.out.println("Введите целое число или десятичную дробь (разделитель целой и дробной частей - запятая)");
            sc.next();
        }
        thisInputNumber = sc.nextFloat();
        return thisInputNumber;
    }
}
