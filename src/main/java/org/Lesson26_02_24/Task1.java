package org.Lesson26_02_24;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int someInt = 100;                      // локальная переменная метода main
        if (someInt == 100) {
            byte someByte = 5;                  // локальная переменная блока if
            System.out.println(someInt);
            System.out.println(someByte);
            char someChar = '0';
            for (int i = 0; i < 10; i++) {
                someChar = '8';                 // локальная переменная блока for внутри блока if
                System.out.println(someInt);
                System.out.println(someByte);
                System.out.println(someChar);
            }

            System.out.println(someChar);
        }
        byte someByte = 5;
    }

    public static void someMethod() {
        int someInt = 100;
        byte someByte = 5;
        char someChar = '6';
    }
}