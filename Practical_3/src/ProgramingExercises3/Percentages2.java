package ProgramingExercises3;
import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args){
        double a;
        double b;
        a = getValue1();
        b = getValue2();
        computePercent(a, b);
    }

    public  static double getValue1() {
        double a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value: ");
        a = input.nextDouble();
        return a;
    }

    public  static double getValue2(){
        double b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value: ");
        b = input.nextDouble();
        return b;
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
