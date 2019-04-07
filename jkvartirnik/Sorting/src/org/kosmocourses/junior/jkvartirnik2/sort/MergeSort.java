package org.kosmocourses.junior.jkvartirnik2.sort;

import java.util.Arrays;

/**
 * Сортировка слиянием
 * Сложность = O(n*log n)
 * <p>
 * Алгоритм работы в формате "номер_массива:{данные}":
 * шаг №0: 0:{0, 3, 5, 1, 4, 2} <- исходные данные массива "0"
 * шаг №1: 1:{0, 3, 5} 2:{1, 4, 2} <- делим примерно по середине, получаем 2 массива "1" и "2"
 * шаг №2: 1:{0, 3} 3:{5} 2:{1, 4} 4:{2} <- делим примерно по середине те массивы где более одного элемента
 * шаг №3: 5:{0} 6:{3} 3:{5} 7:{1} 8:{4} 4:{2} <- получили массивы из одного элемента, каждый из них упорядочен
 * шаг №4: 9:[0, 3] 3:{5} 10:[1, 4] 4:{2} <- далее начинаем слияние, обединяем массивы "5" и "6" в массив "9", а также массивы "7" и "8" в массив "10"
 * шаг №5: 11:[0, 3, 5] 12:[1, 2, 4] <- далее начинаем слияние, обединяем массивы "9" и "3" в массив "11", а также массивы "10" и "4" в массив "12"
 * шаг №6: 13:[0, 1, 2, 3, 4, 5] <- далее начинаем слияние, обединяем массивы "11" и "12" в массив "13"
 */
public class MergeSort {

    /**
     * Метод запуска сортировки
     * Запускает рекурсивное деление исходного массива
     *
     * @param arr массив который нужно отсортировать
     */
    public static int[] sort(int[] arr) {
        if (arr.length < 2) return arr;
        int m = arr.length / 2;
        int[] leftArray = Arrays.copyOfRange(arr, 0, m);
        int[] rightArray = Arrays.copyOfRange(arr, m, arr.length);
        return merge(sort(leftArray), sort(rightArray));
    }

    /**
     * Метод слияния двух упорядоченных массивов в один
     *
     * @param leftArray  левый упорядоченный массив
     * @param rightArray правый упорядоченный массив
     * @return
     */
    public static int[] merge(int[] leftArray, int rightArray[]) {
        int n = leftArray.length + rightArray.length;
        int[] mergedArray = new int[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == leftArray.length) {
                mergedArray[i] = rightArray[i2++];
            } else if (i2 == rightArray.length) {
                mergedArray[i] = leftArray[i1++];
            } else {
                if (leftArray[i1] < rightArray[i2]) {
                    mergedArray[i] = leftArray[i1++];
                } else {
                    mergedArray[i] = rightArray[i2++];
                }
            }
        }
        return mergedArray;
    }
}
