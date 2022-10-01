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
        float thisInputNumber = -1;
        while (thisInputNumber <=0) {
            while (!sc.hasNextFloat()) {
                System.out.println("Введите целое число или десятичную дробь (разделитель целой и дробной частей - запятая)");
                sc.next();
            }
            thisInputNumber = sc.nextFloat();
            if (thisInputNumber <=0) {
                System.out.println("Значение должно быть больше нуля");
            }
      }
        return thisInputNumber;
    }
}
