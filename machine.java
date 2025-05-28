import javax.swing.*;
import java.awt.*;

public class machine extends JFrame {

    
    public machine() {
        setTitle("Machine");
        setSize(150, 300);
        
        JFrame frame = new JFrame("Vending Machine");

        ImageIcon image1 = new ImageIcon("machine.png");
        frame.add(new JLabel(image1));



        setVisible(true);
    }
}
