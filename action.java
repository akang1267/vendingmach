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
            System.exit(0);
        } else if (label.equals("A2")) {
            System.exit(0);
        } else if (label.equals("A3")) {
            System.exit(0);
        } else if (label.equals("B1")) {
            System.exit(0);
        } else if (label.equals("B2")) {
            System.exit(0);
        } else if (label.equals("B3")) {
            System.exit(0);
        } else if (label.equals("C1")) {
            System.exit(0);
        } else if (label.equals("C2")) {
            System.exit(0);
        } else if (label.equals("C3")) {
            System.exit(0);
        }
    }
}
