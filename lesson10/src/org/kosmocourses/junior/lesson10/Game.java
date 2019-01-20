package org.kosmocourses.junior.lesson10;

public class Game {
    public static void main(String[] args) {
        IMove obj = new Car(6.0, 8.0);
        //IMove obj = new Bike();

        System.out.println(obj);

        obj.moveTo();
        obj.moveToLeft();
        obj.moveToRight();
        obj.moveToBack();

        Crashable obj2 = (Crashable) obj;
        System.out.println(obj2.isCrash());


        System.out.println(obj);
    }
}
