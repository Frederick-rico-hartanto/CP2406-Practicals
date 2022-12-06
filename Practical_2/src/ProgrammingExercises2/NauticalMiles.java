package ProgrammingExercises2;

public class NauticalMiles {
    public static void main(String[] args){
        final double KILOMETER = 1.852; //constant kilometer
        final double MILES = 1.150779; //constant miles
        int nauticalMiles = 30;

        float km = (float) (nauticalMiles/KILOMETER); //Change double to float
        float miles = (float) (nauticalMiles/MILES);

        System.out.println("There are " + km+ " kilometers and " + miles + " miles in "
                + nauticalMiles + " nautical miles.");

    }
}
