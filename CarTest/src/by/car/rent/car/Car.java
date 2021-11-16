package by.car.rent.car;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private final String yearOfIssue;
    private final String power;
    private final String seats;
    private final String passenger;
    private final Integer tankSize;
    private final Integer consumption;
    private double fuel;
    private boolean headlights;


    void setFuel(double fuel) {
        if (fuel >= 0) {
            this.fuel = fuel;
        } else {
            throw new IllegalArgumentException("иметь значение меньше нуля");
        }
    }

    void setHeadlights(boolean headlights) {
        this.headlights = headlights;
    }

    public Car(String brand, String model, String yearOfIssue, String power, String seats,
               String passenger, Integer tankSize, Double fuel, Integer consumption, Boolean headlights) {

        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.power = power;
        this.seats = seats;
        this.passenger = passenger;
        this.tankSize = tankSize;
        this.fuel = fuel;
        this.consumption = consumption;
        this.headlights = headlights;
    }

    @Override
    public String toString() {
        return "by.car.rent.car.Car{" +
                "carMake='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", power='" + power + '\'' +
                ", seats='" + seats + '\'' +
                ", passenger='" + passenger + '\'' +
                ", tankSize=" + tankSize +
                ", consumption=" + consumption +
                ", fuel=" + fuel +
                ", headlights=" + headlights +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(yearOfIssue, car.yearOfIssue) &&
                Objects.equals(power, car.power) &&
                Objects.equals(seats, car.seats) &&
                Objects.equals(passenger, car.passenger) &&
                Objects.equals(tankSize, car.tankSize) &&
                Objects.equals(consumption, car.consumption) &&
                Objects.equals(fuel, car.fuel) &&
                Objects.equals(headlights, car.headlights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfIssue, power, seats, passenger, tankSize, consumption, fuel, headlights);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public String getPower() {
        return power;
    }

    public String getSeats() {
        return seats;
    }

    public String getPassenger() {
        return passenger;
    }

    public Integer getTankSize() {
        return tankSize;
    }

    public Double getFuel() {
        return fuel;
    }

    public Integer getConsumption() {
        return consumption;
    }

    public Boolean getHeadlights() {
        return headlights;
    }

}






