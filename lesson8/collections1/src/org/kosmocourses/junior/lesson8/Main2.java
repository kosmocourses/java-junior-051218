package org.kosmocourses.junior.lesson8;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Васька", Color.BLACK));
        cats.add(new Cat("Том", Color.GRAY));
        cats.add(new Cat("Машка", Color.WHITE));

        Iterator<Cat> iterCats = cats.iterator();

        while(iterCats.hasNext()) {
            Cat cat = iterCats.next();
            System.out.println(cat);
        }
    }
}
