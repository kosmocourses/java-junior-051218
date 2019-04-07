package org.kosmocourses.junior.jkvartirnik2.sort;

/**
 * Быстрая сортировка
 * Сложность = O(n*log n) в худшем случае O(n^2) если опорный элемент выбран неверно
 */
public class QuickSort {
    private static int[] numbers;
    private static int number;

    /**
     * Метод запуска сортировки
     *
     * @param arr массив который нужно отсортировать
     */
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        numbers = arr;
        number = arr.length;
        quicksort(0, number - 1);
    }

    /**
     * Алгоритм сортировки, выбирает опрорный элемент pivot, перебрасывает все элементы значения
     * которых меньше чем у опорного в левую часть, а больше опорного в правую и вызывает
     * рекурсивно себя на левой и правой половинах.
     *
     * @param low  индекс начала области для сортировки
     * @param high индекс конца области для сортировки
     */
    private static void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = numbers[low + (high - low) / 2];

        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }

            while (numbers[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }

        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    /**
     * Вспомогательный метод обмена двух эелементов массива
     *
     * @param idx1 индекс "левого" элемента для обмена
     * @param idx2 индекс "правого" элемента для обмена
     */
    private static void exchange(int idx1, int idx2) {
        int temp = numbers[idx1];
        numbers[idx1] = numbers[idx2];
        numbers[idx2] = temp;
    }
}
