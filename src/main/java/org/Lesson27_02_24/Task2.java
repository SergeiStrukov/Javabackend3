package org.Lesson27_02_24;

public class Task2 {
    //В массиве найти максимальный элемент с четным индексом
    // 1 Способ
    public static void main(String[] args) {
        int maxE = calcmax();
        System.out.println(maxE);
    }

    public static int calcmax() {
        int maxE = 10;
        int list[] = {10, 122, 24, 3, 45, 5, 6, 7, 86, 9};
        for (int i = 0; i < list.length; i = i + 1) {
            if (list[i] > maxE && i % 2 == 0) {
                maxE = list[i];
            }
        }
        return maxE;
    }
    // 2 cпособ
}

