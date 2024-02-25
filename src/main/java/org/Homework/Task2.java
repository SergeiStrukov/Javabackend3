package org.Homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Объём куба
        Scanner scanner = new Scanner(System.in); // Создали объект сканера, для принятия параметров из консоли.
        System.out.println("Enter the value of side:");
        double side = scanner.nextDouble(); // вводим значение стороны в консоли.
        double size = calculateSize(side); // Вызываем метод со значением, которое задали в консоли.
        System.out.println(size);

    }
    public static double calculateSize (double side) { // Метод для расчета объёма куба.
        double size = Math.pow(side,3);
        return size; // возвращаем значение
    }
}
