package org.kosmocourses.junior.lesson10.interfaces;

/**
 * Опишем некий абстрактный игровой объект
 */
public class GameObject {
    // координата объекта по оси ОХ
    protected double x;
    // координата объекта по оси ОУ
    protected double y;

    // конструктор с параметрами
    // принимает координаты машины в пространстве по ОХ и ОУ
    public GameObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //блок геттеров/сеттеров
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
