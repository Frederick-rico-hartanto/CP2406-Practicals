package ProgramingExercise5;
import java.util.*;
import java.time.*;

public class PastPresentFuture {
    public static  void main(String[] args){
        LocalDate today = LocalDate.now();

        int month, day, year;
        int todayMonth, todayDay, todayYear;

        Scanner input = new Scanner(System.in);

        todayMonth = today.getMonthValue();
        todayDay = today.getDayOfMonth();
        todayYear = today.getYear();

        System.out.print("Enter a day: ");
        day = input.nextInt();

        System.out.print("Enter a month: ");
        month = input.nextInt();

        System.out.print("Enter a year: ");
        year = input.nextInt();

        if(year != todayYear)
            System.out.println(year + " is not this year");
        else if(month < todayMonth)
                System.out.println(month + " was a month earlier this year");
        else if(month > todayMonth)
                System.out.println(month + " is a month later this year");
            else
                System.out.println(month + " is this month");
    }
}
