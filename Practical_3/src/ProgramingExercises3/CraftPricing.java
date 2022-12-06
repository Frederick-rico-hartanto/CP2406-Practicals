package ProgramingExercises3;
import java.util.Scanner;

public class CraftPricing {
    public static void main (String[] args) {
        String product;
        double materials;
        double hours;
        double price;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter product name: ");
        product = input.nextLine();

        System.out.print("Enter cost of materials: ");
        materials = input.nextDouble();

        System.out.print("Enter hours of work: ");
        hours = input.nextInt();

        calculatePrice(materials, hours);
        displayTotalPrice(calculatePrice(materials, hours), product);
    }

    public static double calculatePrice(double materials, double hours){
       double totalPrice;
       totalPrice = ((materials + 12)*hours)+7;
       return totalPrice;
    }

    public static void displayTotalPrice(double totalPrice, String product){
        System.out.println(product + " will cost a total of " + "$" +totalPrice);
    }
}
