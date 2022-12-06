package ProgramingExercises3;
import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        String studentName;
        double gradePointAvg;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        studentName = input.nextLine();

        System.out.println("Enter your GPA: ");
        gradePointAvg = input.nextDouble();

        calculateCredit(studentName, gradePointAvg);
    }

    public static void calculateCredit(String studentName, double gradePointAvg){
        String formatCredit;
        double credit;
        final int RATE = 10;
        credit = gradePointAvg * RATE;
        formatCredit = String.format("%.2f", credit);
        System.out.print("Hello " + studentName + ", your GPA is " + gradePointAvg + ". Your bookstore credit is $" +
                formatCredit + "!");
    }

}
