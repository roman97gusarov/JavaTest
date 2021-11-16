package by.car.rent;

import by.car.rent.command.CommandFactory;
import by.car.rent.reader.Reader;

import java.io.IOException;
import java.util.ArrayList;

public class AppManager {
    private final UserSession userSession;
    private final CommandFactory commandFactory;
    private final Reader reader;

    public AppManager(UserSession userSession, CommandFactory commandFactory, Reader reader) {
        this.userSession = userSession;
        this.commandFactory = commandFactory;
        this.reader = reader;
    }

    public void service() throws IOException {
        while (true) {
            printHelpMenu();
            commandFactory.findCommand(askForCommand()).ifPresentOrElse(
                    command -> command.execute(userSession),
                    () -> System.out.println("Вы ввели не существующую команду, повторите еще раз")
            );
        }
    }


    public void printHelpMenu() {
      System.out.println(commandFactory.getDescriptions());
    }


    public String askForCommand() throws IOException {
        System.out.println("Введите команду");
        return reader.readLine();
    }


}
