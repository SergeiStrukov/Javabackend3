package org.Lesson26_02_24;

public class LocalExample {
    public static void main(String[] args) {
        int someInt = 100;                      // локальная переменная метода main
        if (someInt == 200) {
            byte someByte = 5;                  // локальная переменная блока if
            System.out.println(someInt);
            System.out.println(someByte);
            for (int i = 0; i < 10; i++) {
                char someChar = '1';            // локальная переменная блока for внутри блока if
                System.out.println(someInt);
                System.out.println(someByte);
                System.out.println(someChar);
            }
            char someChar = '6';
        }

    }
}
