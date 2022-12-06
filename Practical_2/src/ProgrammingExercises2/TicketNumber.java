package ProgrammingExercises2;
import javax.swing.JOptionPane;

public class TicketNumber {
    public static void main(String[] args){
        String ticketString = JOptionPane.showInputDialog(null, "Enter your six digit ticket number: ");

        int ticketNum = Integer.parseInt(ticketString);
        int removeDigit = ticketNum/10;
        int lostDigit = ticketNum % 10;
        int remainderTicket = removeDigit % 7;

        if(lostDigit == remainderTicket){
            JOptionPane.showMessageDialog(null, "This is a valid number.");
        }
        else
            JOptionPane.showMessageDialog(null, "Ticket is invalid");
    }
}
