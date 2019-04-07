package org.kosmocourses.junior.jkvartirnik2;

import org.kosmocourses.junior.jkvartirnik2.comparator.Cat;
import org.kosmocourses.junior.jkvartirnik2.comparator.CatComparator;
import org.kosmocourses.junior.jkvartirnik2.sort.BubbleSort;
import org.kosmocourses.junior.jkvartirnik2.sort.MergeSort;
import org.kosmocourses.junior.jkvartirnik2.sort.QuickSort;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = ArrayUtils.makeIntArray();
        ArrayUtils.printArray(arr);

        arr = ArrayUtils.makeIntArray();
        BubbleSort.sort(arr);
        ArrayUtils.printArray(arr);

        arr = ArrayUtils.makeIntArray();
        arr = MergeSort.sort(arr);
        ArrayUtils.printArray(arr);

        arr = ArrayUtils.makeIntArray();
        QuickSort.sort(arr);
        ArrayUtils.printArray(arr);

        // Встроенные в JDK сортировки:
        Arrays.sort(arr);
        Collections.sort(new ArrayList<Integer>());

        // Создаем 3 кота/кошки, причем объекты не реализуют интерфейс Comparable,
        // т.е. не могут быть сравними автоматически
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.w = 2;
        cat2.w = 1;
        cat3.w = 3;

        // Создаем набор котов/кошек и четко указываем как их надо сортировать в наборе
        // для этого передаем "сортировщик" котов/кошек
        TreeSet<Cat> cats = new TreeSet<>(new CatComparator());
        System.out.println(cats);

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        System.out.println(cats);

    }
}
