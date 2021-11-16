package by.car.rent.command.impl;

import by.car.rent.UserSession;
import by.car.rent.car.CarManager;
import by.car.rent.car.CarReader;
import by.car.rent.command.Command;

public class OfferCarCommand implements Command {
    public OfferCarCommand(CarManager carManager) {
        this.carManager = carManager;
    }

    CarManager carManager;

    @Override
    public String getDescription() {
        return "Просмотреть доступные авто";
    }

    @Override
    public void execute(UserSession userSession) {
        carManager.offerCar();

    }
}

