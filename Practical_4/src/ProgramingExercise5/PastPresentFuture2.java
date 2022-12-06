package ProgramingExercise5;
import java.util.*;
import java.time.*;

public class PastPresentFuture2 {
    public static void main (String[] args){
        LocalDate today = LocalDate.now();

        LocalDate inputDate;
        int month, day, year;
        int todayMonth, todayDay, todayYear;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day: ");
        day = input.nextInt();

        System.out.print("Enter a month: ");
        month = input.nextInt();

        System.out.print("Enter a year: ");
        year = input.nextInt();

        inputDate = LocalDate.of(year, month, day);
        if(inputDate.isBefore(today))
            System.out.println(inputDate + " is in the past");
        else
        if(inputDate.equals(today))
            System.out.println(inputDate + " is today");
        else
            System.out.println(inputDate + " is in the future");
        }
    }

