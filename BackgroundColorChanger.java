import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackgroundColorChanger {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Background Color Changer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        JButton button = new JButton("Change Background");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(
                        (int)(Math.random() * 255),
                        (int)(Math.random() * 255),
                        (int)(Math.random() * 255)
                ));
            }
        });

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
