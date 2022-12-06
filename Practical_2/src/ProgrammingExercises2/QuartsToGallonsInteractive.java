package ProgrammingExercises2;
import java.util.Scanner; //to get user input

public class QuartsToGallonsInteractive {
    public static void main(String[] args){
        final int QUARTS_PER_GALLON = 4;// Constant

        int numQuarts, remainder; //Storing values
        Scanner input = new Scanner(System.in);

        System.out.println("How many quarts of paint do you need for the painting job? ");//Asking for input
        numQuarts = input.nextInt();

        int gallons = numQuarts / QUARTS_PER_GALLON;//Formula

        remainder = numQuarts % QUARTS_PER_GALLON;

        System.out.println(" A paint job requires " + numQuarts +
                " quarts, requires " + gallons + " gallons and " + remainder + " quarts ");
    }
}
