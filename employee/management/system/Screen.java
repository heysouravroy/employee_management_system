package employee.management.system;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Screen extends JFrame{

    Screen(){


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/screen.gif"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);

        setSize(800,600);
        setLocation(200,50);
        setLayout(null);
        setVisible(true);

        try {
            Thread.sleep(5500);
            setVisible(false);
            new Login();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Screen();
    }
}
