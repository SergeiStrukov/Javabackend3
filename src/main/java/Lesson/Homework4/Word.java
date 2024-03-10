package Lesson.Homework4;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 слово:");
        String word1 = scanner.nextLine();
        System.out.println("Введите 2 слово:");
        String word2 = scanner.nextLine();
        if (word1.length() % 2 == 0 && word2.length() % 2 ==0){
            word1 = word1.substring(0,word1.length() / 2);
            word2 = word2.substring(word2.length()/2);
            System.out.println(word1+word2);
        } else {
            System.out.println("Введите корректное значение word1 и word2!");
        }
    }
}
