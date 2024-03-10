package Lesson.Homework4;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а:");
        double a = scanner.nextDouble();
        System.out.println("Введите число b:");
        double b = scanner.nextDouble();
        System.out.println("Сумма чисел равна: " + calculateSumm(a, b));
        System.out.println("Разность чисел равна: " + calculateMinus(a, b));
        System.out.println("Произведение чисел равно: " +calculateMultiply(a, b));
        System.out.println("Деление чисел равно: " + calculateDivision(a, b));
    }

    public static double calculateSumm(double a, double b) {
        double summ = a + b;
        return summ;
    }

    public static double calculateMinus(double a, double b) {
        double minus = a - b;
        return minus;
    }

    public static double calculateMultiply(double a, double b) {
        double multiply = a * b;
        return multiply;
    }

    public static double calculateDivision(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not exist!");
            System.exit(0);
        }
        double division = a / b;
        return division;
    }
}
