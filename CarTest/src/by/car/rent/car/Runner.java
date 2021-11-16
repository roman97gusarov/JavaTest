package by.car.rent.car;

import by.car.rent.AppManager;
import by.car.rent.UserSession;
import by.car.rent.reader.ConsoleReader;
import by.car.rent.reader.Reader;
import by.car.rent.command.CommandFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {
    public static void main(String[] args) throws IOException {
        UserSession userSession = new UserSession();
        CarManager carManager = new CarManager();
        Reader reader = new ConsoleReader(new BufferedReader(new InputStreamReader(System.in)));
        CarReader carReader = new CarReader(reader);

        CommandFactory commandFactory = new CommandFactory(carManager, carReader);

        AppManager appManager = new AppManager(userSession, commandFactory, reader);
        appManager.service();


    }

}
