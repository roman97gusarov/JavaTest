package by.car.rent.car;

import by.car.rent.reader.Reader;
import java.io.IOException;

public class CarReader {
    private final Reader reader;

    public CarReader(Reader reader) {
        this.reader = reader;
    }


    public String takeCar() throws IOException {
        System.out.println("Чтобы выбрать автомобиль, ведите марку");
        String name = reader.readLine();
        if (name.equals("")) {
            System.out.println("Имя выбранно машины не может быть пустым");
            takeCar();
        }
        return name;
    }

    public int takeWay() throws IOException {
        System.out.println("Введите путь который хотите проехать");
        String takeWay = reader.readLine();
        int way = Integer.parseInt(takeWay);
        if (way <= 0) {
            System.out.println("Путь не может быть меньше или равен нулю");
            takeWay();
        }
        return way;
    }

    public int fillUp() throws IOException {
        System.out.println("Введите количество топлива");
        String readLiters = reader.readLine();
        int liters = Integer.parseInt(readLiters);
        if (liters <= 0) {
            System.out.println("Количество литров не может быть меньше  или равно нулю");
            fillUp();
        }
        return liters;
    }
}
