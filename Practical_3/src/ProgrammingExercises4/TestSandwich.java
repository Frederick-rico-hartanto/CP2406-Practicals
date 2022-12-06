package ProgrammingExercises4;

public class TestSandwich {
    public static void main(String[] args){
        Sandwich First = new Sandwich("Honey oat", 100, "Ham",145);
        System.out.println("The choice of bread is "+First.bread.getBread()+" with "
                + First.filling.getFilling()+" fillings and have a total of "+First.displayTotalCalories()+" Calories");
    }
}
