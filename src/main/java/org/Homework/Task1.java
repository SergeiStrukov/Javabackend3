package org.Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // расчет площади треугольника:
        Scanner scanner = new Scanner(System.in); // Создали объект сканера, для принятия параметров из консоли.
        System.out.println("Enter the value of base:");
        double base = scanner.nextDouble();
        System.out.println("Enter the value of height:");
        double height = scanner.nextDouble();
        double square = calculatesquare(base,height); // Вызываем метод с аргументами, которые задали в консоли.
        System.out.println(square);

    }
    public static double calculatesquare (double base, double height) { // метод для расчета площади треугольника.
        double square = base * height * 0.5;
        return square;
    }
}
