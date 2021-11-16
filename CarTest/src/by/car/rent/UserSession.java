package by.car.rent;

import by.car.rent.car.Car;

import java.util.Optional;

public class UserSession {
    private Optional<Car> car;

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = Optional.of(car);
    }

    public UserSession() {
        this.car = Optional.empty();
    }
}
