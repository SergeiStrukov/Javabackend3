package org.example250224lesson3;

public class Task4 {
    public static void main(String[] args) {
/*
        double a = 21;
        double b = 12;
        char operation = '+';

        if (operation == '*') {
            System.out.println(a * b);
        } else if (operation == '/') {
            if (b == 0) {
                System.out.println("Ошибка");
            } else {
                System.out.println(a / b);
            }
        } else if (operation == '-') {
            System.out.println(a - b);
        } else {
            System.out.println(a + b);
        }
    }
}*/

        double a = 21;
        double b = 0;
        char operation = '/';

        switch (operation) {
            case '*':
                System.out.println(a*b);
                break;
            case '+':
                System.out.println(a+b);
                break;
            case '/': if (b==0) {
                System.out.println("Ошибка");
            } else {
                System.out.println(a/b);
            }
                break;
            case '-':
                System.out.println(a-b);
                break;
        }
    }
}


