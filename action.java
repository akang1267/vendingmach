import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class action implements ActionListener {
    private String label;
    private JButton button;

    public action(String label, JButton button) {
        this.label = label;
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (label.equals("A1")) {
            JOptionPane.showMessageDialog(null, "You chose Monster B-Ultra!\n Credit: 2.50");
        } else if (label.equals("A2")) {
            JOptionPane.showMessageDialog(null, "You chose Redbull! (Adelle's Favorite!)\n Credit: 3.00");
        } else if (label.equals("A3")) {
            JOptionPane.showMessageDialog(null, "You chose Rockstar!\n Credit: 2.75");
        } else if (label.equals("B1")) {
            JOptionPane.showMessageDialog(null, "You chose Monster Energy!\n Credit: 2.50");
        } else if (label.equals("B2")) {
            JOptionPane.showMessageDialog(null, "You chose Monster Ultra!\n Credit: 2.50");
        } else if (label.equals("B3")) {
            JOptionPane.showMessageDialog(null, "You chose NOS!\n Credit: 1.75");
        } else if (label.equals("C1")) {
            JOptionPane.showMessageDialog(null, "You chose Mtn Dew!\n Credit: 2.00");
        } else if (label.equals("C2")) {
            JOptionPane.showMessageDialog(null, "You chose Pepsi!\n Credit: 2.50");
        } else if (label.equals("C3")) {
            JOptionPane.showMessageDialog(null, "You chose Coke!\n Credit: 2.50");
        }
    }
     
}
