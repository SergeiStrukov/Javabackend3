package Homework6;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int positive = 0;
        int zero = 0;
        int negative = 0;
        int min = -100;
        int max = 101;
        int even = 0;
        int notEven = 0;
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int resultOfRAndom = random.nextInt(min, max);
            if (resultOfRAndom > 0) {
                positive++;
                if (resultOfRAndom % 2 == 0) {
                    even++;
                } else {
                    notEven++;
                }
            } else if (resultOfRAndom == 0) {
                zero++;
            } else {
                negative++;
                if (resultOfRAndom % 2 == 0) {
                    even++;
                } else {
                    notEven++;
                }
            }
        }
        System.out.println(positive % 200);
        System.out.println(negative % 200);
        System.out.println(zero % 200);
        System.out.println(even % 200);
        System.out.println(notEven % 200);
    }
}

// Другой способ:
//Random random = new Random();
//        return random.nextInt(max - min) + min;
//int positiv = 0;
//int negativ = 0;
//int zero = 0;

// for (int i = 0; i < 100; i++) {
//int num = getRandom(-100,100);
//}
//        int max = 100;
//        int min = -100;
//        System.out.println( min + (int) (Math.random() * ((max - min) + 1))); // !!!!
// }

//Math.random = 0 >> 1;
// min = -100;
//max = 100;
//public static int getRandom(int min, int max) {
//int result = min + (int) (Math.random() * ((max - min) + 1));
//return result;
//}
