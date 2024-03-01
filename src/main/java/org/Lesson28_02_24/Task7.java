package org.Lesson28_02_24;

public class Task7 {
    public static void main(String[] args) {
        // Задача 7
        // Найти номер минимального по модулю элемента массива.
        int minE = findE();
        System.out.println(minE);
    }

    public static int findE() {
        int list[] = {10, 122, 24, 3, 45, 5, 6, 7, 86, 9, 1, -1, -10, 0};
        int minE = list[0];
        int number = 0;
        for (int i = 0; i < list.length; i = i + 1) {
            if (Math.abs(minE) > Math.abs(list[i])) {
                minE = list[i];
                number = i;
            }
        }
        return number;
    }
}
