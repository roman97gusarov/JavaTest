package by.car.rent.command.impl;

import by.car.rent.UserSession;
import by.car.rent.car.CarManager;
import by.car.rent.car.CarReader;
import by.car.rent.command.Command;

import java.io.IOException;

public class GoCarCommand implements Command {
    public GoCarCommand(CarManager carManager, CarReader carReader) {
        this.carManager = carManager;
        this.carReader = carReader;
    }

    private final CarReader carReader;
    private final CarManager carManager;

    @Override
    public String getDescription() {
        return "Совершить поездку";
    }

    @Override
    public void execute(UserSession userSession) {
        try {
            carManager.goCar(carManager.getUserCar(), carReader.takeWay());
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }

    }


}
