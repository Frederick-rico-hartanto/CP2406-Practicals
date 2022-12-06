package ProgramingExercises3;

import java.util.Scanner;

public class Insurance {
    public static void main(String[] args){
        int birth_year, current_year;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter current year: ");
        current_year = input.nextInt();

        System.out.println("Enter birth year:");
        birth_year = input.nextInt();

        calculatePremium(current_year, birth_year);
        System.out.println("Your Premium amount is " + "$" +calculatePremium(current_year, birth_year));
    }

    public static int calculatePremium(int current_year, int birth){
        int age = (current_year - birth)/10;
        int premium = (age + 15)*20;
        return premium;
    }
}
