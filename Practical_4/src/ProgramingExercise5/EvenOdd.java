package ProgramingExercise5;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number 0-100: ");
        int number = input.nextInt();
        while (number < 0 || number > 100){
            System.out.println("Please enter a number 0-100: ");
            number = input.nextInt();
        }

        if (number % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
