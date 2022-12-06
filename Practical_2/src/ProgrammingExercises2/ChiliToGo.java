package ProgrammingExercises2;
import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args){
        final int ADULTCOST = 7, CHILDCOST = 4;
        int adultMeal, childMeal, total;
        String adultNumber, childNumber;

        Scanner input = new Scanner(System.in);

        //Adult input
        System.out.println("Please enter the amount of adult: ");
        adultNumber = input.nextLine();
        adultMeal = Integer.parseInt(adultNumber);

        //Children Input
        System.out.println("Please enter the amount of children: ");
        childNumber = input.nextLine();
        childMeal = Integer.parseInt(childNumber);

        //Formulas
        adultMeal *= ADULTCOST;
        childMeal *= CHILDCOST;
        total = adultMeal + childMeal;

        //print
        System.out.println("Total adults meals: " + "$" +adultMeal +
                "\nTotal Childrens meals: " + "$" +childMeal +
                "\nTotal balance: " + "$" +total);


    }
}
