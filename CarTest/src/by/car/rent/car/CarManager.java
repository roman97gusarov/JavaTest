package by.car.rent.car;
import java.util.ArrayList;

public class CarManager {
    private ArrayList<Car> cars;
    private Car userCar;

    public ArrayList<Car> getCars() {
        return cars;
    }

    public Car getUserCar() {
        return userCar;
    }

    public void offerCar() {
        cars = new ArrayList<>();
        Car lada = new Car("lada", "Vesta", "20.10.20", "56 h.s",
                "5", "4", 50, 0.0, 5, false);
        Car alfaRomeo = new Car("AlfaRomeo", "156", "20.10.20", "140 h.s",
                "5", "4", 50, 0.0, 9, false);
        Car audi = new Car("Audi", "Vesta", "20.10.20", "56 h.s",
                "5", "4", 50, 0.0, 4, false);
        Car bmw = new Car("BMW", "Vesta", "20.10.20", "56 h.s",
                "5", "4", 50, 0.0, 2, false);
        Car bugatti = new Car("Bugatti", "Vesta", "20.10.20", "56 h.s",
                "5", "4", 50, 0.0, 10, false);
        cars.add(lada);
        cars.add(alfaRomeo);
        cars.add(audi);
        cars.add(bmw);
        cars.add(bugatti);
        cars.forEach(System.out::println);
    }

    public void takeCar(ArrayList<Car> cars, String name) {
        for (Car car : cars) {
            if (car.getBrand().equals(name)) {
                userCar = car;
                System.out.println("Вы выбрали автомобиль: " + car);
            }
        }
    }

    public boolean goCar(Car car, int way) {

        if (way <= 0) {
            throw new IllegalArgumentException("Расстояние должно быть больше 0");
        }
        boolean canGo = car.getFuel() / car.getConsumption() * 100 > way;
        if (canGo) {
            car.setFuel(car.getFuel() - way / 100f * car.getConsumption());
            System.out.println("Поездка прошла успешно, у вас осталось топлива: " + userCar.getFuel());
        } else {
            System.out.println("У вас не достаточно топлива, заправте машину, бак расчитан на: " + userCar.getTankSize());
        }
        return canGo;
    }

    public boolean fillUpCar(Car car, int liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Количество топлива не может быть отрицательным или равно 0");
        }
        boolean canFillUp = car.getFuel() + liters <= car.getTankSize();
        if (canFillUp) {
            car.setFuel(car.getFuel() + liters);
            System.out.println("Заправка прошла успешно, топливо в баке: " + userCar.getFuel());
        } else {
            System.out.println("количество топливо не должно привышать " + userCar.getTankSize());
        }

        return canFillUp;
    }

    public boolean turnOnLightsCar(Car car) {
        boolean canTurnOn = car.getHeadlights().equals(false);
        if (canTurnOn) {
            car.setHeadlights(true);
            System.out.println("Фары включены");

        } else {
            System.out.println("Фары уже были в ключены");
        }
        return canTurnOn;


    }

    public boolean turnOffLightsCar(Car car) {
        boolean canTurnOff = car.getHeadlights().equals(true);
        if (canTurnOff) {
            car.setHeadlights(false);
            System.out.println("Выключение фар прошло успешно");
        } else {
            System.out.println("Фары уже были выключены");
        }
        return canTurnOff;
    }
}



