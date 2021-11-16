package by.car.rent.command.impl;

import by.car.rent.UserSession;
import by.car.rent.car.Car;
import by.car.rent.car.CarManager;
import by.car.rent.car.CarReader;
import by.car.rent.command.Command;

import java.io.IOException;

public class FillUpCarCommand implements Command {
    private final CarReader carReader;
    private final CarManager carManager;

    public FillUpCarCommand(CarReader carReader, CarManager carManager) {
        this.carReader = carReader;
        this.carManager = carManager;
    }


    @Override
    public String getDescription() {
        return "Заправвить автомобиль";
    }

    @Override
    public void execute(UserSession userSession) {
        try {
            carManager.fillUpCar(carManager.getUserCar(), carReader.fillUp());
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
    }
}

