package org.Lesson28_02_24;

public class Task5 {
    // #5 Найти в массиве те элементы, значение которых меньше среднего арифметического,
    // взятого от всех элементов массива
    public static void main(String[] args) {
        double list2[] = {-10, 122.3, 24, 3, 45.9, -5, -66, 7, 86, 9, 2, 1};
        findElements(list2);
    }
    public static void findElements(double list2[]) {
        double summ = 0;
        for (int i = 0; i < list2.length; i = i + 1) {
            {
                summ += list2[i];
            }
        }
        double average = summ / list2.length;

        for (int i = 0; i < list2.length; i = i + 1) {
            if (list2[i]<average) {
                System.out.println(list2[i]);
            }
        }
    }
}
