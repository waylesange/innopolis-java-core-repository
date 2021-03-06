/*
 * Copyright (c) 2019. Alexander Tsupko (alexander.tsupko@outlook.com). All rights reserved.
 */

package ru.innopolis.assignments.week1.assignment02;

/**
 * Класс {@code InsertionSort} использует алгоритм сортировки вставками для упорядочивания массива,
 * состоящего из объектов класса {@code Integer}, созданных генератором псевдослучайных чисел.
 *
 * @author Александр Цупко
 */
public class InsertionSort {
    /**
     * Метод {@code sort(Integer[])} использует алгоритм сортировки вставками:
     * он включает в себя два вложенных цикла, один из которых пробегает все элементы массива, начиная со второго,
     * а другой, начиная с того же элемента на текущей итерации, пробегает элементы в обратном порядке,
     * сравнивая текущий элемент с предыдущим, и меняет порядок следования элементов, если порядок нарушен,
     * иначе завершает итерацию, чтобы сэкономить на дополнительных проверках уже отсортированных элементов.
     *
     * @param a массив объектов класса {@code Integer}, который нужно отсортировать
     */
    public void sort(Integer[] a) {
        if (a == null) {
            throw new IllegalArgumentException("входящий массив не должен быть null");
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    int t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                } else {
                    break;
                }
            }
        }
    }

    /**
     *  Выводит содержимое переданного массива в консоль построчно.
     *
     * @param a массив объектов класса {@code Integer}, который нужно вывести
     */
    public void print(Integer[] a) {
        if (a == null) {
            throw new IllegalArgumentException("входящий массив не должен быть null");
        }
        for (Integer integer : a) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
