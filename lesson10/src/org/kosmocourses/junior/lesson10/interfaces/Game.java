package org.kosmocourses.junior.lesson10.interfaces;

/**
 * Опишем игру
 */
public class Game {
    public static void main(String[] args) {
        IMove obj = new Car(6.0, 8.0); // создадим машину в точку 2D пространства (6,8)
        //IMove obj = new Bike();

        System.out.println(obj); // посмотрим что мы создали :)

        obj.moveTo();       // едем вперед
        obj.moveToLeft();   // едем влево
        obj.moveToRight();  // едем вправо
        obj.moveToBack();   // едем назад

        Crashable obj2 = (Crashable) obj;   // проверяем не разрушалась машина?
        System.out.println(obj2.isCrash());


        System.out.println(obj);
    }
}
