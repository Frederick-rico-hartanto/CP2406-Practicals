package ProgrammingExercise6;
import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args)
    {

        final int NUMBER_PER_LINE;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int userInput = input.nextInt();

        NUMBER_PER_LINE = userInput * 10;
        for (int numb = userInput; numb <= 300; numb+=userInput)
        {
            System.out.println(numb + " ");
            if (numb%NUMBER_PER_LINE == 0)
            {
                System.out.println();
            }
        }
    }
}
