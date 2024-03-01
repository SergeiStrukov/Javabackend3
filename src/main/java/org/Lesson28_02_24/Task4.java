package org.Lesson28_02_24;

public class Task4 {
    // #4 Найти среднее арифметическое от всех элементов массива
    public static void main(String[] args) {
        double list2[] = {-10, 122.3, 24, 3, 45.9, -5, -66, 7, 86, 9, 2, 1};
        double average = calcAverage(list2);
        System.out.println(average);
    }

    public static double calcAverage(double list2[]) {
        double summ = 0;
        for (int i = 0; i < list2.length; i = i + 1) {
            {
                summ += list2[i];
            }
        }
        double average = summ / list2.length;
        return average;
    }
}
