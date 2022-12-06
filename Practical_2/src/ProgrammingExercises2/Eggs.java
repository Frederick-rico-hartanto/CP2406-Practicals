package ProgrammingExercises2;
import java.util.Scanner;

public class Eggs {
    public static void main(String[] args){
        final double DOZEN_EGGS_PRICE = 3.25;
        final double ONE_EGG = 0.45;
        final int DOZEN = 12;

        int eggs;
        int dozen;
        int looseEggs;
        double totalCost;
        Scanner value = new Scanner(System.in);
        System.out.println("How many eggs are you ordering?");
        eggs = value.nextInt();

        dozen = eggs / DOZEN;
        looseEggs = eggs % DOZEN;
        totalCost = (DOZEN_EGGS_PRICE * dozen) + (looseEggs * ONE_EGG);

        System.out.println("Amount of Ordered Eggs: " + eggs + "\nAt $" + DOZEN_EGGS_PRICE + " per dozen and $" + ONE_EGG
                + " per individual egg, that brings a total of $" + totalCost + " (" + dozen + " dozen eggs and " + looseEggs
                + " individual eggs ordered).");
    }
}
