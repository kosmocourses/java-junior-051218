package org.kosmocourses.junior.lesson10;

public class Bike implements IMove {

    private double x;
    private double y;

    @Override
    public void moveTo() {
        x+=5;
        System.out.println("x = " + x + " y = " + y);
    }

    @Override
    public void moveToLeft() {
        y-=5;
        System.out.println("x = " + x + " y = " + y);
    }

    @Override
    public void moveToRight() {
        y+=5;
        System.out.println("x = " + x + " y = " + y);
    }

    @Override
    public void moveToBack() {
        x-=5;
        System.out.println("x = " + x + " y = " + y);
    }
}
