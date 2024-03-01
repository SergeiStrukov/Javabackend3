package org.Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //trapezoid perimeter
        Scanner scanner = new Scanner(System.in); // Создали объект сканера, для принятия параметров из консоли.
        System.out.println("Enter the value of 4 sides:");
        double side1 = scanner.nextDouble();
        System.out.println("Second side is:");
        double side2 = scanner.nextDouble();
        System.out.println("Third side is:");
        double side3 = scanner.nextDouble();
        System.out.println("Fourth side is:");
        double side4 = scanner.nextDouble();
        double perimeter = calculateperimeter(side1, side2, side3, side4);
        System.out.println(perimeter);
    }

    public static double calculateperimeter(double side1, double side2, double side3, double side4) { // Метод для расчета периметра.
        double perimeter = side1 + side2 + side3 + side4;
        return perimeter;
    }
}

