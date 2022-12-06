package ProgramingExercises3;

public class Percentages {
    public static void main(String[] args){
        double a = 2.0;
        double b = 5.0;
        computePercent(a, b);
    }

    public static void computePercent(double a, double b){
        double percentageOf = a / b;
        double percentage = percentageOf * 100;

        System.out.println(a + " is " +percentage+ "% of "  + b);

        double percentageReverse = b / a;
        double percentageR = percentageReverse * 100;

        System.out.println(b + " is " +percentageR+ "% of "  + a);

    }

}
