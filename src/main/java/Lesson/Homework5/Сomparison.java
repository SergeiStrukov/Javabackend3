package Lesson.Homework5;

import java.util.Scanner;

public class Сomparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а: ");
        double a = scanner.nextDouble();
        System.out.println("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите число c: ");
        double c = scanner.nextDouble();
        if (a==b || a==c || b==c) {
            System.out.println("Запишите верно три попарно не равных числа между собой:");
        } else if (a < b && a < c && b < c ) {
            System.out.println(a+" "+b+" "+c);
        } else if (b < a && b < c && a < c) {
            System.out.println(b+" "+a+" "+c);
        } else if (b < c && b < a && c < a) {
            System.out.println(b+" "+c+" "+a);
        } else if (a < c && a < b && c < b) {
            System.out.println(a+" "+c+" "+b);
        } else if (c < a && c < b && a < b) {
            System.out.println(c+" "+a+" "+b);
        } else {
            System.out.println(c+" "+b+" "+a);
        }
    }
}
