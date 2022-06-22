
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class border extends JFrame {
    private String[] dict = {
            "Welcome to center",
            "Welcome to North",
            "Welcome to West",
            "Welcome to South",
            "Welcome to East"
    };

    border() {
        super("BorderLayoutTest");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        //setLayout(new BorderLayout());
        setSize(600, 600);

        JTextField[] textField  = new JTextField[5];
        textField[0] = new JTextField("Center");
        textField[1] = new JTextField("North");
        textField[2] = new JTextField("West");
        textField[3] = new JTextField("South");
        textField[4] = new JTextField("East");
        setVisible(true);

        for (JTextField txt: textField) {
            txt.setEnabled(false);
            txt.setHorizontalAlignment(SwingConstants.CENTER);
            add(txt, txt.getText());
        }
        for (int i = 0; i < 5; i++) {
            int geti = i;
            textField[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(null, dict[geti]);
                }
            });
        }
    }
}