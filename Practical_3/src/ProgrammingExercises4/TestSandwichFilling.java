package ProgrammingExercises4;

public class TestSandwichFilling {
    public static void main(String[] args){
        SandwichFilling Sandwich1 = new SandwichFilling("Ham", 145);
        SandwichFilling Sandwich2 = new SandwichFilling("Lettuce", 15);
        SandwichFilling Sandwich3 =new SandwichFilling("Turkey", 210);
        System.out.println("Your sandwich has "+Sandwich1.getFilling()+" inside and it is "
                +Sandwich1.getCalories()+" calories.");
        System.out.println("Your sandwich has "+Sandwich2.getFilling()+" inside and it is "
                +Sandwich2.getCalories()+" calories.");
        System.out.println("Your sandwich has "+Sandwich3.getFilling()+" inside and it is "
                +Sandwich3.getCalories()+" calories.");
    }

}
