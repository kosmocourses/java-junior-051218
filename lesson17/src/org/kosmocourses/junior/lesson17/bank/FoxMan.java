package org.kosmocourses.junior.lesson17.bank;

/**
 * Created by Vladislav Gasanov on 13.02.2019.
 */
public class FoxMan {

    public static void main(String[] args) {
        Thread man1 = new Thread(new Task1());
        Thread man2 = new Thread(new Task2());

        man1.start();
        man2.start();
    }
}
