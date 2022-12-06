package ProgrammingExercises2;
import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main(String[] args){
        final double KILOMETER = 1.852;
        final double MILES = 1.150779;

        int nauticalMiles;
        Scanner value = new Scanner(System.in);

        System.out.println("How many nautical miles? ");
        nauticalMiles = value.nextInt();

        float km = (float) (nauticalMiles/KILOMETER);
        float miles = (float) (nauticalMiles/MILES);

        System.out.println("There are " + km+ " kilometers and " + miles + " miles in "
                + nauticalMiles + " nautical miles.");

    }
}
