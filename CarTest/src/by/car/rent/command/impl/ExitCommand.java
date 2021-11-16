package by.car.rent.command.impl;

import by.car.rent.UserSession;
import by.car.rent.car.Runner;
import by.car.rent.command.Command;

public class ExitCommand implements Command {

    @Override
    public String getDescription() {
        return "Выход из программы";
    }

    @Override
    public void execute(UserSession userSession) {
        System.exit(1);
    }

}
