package by.car.rent.command.impl;

import by.car.rent.UserSession;
import by.car.rent.car.CarManager;
import by.car.rent.command.Command;



public class OffLightsCarCommand implements Command {

    public OffLightsCarCommand(CarManager carManager) {
        this.carManager = carManager;
    }

    CarManager carManager;

    @Override
    public String getDescription() {
        return "Выключить фары";
    }

    @Override
    public void execute(UserSession userSession) {
        carManager.turnOffLightsCar(carManager.getUserCar());

    }
}
