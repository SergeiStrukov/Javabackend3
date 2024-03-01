package org.example250224lesson3;

public class Task5 {
    public static void main(String[] args) {
        printNumbers();
        //    В диапазоне от 0 до 100 вывести на экран первые 25 четных чисел , исключая "Десятки".
    }
    public static void printNumbers() {
        int summ = 0;
        for (int i = 0; i <= 100; i = i + 2) {
            if (i % 2 == 0 && i % 10 != 0 && summ < 25) {
                summ++;
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println(summ);
        int a = 5;
        int b = 3;
        double result = Math.pow(a, b);
        System.out.println(result);
    }

}
// Или добавить условие : if (summ == 26) {
// break
//}
