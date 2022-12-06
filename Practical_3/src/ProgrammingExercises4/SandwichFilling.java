package ProgrammingExercises4;

public class SandwichFilling {
    private String Filling;
    private double Calories;

    public SandwichFilling(String fillings, float calories)
    {
        Filling=fillings;
        Calories=calories;
    }

    public String getFilling(){
        return Filling;
    }

    public double getCalories(){
        return Calories;
    }
}

