package ProgrammingExercises2;

public class InchesToFeet {
    public static void main(String[] args){
        final int FEET_IN_INCHES = 12;
        int inches = 86, remainder;

        int feet = inches / FEET_IN_INCHES;
        remainder = inches % FEET_IN_INCHES;

        System.out.println(inches + " inches is " + feet + " feet " + remainder + " inches ");
    }
}
