package org.kosmocourses.junior.jkvartirnik2.sort;

/**
 * Сортировка пузырьком
 * Сложность = O(n^2)
 */
public class BubbleSort {

    /**
     * Метод запуска сортировки
     *
     * @param arr массив который нужно отсортировать
     */
    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    exchange(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * Вспомогательный метод обмена двух эелементов массива
     *
     * @param arr  массив в котором надо поменять элементы
     * @param idx1 индекс "левого" элемента для обмена
     * @param idx2 индекс "правого" элемента для обмена
     */
    public static void exchange(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }


}
