package ProgrammingExercises4;

public class Sandwich {
    private double TotalCalories;
    Bread bread;
    SandwichFilling filling;

    public Sandwich(String bread_type, float bread_calories, String fillings, float fillings_calories){
        bread = new Bread(bread_type, bread_calories);
        filling = new SandwichFilling(fillings, fillings_calories);
        TotalCalories = calories_amount(bread_calories, fillings_calories);
    }

    public Bread getBread(){
        return bread;
    }

    public SandwichFilling getFilling(){
        return filling;
    }

    public double calories_amount(float bread_calories, float fillings_calories){
        TotalCalories = (bread_calories*2) + fillings_calories;
        return TotalCalories;
    }

    public double displayTotalCalories(){
        return TotalCalories;
    }
}
