package org.kosmocourses.junior.lesson10;

import java.awt.*;

public class Car extends GameObject implements IMove, Crashable {

    private String registrationNumber;
    private Color color;
    private String producer;

    public Car(double x, double y) {
        super(x, y);
    }

    // 0x,0y -> x
    //  |
    //  y
    //
    //  start position = x,y
    //  vector -->

    @Override
    public void moveTo() {
        super.setX(super.getX() + 5);
        System.out.println("x = " + super.x + " y = " + super.y);
    }

    @Override
    public void moveToLeft() {
        super.y-=5;
        System.out.println("x = " + super.x + " y = " + super.y);
    }

    @Override
    public void moveToRight() {
        super.y+=5;
        System.out.println("x = " + super.x + " y = " + super.y);
    }

    @Override
    public void moveToBack() {
        super.x-=5;
        System.out.println("x = " + super.x + " y = " + super.y);
    }

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
