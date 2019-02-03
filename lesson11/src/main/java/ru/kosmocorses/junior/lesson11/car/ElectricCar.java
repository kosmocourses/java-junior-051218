package ru.kosmocorses.junior.lesson11.car;

/**
 * Электрическая машина
 */
public class ElectricCar extends Car {

    public ElectricCar(double x) {
        super(x);
        super.setEngine(new ElectricEngine()); // ставим электрический двигатель
    }

    // имплементируем метод запуска двигателя run() из интерфейса IEngine
    public void run() {
        super.engine.run(); // запускаем двигатель
    }
}
