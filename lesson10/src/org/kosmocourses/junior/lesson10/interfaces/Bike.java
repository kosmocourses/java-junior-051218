package org.kosmocourses.junior.lesson10.interfaces;

/**
 * Описываем велосипед, который может перемещатся в пространстве
 */
public class Bike implements IMove {

    // координата по оси ОХ
    private double x;
    // координата по оси ОУ
    private double y;

    // имплементируем метод перемещения вперед из интерфейса IMove
    @Override
    public void moveTo() {
        x+=5;
        System.out.println("x = " + x + " y = " + y);
    }

    // имплементируем метод перемещения влево из интерфейса IMove
    @Override
    public void moveToLeft() {
        y-=5;
        System.out.println("x = " + x + " y = " + y);
    }

    // имплементируем метод перемещения направо из интерфейса IMove
    @Override
    public void moveToRight() {
        y+=5;
        System.out.println("x = " + x + " y = " + y);
    }

    // имплементируем метод перемещения назад из интерфейса IMove
    @Override
    public void moveToBack() {
        x-=5;
        System.out.println("x = " + x + " y = " + y);
    }
}
