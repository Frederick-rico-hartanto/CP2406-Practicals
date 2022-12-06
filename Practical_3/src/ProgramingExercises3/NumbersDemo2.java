package ProgramingExercises3;
import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args) {
        int a;
        int b;
        a = getValue1();
        b = getValue2();
        System.out.println(displayTwiceTheNumber(a,b));
        System.out.println(displayNumberPlusFive(a,b));
        System.out.println(displayNumberSquared(a,b));
    }

    public  static int getValue1(){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value: ");
        a = input.nextInt();
        return a;
    }

    public  static int getValue2(){
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter second value: ");
        b = input.nextInt();
        return b;
    }

    public static  int displayTwiceTheNumber(int a, int b){
        int c;
        c = 2 * (a + b);
        return c;
    }//Using public static int since we are working it integers in the methods

    public static  int displayNumberPlusFive(int a, int b){
        int c;
        c = (a+b) + 5;
        return c;
    }

    public static int displayNumberSquared(int a, int b){
        int c;
        c = (a+b) * (a+b);
        return c;
    }

}
