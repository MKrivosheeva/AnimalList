package main;

import data.Commands;

public class Menu {

    public static Commands menuChoice() {
        String menu;
        InputService enterCommand = new InputService();
        boolean correctInput;
        do {
            System.out.println("Введите одну из команд:");
            System.out.println("add - добавить животное в список");
            System.out.println("list - вывести список животных");
            System.out.println("Для завершения работы введите exit");
            menu = enterCommand.inputText().trim().toUpperCase();
            correctInput = false;
            for(Commands command: Commands.values()) {
                if(command.name().equals(menu)) {
                    correctInput = true;
                    break;
                }
            }
            if(!correctInput) {
                System.out.println("Команда введена неверно, попробуйте ещё раз.");
                continue;
            }
       }
        while (!correctInput);
        return Commands.valueOf(menu);
    }
}

