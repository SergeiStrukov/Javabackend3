package Lesson.Homework5;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а: ");
        double a = scanner.nextDouble();
        System.out.println("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите число c: ");
        double c = scanner.nextDouble();
        System.out.println("Корни квадратного уравнения равны:");
        roots(a,b,c);
    }

    public static void roots(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        double x;
        double x2;
        if (d > 0) {
            x = (-b + Math.pow(d, 0.5)) / 2*a;
            x2 = (-b - Math.pow(d, 0.5)) / 2*a;
            System.out.println(x + " " + x2);
        } else if (d == 0) {
            x = (-b) / 2 * a;
            System.out.println(x);
        } else {
            System.out.println("Корней нет!");
        }
    }
}
