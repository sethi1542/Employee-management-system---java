package Employee.management.system;

import javax.swing.*;
import java.awt.*;


public class Splash extends JFrame {

    Splash(){

        // code for getting image for splash screen
        ImageIcon i1 = new ImageIcon(ClassLoader .getSystemResource("icons/splash.png"));
        // setting width and height of image as border size
        Image i2 = i1.getImage().getScaledInstance(900 ,500 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,500);
        add(image);

        // for title on splash page
        setTitle("Employee management system");




        setSize(900 , 500);               // dimensions of our splash page
        setLocation(220 , 110);                 // for opening splash screen in middle
        setLayout(null);                             // to insert icons, image etc according to us
        setVisible(true);

        try {
            Thread.sleep(4000);
            setVisible(false);                      // this will close splash page after 3 sec provided in thread.sleep
            new Login();

        } catch (Exception e){
            e.printStackTrace();
        }

    }
    // main
    public static void main(String[] args) {
        new Splash();
    }
}
