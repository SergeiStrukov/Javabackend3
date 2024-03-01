package org.Lesson27_02_24;

public class Task2_2 {
    public static void main(String[] args) {
        int list[] = {10, 122, 24, 3, 45, 5, 6, 7, 86, 9};
        int maxE = calcmax(list);
        System.out.println(maxE);
    }

    public static int calcmax(int list[]) {
        int maxE = 10;
        for (int i = 0; i < list.length; i = i + 1) {
            if (list[i] > maxE && i % 2 == 0) {
                maxE = list[i];
            }
        }
        return maxE;
    }
}
