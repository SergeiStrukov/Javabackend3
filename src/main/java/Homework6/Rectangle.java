package Homework6;

public class Rectangle {
    public static void main(String[] args) {
        int m = 7; // стороны прямоугольника
        int n = 5;
//Показать на экране прямоугольник размером MxN, состоящий из
//звёздочек
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print("* ");
//                if (j == m - 1) {
//                    System.out.println("");
//                }
//            }
//        }
//        Затем сделать то же самое, но чтоб фигура внутри была пустая (остаётся только рамка).
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || j == m - 1 || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
