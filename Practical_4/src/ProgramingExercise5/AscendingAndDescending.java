package ProgramingExercise5;
import java.util.*;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int number1, number2, number3;
        int lowest, medium, largest;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        number1 = input.nextInt();

        System.out.println("Enter second number:");
        number2 = input.nextInt();

        System.out.println("Enter Third number:");
        number3 = input.nextInt();

        if (number1 < number2 && number1 < number3) {
            lowest = number1;
            if (number2 < number3) {
                medium = number2;
                largest = number3;
            }
            else {
                medium = number3;
                largest = number2;
            }
        }
        else if (number2 < number1 && number2 < number3) {
            lowest = number2;
            if (number1 < number3) {
                medium = number1;
                largest = number3;
            }
            else {
                medium = number3;
                largest = number1;
            }
        }
        else
        {
            lowest = number3;
            if (number1 < number2){
                medium = number1;
                largest = number2;
            }
            else {
                medium = number2;
                largest = number1;
            }
        }
        System.out.println("The number in ascending order is " + lowest + " " + medium + " " + largest);
        System.out.println("The number in descending order is " + largest + " " + medium + " " + lowest);
    }

}
