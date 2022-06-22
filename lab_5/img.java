package lab_5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class img extends JFrame {
    img(final String file) {
        super("Picture");
        setLayout(new BorderLayout());
        setSize(500, 500);

        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(file));
        } catch (IOException e) {
            e.printStackTrace();
        }


        ImageIcon ic = new ImageIcon(image);
        JLabel label = new JLabel();
        label.setIcon(ic);
        add(label, BorderLayout.CENTER);
    }
}
