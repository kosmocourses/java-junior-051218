package org.kosmocourses.junior.jkvartirnik2.comparator;

import java.util.Comparator;

/**
 * "Сортировщик" котов/кошек
 */
public class CatComparator implements Comparator<Cat> {

    /**
     * Алгоритм сравнения по весу
     *
     * @param o1 кот/кошка №1 для сравнения
     * @param o2 кот/кошка №2 для сравнения
     * @return возвращает -1 если кот/кошка №1 меньше по весу чем кот/кошка №2,
     * 0 если кот/кошка №1 равна по весу чем кот/кошка №2,
     * 1 если кот/кошка №1 больше по весу чем кот/кошка №2.
     */
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.w > o2.w ? 1 :(o1.w == o2.w ? 0 : -1 );
    }
}
