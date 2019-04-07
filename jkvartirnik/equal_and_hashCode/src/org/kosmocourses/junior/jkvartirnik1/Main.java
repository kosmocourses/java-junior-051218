package org.kosmocourses.junior.jkvartirnik1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.setHeight(10);
        box1.setWidth(20);
        box1.setDate(new Date(2019, 04, 03));

        box2.setHeight(10);
        box2.setWidth(20);
        box2.setDate(new Date(2019, 04, 03));

        System.out.println(box1.equals(box2));

        // Создадим одномерные массивы
        Box[] boxes1 = new Box[] { box1, box2 };
        Box[] boxes2 = new Box[] { box1, box2 };

        // Посмотрим разницу в поведении сравнения через Array.equals() и Arrays.equals()
        // для одномерных массивов
        System.out.println(boxes1.equals(boxes2));
        System.out.println(Arrays.equals(boxes1, boxes2));

        // Создадим двумерные массивы
        Box[][] boxes2D1 = new Box[][] { boxes1, boxes2 };
        Box[][] boxes2D2 = new Box[][] { boxes1, boxes2 };

        // Посмотрим разницу в поведении сравнения через Array.equals() и Arrays.equals() и Objects.equals()
        // для многомерных массивов (массивов из массивов)
        System.out.println(Arrays.equals(boxes2D1, boxes2D2));
        System.out.println(Arrays.deepEquals(boxes2D1, boxes2D2));
        System.out.println(Objects.equals(boxes2D1, boxes2D2));
        System.out.println(Objects.deepEquals(boxes2D1, boxes2D2));

        // HashMap использует хеш от ключа для определения бакета куда надо положить значение
        HashMap<Integer, Box> boxDictionary = new HashMap<>();
        // HashSet<V> это адаптер над HashMap<V, Object> где Object - это ссылка на один и тот же объект
        HashSet<Box> boxSet = new HashSet<>();

        // Получаем хеш код по нашему алгоритму
        System.out.println(box1.hashCode());
        // Получаем идентификационный хеш код объекта (он же используется в случае если
        // вы не определили свою реализацию алгоритма расчета хеша
        System.out.println(System.identityHashCode(box1));

    }
}
