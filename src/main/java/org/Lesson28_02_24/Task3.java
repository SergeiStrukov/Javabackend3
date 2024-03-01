package org.Lesson28_02_24;

public class Task3 {
    // #3 В массиве, содержащем положительные и отрицательные целые числа,
    // Вычислить сумму четных положительных элементов
    public static void main(String[] args) {
        int list[] = {-10, 122, 24, 3, 45, -5, -6, 7, 86, 9, 2, 1};
        int sumPositive = calcPositive(list);
        System.out.println(sumPositive);
    }

    public static int calcPositive(int list[]) {
        int sumPositive = 0;
        for (int i = 0; i < list.length; i = i + 1) {
            if (list[i] > 0 && list[i] % 2 == 0) {
                sumPositive += list[i];
            }
        }
        return sumPositive;
    }
}
