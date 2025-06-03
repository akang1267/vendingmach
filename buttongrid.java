import javax.swing.*;
import java.awt.*;
/**
 * Class that makes the JFrame for the Button Grid
 * @author Adelle.Kang
 * @version 1.0.0
 */
public class buttongrid extends JFrame {
    
    /**
     * Constructor
     * Makes the 3x3 Layout
     */
    public buttongrid() {
        setTitle("Button Grid");
        setSize(250, 400);
        setLayout(new GridLayout(3, 3));

        String[] labels = {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"};

        for (String label : labels) {
            JButton button = new JButton(label);
            button.addActionListener(new action(label, button));
            add(button);
        }

        setVisible(true);
    }
}
