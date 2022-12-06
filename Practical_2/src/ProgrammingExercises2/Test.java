package ProgrammingExercises2;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args){
        final double QUARTS_PER_GALLON = 4;
        String quartsString;
        double numQuarts, remainder;

        quartsString = JOptionPane.showInputDialog(null,"How many quarts required?",
                JOptionPane.INFORMATION_MESSAGE);

        numQuarts = Double.parseDouble(quartsString);
        double gallons = numQuarts / QUARTS_PER_GALLON;//Formula
        remainder = numQuarts % QUARTS_PER_GALLON;

        JOptionPane.showMessageDialog(null," A paint job requires " + numQuarts +
                " quarts, requires " + gallons + " gallons and " + remainder + " quarts ");

    }
}
