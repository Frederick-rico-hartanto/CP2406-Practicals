package DebuggingExercise3;
import java.util.Scanner;
public class FixDebugThree3 {
    public static void main(String[] args)
    {
        String name;
        name = getName();
        displayGreeting(name);
    }
    public static String getName()
    {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();// Not nextInt it must be nextLine since its string
        return name;
    }
    public static void displayGreeting(String name)
    {
        System.out.println("Hello, " + name + "!");
    }
}
