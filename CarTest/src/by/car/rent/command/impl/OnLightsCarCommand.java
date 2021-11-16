package by.car.rent.command.impl;

import by.car.rent.UserSession;
import by.car.rent.car.CarManager;
import by.car.rent.command.Command;

public class OnLightsCarCommand implements Command {
    public OnLightsCarCommand(CarManager carManager) {
        this.carManager = carManager;
    }

    CarManager carManager;

    @Override
    public String getDescription() {
        return "Включить фары";
    }

    @Override
    public void execute(UserSession userSession) {
        carManager.turnOnLightsCar(carManager.getUserCar());

    }
}

