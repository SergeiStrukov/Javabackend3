package org.Homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        ДЗ: написать программу, которая принимает в качестве аргумента число из консоли используя Scanner.
//                программа должна вывести на экран результат факториала этого числа 3 раза, используя разные методы.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число факториал:");
        int number = scanner.nextInt();
        int factorial = countFactorial(number);
        System.out.println("Факториал данного числа равен: " + factorial);

        // Способ через while
        System.out.println("Факториал данного числа равен: (Способ через while)");
        int factorial2 = countFactorial2(number);
        System.out.println(factorial2);

        // Способ через do while
        System.out.println("Факториал данного числа равен: (Способ через do while)");
        int factorial3 = countFactorial3(number);
        System.out.println(factorial3);
    }

    public static int countFactorial(int number) {
        int factorial = 1; // минимальное целое значение факториала
        for (int i = 1; i <= number; i = i + 1) {
            factorial *= i;
        }
        return factorial;
    }

    public static int countFactorial2(int number) {
        int factorial = 1; // минимальное целое значение факториала
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i = i + 1;
        }
        return factorial;

    }

    public static int countFactorial3(int number) {
        int factorial = 1; // минимальное целое значение факториала
        int i = 1;
        do {
            factorial *= i;
            i = i + 1;
        } while (i <= number);
        return factorial;
    }
}
