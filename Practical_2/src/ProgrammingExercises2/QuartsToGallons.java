package ProgrammingExercises2;

public class QuartsToGallons {
    public static void main(String[] args){
        final int QUARTS_PER_GALLON = 4;// Constant

        int numQuarts = 18, remainder; //Storing values

        int gallons = numQuarts / QUARTS_PER_GALLON;//Formula

        remainder = numQuarts % QUARTS_PER_GALLON;//Formula

        System.out.println(" A paint job requires " + numQuarts +
                " quarts, requires " + gallons + " gallons and " + remainder + " quarts ");
    }
}
