package org.Homework3;

import java.util.Scanner;
import java.util.Arrays;

public class Convertor {
    //    Задание 2
//    Создайте класс Converter - конвертер системы счисления.
//    У пользователя спрашивается число системы счисления, (используйте Scanner)
//    Запрашивается само число (ожидается корректный ввод)
//    У пользователя спрашивается число системы счисления в какую перевести
//    Конвертация должна быть с помощью класса обертки Long.
    public static void main(String[] args) {
        Scanner scannerSystem = new Scanner(System.in);
        System.out.println("Выберите число системы исчисления:");
        System.out.println("Десятичная(цифра 10) или восьмеричная(цифра 8)");
        int numberSystem = scannerSystem.nextInt();
        System.out.println("В какую систему перевести в десятичную (10) или в восмеричную(8)");
        int numberSystemFinal = scannerSystem.nextInt();
        System.out.println("Введите само число:");
        int number = scannerSystem.nextInt();
        if (numberSystem == 8) {
            System.out.println("---> " + convertIntoTen(number));
        }
        if (numberSystemFinal == 8) {
            System.out.println("---> " + convertFromTen(number));
        }
    }

    public static int convertIntoTen(int number) {
        int result = 0;
        int degree = 0;
        while (true) {
            if (number > 0) {
                result += number % 10 * Math.pow(8, degree);
                degree++;
                number = number / 10;
            } else {
                break;
            }
        }
        return result;
    }

    public static String convertFromTen(int num) {
        String result = "";
        if (num == 0) {
            return result = "0";
        }
        while (true) {
            if (num > 0) {
                result += num % 8;
                num /= 8;
            } else {
                break;
            }
        }
        return new StringBuilder(result).reverse().toString();
    }
}

