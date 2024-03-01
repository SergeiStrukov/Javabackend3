package org.Lesson27_02_24;

public class Task1 {
    public static void main(String[] args) {
//        1.	Создайте массив L = 10
//        2.	Инициализируйте массив числами от 1 до 10 используя способ литерала
//        3.	Выведите на консоль элемент из второй ячейки
//        4.	Выведите на консоль элемент из предпоследней ячейки
//        5.	Распечатайте на консоль все элементы из ячеек массива используя цикл fori
//        a.	Используйте метод .print()
//        6.	Замените все элементы в данном массиве на значение “-1”
//        7.	Распечатайте на консоль все элементы из ячеек массива используя цикл foreach
//        a.	Используйте метод  .print()
//        8.	Проанализируйте код

//    int list [] = {10,1,2,3,4,5,6,7,8,9};
//        System.out.println(list[1]);
//        System.out.println(list[8]);
//        for (int i=0; i< list.length; i++) {
//            System.out.println(list[i]);
//        }
//
//        for (int i=0; i< list.length; i++) {
//            list[i]=-1;
//        }
//        for (int element: list) {
//            System.out.println(element);
//        }
//    }
//}

// Задание 2
//Создайте массив из всех нечётных чисел от 1 до 99.
        int[] digits = new int[50];
        int next = 1;
        for (int i = 1; i < digits.length; i = i + 1) {
            next = next + 2;
            digits[i] = next;
            System.out.println(digits[i]);
        }
    }
//        Задание 3
//        1.	Дан массив целых чисел, подсчитайте сколько в массиве чётных элементов.
//
//
//        int list2[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int count = 0;
//        for (int i = 0; i < list2.length; i = i + 1) {
//            if (list2[i]%2==0) {
//                count++;
//            }
//        }
//        System.out.println(count);
//        Задание 4
//        1.	В массиве найти максимальный элемент.


}
