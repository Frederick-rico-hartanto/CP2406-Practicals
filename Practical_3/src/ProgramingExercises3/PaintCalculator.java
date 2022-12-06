package ProgramingExercises3;
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        double length;
        double width;
        double height;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the length of your rectangular room wall: ");
        length = keyboard.nextDouble();

        System.out.print("What is the width of your rectangular room wall: ");
        width = keyboard.nextDouble();

        System.out.print("What is the height of your rectangular room wall: ");
        height = keyboard.nextDouble();

        calculateWallArea(length, width, height);
        gallonsNeeded(calculateWallArea(length, width, height));
        displayGallonsNeeded(gallonsNeeded(calculateWallArea(length, width, height)));
        calculatePrice(gallonsNeeded(calculateWallArea(length, width, height)));
        displayTotalPrice(calculatePrice(gallonsNeeded(calculateWallArea(length, width, height))));
    }

        public static double calculateWallArea(double length, double width, double height){
            double wallArea;
            double perimeter = (length * 2) + (width * 2);
            wallArea = perimeter * height;
            return wallArea;
        }

        public static double gallonsNeeded(double wallArea){
            final double SQFTPERGALLON = 350;
            double gallonsNeeded = wallArea / SQFTPERGALLON;
            return gallonsNeeded;
        }

        public static void displayGallonsNeeded(double gallonsNeeded){
            System.out.println("You need " + gallonsNeeded + " gallons of paint.");
        }

        public static double calculatePrice(double gallonsNeeded){
            double totalPrice;
            final double PRICEPERGALLON = 32;
            totalPrice = PRICEPERGALLON * gallonsNeeded;
            return totalPrice;
        }

        public static void displayTotalPrice(double totalPrice){
            System.out.println("The total price is $" + totalPrice + ".");
        }
    }

