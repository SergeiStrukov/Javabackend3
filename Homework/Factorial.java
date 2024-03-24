package org.Homework;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число факториал:");
        int number = scanner.nextInt();
        int factorial = countFactorial(number);
        System.out.println("Факториал данного числа равен: " + factorial);
    }
    public static int countFactorial(int number) {
        int factorial = 1; // минимальное целое значение факториала
        for (int i = 1; i <= number; i = i + 1) {
            factorial *= i;
        }
        return factorial;
    }
}
