package ProgrammingExercises4;

public class Bread {
    private String bread;
    private double calories;

    public final static String MOTTO = "The staff of life";

    public Bread (String bread_type, float calories_per_slice)
    {
        bread=bread_type;
        calories=calories_per_slice;
    }

    public String getBread() {
        return bread;
    }

    public double getCalories() {
        return calories;
    }

    public String getMOTTO() {
        return MOTTO;
    }
}
