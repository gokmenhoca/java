package ders01;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JavaLogo {
    public static void main(String[] args) {
        ImageIcon icon  = new ImageIcon("./src/JavaLogo.png");
        JLabel    label = new JLabel();
        label.setIcon(icon);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 310, 310);
        panel.add(label);

        JFrame frame = new JFrame();
        frame.setTitle("Welcome to Java Swing");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(310, 310);
        frame.setResizable(false);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
