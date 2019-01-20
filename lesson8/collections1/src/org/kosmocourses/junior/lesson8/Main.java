package org.kosmocourses.junior.lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Integer[] intArray = new Integer[10];
        List<Integer> intList = new ArrayList<>();
        // {1, 3, 3, 4, ... }
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(8);
        intList.add(123);
        intList.add(999);
        intList.add(1);

        // Для 11 элемента массив расширится по формуле: (n*3)/2+1

//        printList(intList);

        ArrayList<Object> list1 = new ArrayList<>();

        LinkedList<Integer> list2 = new LinkedList<>();

        for (int i = 1; i < 50; i+=2){
            list2.add(i);
        }

//        printList(list2);

        list1.addAll(list2);

        System.out.println(intList.get(0));
        System.out.println(list1.get(0));
        System.out.println(list2.getFirst());


        intList.set(1, 9999);
        list1.set(1, 9999);
        list2.set(1, 9999);






    }

    private static void printList(List<Integer> intList) {
        for(Integer i: intList){
            System.out.println(i);
        }
    }


}
