package org.Homework;

import java.util.Scanner;

public class ValidAccountNumber {
    public static void main(String[] args) {
//        1 уровень сложности: 1. Проверка номера банковского счета.
//        Создайте метод isValidAccountNumber(String accountNumber),
//        который возвращает true в случае успешной проверки.
//        БС может содержать только 14 цифр.
//        Все 14 цифр не могут быть нулями.
//        Номер счета не может быть null или пустым.
//        Проверьте с помощью метода main()
//        Напишите тесты используя библиотеку JUnit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите №БС:");
        String number = scanner.nextLine();
        System.out.println(isValidAccountNumber(number));
    }

    public static boolean isValidAccountNumber(String number) {
        if (number.length()!=14) {
            return false;
        }
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (digit < '1' || digit > '9') {
                return false;
            }
        } return true;
    }
}
