package ru.kosmocorses.junior.lesson11.car;

/**
 * Электриический двигатель
 */
public class ElectricEngine implements IEngine { // т.к. это вообщем-то двигатель, то его поведение
    // пишем имплементацию запуска электрического двигателя
    public void run() {
        System.out.println("Подключи батарейку!");
    }
}
