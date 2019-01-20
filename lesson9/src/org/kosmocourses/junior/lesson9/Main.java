package org.kosmocourses.junior.lesson9;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listOfString = new ArrayList<>();
        Set<String> setOfStrings = new HashSet<>();

        listOfString.add("А");
        listOfString.add("Б");
        listOfString.add("Б");
        listOfString.add("В");
        listOfString.add("Г");
        listOfString.add("Г");

        setOfStrings.add("А");
        setOfStrings.add("Б");
        setOfStrings.add("Б");
        setOfStrings.add("В");
        setOfStrings.add("Г");
        setOfStrings.add("Г");


        Set<Dog> dogs1 = new HashSet<>();

        dogs1.add(new Dog("Дружок", Color.YELLOW));
        dogs1.add(new Dog("Лайка", Color.BLACK));
        dogs1.add(new Dog("Жучка", Color.WHITE));

        for(Dog dog: dogs1){
            System.out.println(dog);
        }

        Set<Dog> dogs2 = new TreeSet<>();

        dogs2.add(new Dog("Дружок", Color.YELLOW));
        dogs2.add(new Dog("Лайка", Color.BLACK));
        dogs2.add(new Dog("Жучка", Color.WHITE));

        for(Dog dog: dogs2){
            System.out.println(dog);
        }

//        Set<Integer> numbers = new TreeSet<>();
//
//        numbers.add(5);
//        numbers.add(2);
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(3);
//
//        for (Integer numb: numbers){
//            System.out.println(numb);
//        }


        Set<Double> doubles = new LinkedHashSet<>();

        doubles.add(2.1);
        doubles.add(3.4);
        doubles.add(0.1);
        doubles.add(9.1);
        doubles.add(7.1);

        for (double numb: doubles){
            System.out.println(numb);
        }

    }
}
