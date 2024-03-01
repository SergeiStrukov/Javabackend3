package org.Homework;

import java.util.Scanner;

public class Task4 {
    // Площадь сферы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создали объект сканера, для принятия параметров из консоли.
        System.out.println("Enter the value of radius:");
        double radius = scanner.nextDouble(); // Введите значение радиуса.
        double sphere = countsphere(radius); // Вызываем метод со значением, которое задали в консоли.
        System.out.println("value of sphere is: " + sphere);
    }

    public static double countsphere(double radius) { // Метод для расчета площади сферы.
        double sphere = 4 * Math.PI * Math.pow(radius, 2);
        return sphere;
    }
}
