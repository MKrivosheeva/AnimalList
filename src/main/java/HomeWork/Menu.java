package HomeWork;

public class Menu {

    public static Commands menuChoice() {
        String menu;
        InputService enterCommand = new InputService();
        Commands userCommandInput;
        Boolean errorInput;
        do {
            System.out.println("Введите одну из команд:");
            System.out.println("add - добавить животное в список");
            System.out.println("list - вывести список животных");
            System.out.println("Для завершения работы введите exit");
            menu = enterCommand.inputText().trim().toUpperCase();
            errorInput = false;
            try {
                userCommandInput = Commands.valueOf(menu);
            } catch (IllegalArgumentException menuError) {

                System.out.println("Команда введена неверно, попробуйте ещё раз.");
                errorInput = true;
            }
        }
        while (errorInput == true);
        return Commands.valueOf(menu);
    }


}
