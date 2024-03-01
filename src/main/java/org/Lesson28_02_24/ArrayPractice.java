package org.Lesson28_02_24;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = {0, 1, 2, 3, 4, 5, 6};
        int[] array5 = {10, 0, 5, 9, 6, 4, 2, 3, 7, 8, 1};
        String[] strings = {"Bstring", "Astring", "bstring", "astring", "Русский"};

        System.out.println("длинна массива array2 = " + array2.length);
        System.out.println("предпоследний элемент массива = " + array2[array2.length - 2]);

        System.out.println(Arrays.toString(array2));   // метод toString класса Arrays приводит массив к строковому представлению

        int[] array3 = Arrays.copyOf(array2, 10);   // метод copyOf копирует исходный массив с 0 элемента в новый массив, с новой длинной
        System.out.println(Arrays.toString(array3));

        int[] array4 = Arrays.copyOfRange(array2, 3, 6);  // метод copyOfRange копирует исходным массив с указанием
        // индексов по которым будет проводиться копирование исключая последний индекс
        System.out.println(Arrays.toString(array4));

        Arrays.sort(array5);                                // сортируем массив по возрастанию
        printArray(array5);

        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.equals(array3,array2));
        System.out.println(Arrays.binarySearch(array2,2));

        int[] array7 = new int[10];
        Arrays.fill(array7, 8);
        System.out.println(Arrays.toString(array7));
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
