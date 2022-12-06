package ProgrammingExercises2;
import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        int timeMinutes;
        int ONE_HOUR_IN_MIN = 60;
        double ONE_DAY_IN_MIN = 1440;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter minute: ");
        timeMinutes = input.nextInt();

        double days = timeMinutes / ONE_DAY_IN_MIN;
        int hours = timeMinutes/ONE_HOUR_IN_MIN;

        System.out.println(timeMinutes + " minutes equals " + hours + " hours and equals " + days + " days ");
    }
}
