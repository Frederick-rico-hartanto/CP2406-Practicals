package ProgrammingExercises2;
import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args){
        final int FEET_IN_INCHES = 12;
        int inches, remainder;

        Scanner value = new Scanner(System.in);
        System.out.println("How many inches? ");
        inches = value.nextInt();

        int feet = inches / FEET_IN_INCHES;
        remainder = inches % FEET_IN_INCHES;

        System.out.println(inches + " inches is " + feet + " feet " + remainder + " inches ");
    }

}
