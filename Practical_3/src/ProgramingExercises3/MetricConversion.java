package ProgramingExercises3;
import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args){

        int inch;
        int gallon;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter inches: ");
        inch = input.nextInt();

        System.out.println("Enter gallons: ");
        gallon = input.nextInt();

        inchToCmConversion(inch);
        gallonToLitersConversion(gallon);

        System.out.println(inch + " inches is " + inchToCmConversion(inch) +" cm ");
        System.out.println(gallon + " gallons is " + gallonToLitersConversion(gallon) +" liters ");
    }

    public static int inchToCmConversion(int inch){
        final double inchToCm = 2.54;
        double x = inch*inchToCm;
        return (int) x;

    }
    public static int gallonToLitersConversion(int gallon){
        final double gallonsToLiters = 3.7854;
        double y = gallon*gallonsToLiters;
        return (int) y;
    }

}
