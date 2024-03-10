package org.Homework3;

public class CaloriesCalc {
    public static void main(String[] args) {
        int R1 = 24/2;
        int R2 = 28/2;
        System.out.println(countCalories(R2)-countOverCalories(R1));
    }
    public static double countCalories(int R1){
        double S1 = Math.PI * Math.pow(R1,2);
        double calories1 = S1 * 40;
        return calories1;
    }
    public static double countOverCalories(int R2){
        double S2 = Math.PI * Math.pow(R2,2);
        double calories2 = S2 * 40;
        return calories2;
    }
}
