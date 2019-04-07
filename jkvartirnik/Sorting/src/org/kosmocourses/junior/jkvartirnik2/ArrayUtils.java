package org.kosmocourses.junior.jkvartirnik2;

/**
 * Created by Vladislav Gasanov on 06.04.2019.
 */
public class ArrayUtils {

    /**
     * Данный метод применяется для форматированной печати массива чисел в консоль
     *
     * @param arr исходный массив
     */
    public static void printArray(int[] arr) {
        boolean hasPreviousElement = false;
        System.out.print("{");
        for (int anArr : arr) {
            if (hasPreviousElement) {
                System.out.print(", ");
            }
            System.out.print(anArr);
            hasPreviousElement = true;
        }
        System.out.println("}");
    }

    /**
     * Данный метод применяется для генерации одного и того же массива
     *
     * @return возвращает массив чисел
     */
    public static int[] makeIntArray() {
        return new int[]{0, 3, 5, 1, 4, 2};
    }
}
