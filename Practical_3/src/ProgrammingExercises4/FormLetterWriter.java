package ProgrammingExercises4;

public class FormLetterWriter {
    public static void main(String[] args) {
        FormLetterWriter player = new FormLetterWriter();

        displaySalutation("Hartanto");
        displayLetter();
        displaySalutation("Frederick","Rico" ,"Hartanto");
        displayLetter();
    }

    public static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName);
    }

    public static void displaySalutation(String firstName, String middleName,String lastName) {
        System.out.println("Dear "+firstName+" "+middleName+" "+lastName);
    }

    public static void displayLetter() {
        System.out.println("Thank you for your recent order");
    }
}
