package DebugingExercises2;

public class FixDebugTwo3 {
    public static void main(String[] args) //Wrong brackets
    {
        int a = 99, b = 8, result;
        long c = 7777777777777L;
        result = a % b;
        System.out.println("Divide " + a + " by " + b);
        System.out.println("remainder is " + result);
        System.out.print("c is a very large number: ");
        System.out.println(c);
    }

}
