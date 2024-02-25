package org.example250224lesson3;

import java.sql.SQLOutput;

public class Task3 {
    public static void main(String[] args) {
        // Программа принимает 3 вещественных числа.
        // И будет выводить на экран ТО число, чей остаток от деления на 1.5 - меньше остальных.
        // Для наглядности выводить и сам остаток

        double a = 36.5;
        double b = 26.9;
        double c = 36.1;

        double reminder = a % 1.5;
        double reminder2 = b % 1.5;
        double reminder3 = c % 1.5;

        if (reminder < reminder2 && reminder < reminder3) {
            System.out.println(a);
        } else if (reminder2 < reminder && reminder2 < reminder3) {
            System.out.print(b);
        } else {
            System.out.println(c);
        }
    }
}
