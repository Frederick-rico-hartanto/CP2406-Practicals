package ProgrammingExercises4;

public class TestBread {
    public static void main(String[] args) {
        Bread Chocolate = new Bread("Honey oat", 100);
        Bread Plain = new Bread("Italian herbs and cheese", 500);
        Bread Croissant = new Bread("Italian", 300);
        System.out.println("The Bread is "+Chocolate.getBread());
        System.out.println("Calories: "+Chocolate.getCalories());
        System.out.println(Chocolate.getMOTTO());
        System.out.println("The Bread is "+Plain.getBread());
        System.out.println("Calories: "+Plain.getCalories());
        System.out.println(Plain.getMOTTO());
        System.out.println("The Bread is "+Croissant.getBread());
        System.out.println("Calories: "+Croissant.getCalories());
        System.out.println(Croissant.getMOTTO());
    }
}
