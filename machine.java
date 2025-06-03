import javax.swing.*;
import java.awt.*;
/**
 * Class that makes the JFrame for the vending machine
 * @author Adelle.Kang
 * @version 1.0.0
 */

public class machine extends JFrame {
    /**
     * Constructor
     * Makes the Vending Machine and Scales it
     */
    public machine() {
        setTitle("Machine");
        setSize(450, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Load the original image
        ImageIcon originalIcon = new ImageIcon("machinepic.png");
        Image originalImage = originalIcon.getImage();

        // Get original width and height
        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();

        // Scale width to 450 and preserve aspect ratio
        int targetWidth = 450;
        int targetHeight = (originalHeight * targetWidth) / originalWidth;

        // Scale image
        Image scaledImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel imageLabel = new JLabel(scaledIcon);
        add(imageLabel, BorderLayout.NORTH);

        setVisible(true);
    }
}
