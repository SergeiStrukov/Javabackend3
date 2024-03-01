package org.Lesson28_02_24;

public class Task6 {
    // #6 Вычислить сумму модулей элементов массива  (для вычисления модуля используйте Math.abs() )
    public static void main(String[] args) {
        int list[] = {-10, 122, 24, 3, 45, -5, -6, 7, 86, 9, 2, 1};
        int sumModules = calcModules(list);
        System.out.println(sumModules);
    }

    public static int calcModules(int list[]) {
        int sumModule = 0;
        for (int i = 0; i < list.length; i = i + 1) {
            sumModule += Math.abs(list[i]);
        }
        return sumModule;
    }
}
