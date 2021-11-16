package by.car.rent.command;


import by.car.rent.UserSession;

public interface Command {

    String getDescription();
    void execute(UserSession userSession);
}