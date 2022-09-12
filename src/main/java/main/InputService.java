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
    public Integer inputNumber() {
        Scanner sc = new Scanner(System.in);
        int thisInputNumber;
        while (!sc.hasNextInt()) {
            System.out.println("Введите целое число");
            sc.next();
        }
        thisInputNumber = sc.nextInt();
        return thisInputNumber;
    }
}
