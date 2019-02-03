package ru.kosmocorses.junior.lesson11.car;

public class Main {
    public static void main(String[] args) {
        Car car = new ElectricCar(0.0); // создаем электрическую машшину в точке 0.0 по ОХ
        //FIXME: напишите классы для машины с двигателем внутреннего сгорания
        car.run();  // запускаем двигатель
        car.moveTo(); // перемещаемся на вперед

    }
}
