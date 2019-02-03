package org.kosmocourses.junior.lesson10.interfaces;

import java.awt.*;

/**
 * ИОпишем игровой объект автомобиль,
 * который может перемещаться и разрушаться
 */
public class Car extends GameObject implements IMove, Crashable {

    // номер машины
    private String registrationNumber;
    // цвет
    private Color color;
    // производитель
    private String producer;

    // конструктор с параметрами
    // принимает координаты машины в пространстве по ОХ и ОУ
    public Car(double x, double y) {
        super(x, y);
    }

    // 0x,0y -> x
    //  |
    //  y
    //
    //  start position = x,y
    //  vector -->

    // имплементируем метод перемещения вперед из интерфейса IMove
    @Override
    public void moveTo() {
        super.setX(super.getX() + 5);
        System.out.println("x = " + super.x + " y = " + super.y);
    }

    // имплементируем метод перемещения влево из интерфейса IMove
    @Override
    public void moveToLeft() {
        super.y-=5;
        System.out.println("x = " + super.x + " y = " + super.y);
    }

    // имплементируем метод перемещения направо из интерфейса IMove
    @Override
    public void moveToRight() {
        super.y+=5;
        System.out.println("x = " + super.x + " y = " + super.y);
    }

    // имплементируем метод перемещения назад из интерфейса IMove
    @Override
    public void moveToBack() {
        super.x-=5;
        System.out.println("x = " + super.x + " y = " + super.y);
    }

    //блок геттеров/сеттеров
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    // переопределяем метод для преобразования объекта в строку
    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", color=" + color +
                ", producer='" + producer + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    // имплементируем метод проверки не разрушился ли объект из интерфейса Crashable
    @Override
    public boolean isCrash() {
// Var1:
//        if ((x % 2) == 0) {
//            return false;
//        } else {
//            return true;
//        }

// Var2:
//        return ((x % 2) == 0) ? false : true;

// Var3:
        return  !((x % 2) == 0);
    }
}
