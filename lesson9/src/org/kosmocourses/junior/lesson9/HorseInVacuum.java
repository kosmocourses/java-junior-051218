package org.kosmocourses.junior.lesson9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class HorseInVacuum {

    public static final int NUMBER_OF_INSERT = 100_000;

    public static void main(String[] args) {

        long startTime;
        Iterator<Integer> iter;
        ListIterator<Integer> listIter;
        int idx = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.print("Insert to end use 'for-iteration' of ArrayList = ");
        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < NUMBER_OF_INSERT; i++){
            arrayList.add(i);
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        System.out.print("Insert to end use 'for-iteration' of LinkedList = ");
        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < NUMBER_OF_INSERT; i++){
            linkedList.add(i);
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        System.out.print("Insert to middle use 'for-iteration' of ArrayList = ");
        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < NUMBER_OF_INSERT; i++){
            arrayList.add(NUMBER_OF_INSERT/2, i);
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        System.out.print("Insert to middle use 'for-iteration' of LinkedList = ");
        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < NUMBER_OF_INSERT; i++){
            linkedList.add(NUMBER_OF_INSERT/2, i);
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        // --------------------------------------------------------------
        // Reinit collections
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();

        for (Integer i = 0; i < NUMBER_OF_INSERT; i++){
            arrayList.add(i);
        }
        for (Integer i = 0; i < NUMBER_OF_INSERT; i++){
            linkedList.add(i);
        }
        // --------------------------------------------------------------

        System.out.print("Insert to middle use ListIteration of ArrayList = ");
        listIter = arrayList.listIterator();
        idx = 0;
        startTime = System.currentTimeMillis();
        while (listIter.hasNext()){
            listIter.next();
            if (idx == NUMBER_OF_INSERT/2) {
                for (Integer i = 0; i < NUMBER_OF_INSERT; i++){
                    listIter.add(i);
                }
                break;
            }
            idx++;
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        System.out.print("Insert to middle use ListIteration of LinkedList = ");
        listIter = linkedList.listIterator();
        idx = 0;
        startTime = System.currentTimeMillis();
        while (listIter.hasNext()){
            listIter.next();
            if (idx == NUMBER_OF_INSERT/2) {
                for (Integer i = 0; i < NUMBER_OF_INSERT; i++){
                    listIter.add(i);
                }
                break;
            }
            idx++;
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        // --------------------------------------------------------------
        // Reinit collections
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();

        for (Integer i = 0; i < NUMBER_OF_INSERT; i++){
            arrayList.add(i);
        }
        for (Integer i = 0; i < NUMBER_OF_INSERT; i++){
            linkedList.add(i);
        }
        // --------------------------------------------------------------

        System.out.print("Get use 'for-iteration' of ArrayList = ");
        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < arrayList.size(); i++){
            arrayList.get(i);
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        System.out.print("Get use 'for-iteration' of LinkedList = ");
        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < linkedList.size(); i++){
            linkedList.get(i);
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        System.out.print("'Get' use Iterator of ArrayList = ");
        iter = arrayList.iterator();
        startTime = System.currentTimeMillis();
        while (iter.hasNext()){
            iter.next();
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        System.out.print("'Get' use Iterator of LinkedList = ");
        iter = linkedList.iterator();
        startTime = System.currentTimeMillis();
        while (iter.hasNext()){
            iter.next();
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        System.out.print("'Get' use ListIterator of ArrayList = ");
        listIter = arrayList.listIterator();
        startTime = System.currentTimeMillis();
        while (listIter.hasNext()){
            listIter.next();
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        System.out.print("'Get' use ListIterator of LinkedList = ");
        listIter = linkedList.listIterator();
        startTime = System.currentTimeMillis();
        while (listIter.hasNext()){
            listIter.next();
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");
    }
}
