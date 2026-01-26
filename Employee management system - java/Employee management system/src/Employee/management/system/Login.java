package Employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField tusername;

    JPasswordField tpassword;

    JButton login , back;




    // constructor
    Login(){

        JLabel username = new JLabel("USERNAME : ");  // main use is to visible text on image
        username.setForeground(Color.white);
        username.setBounds(40,20,100,30);
        add(username);

        tusername = new JTextField();
        tusername.setBounds(150,20,150,30);
        add(tusername);


        JLabel password = new JLabel("PASSWORD : ");  // main use is to visible text on image
        password.setForeground(Color.white);
        password.setBounds(40,70,100,30);
        add(password);

        tpassword = new JPasswordField();
        tpassword.setBounds(150,70,150,30);
        add(tpassword);

        login = new JButton("LOGIN");
        login.setBounds(150 , 140, 150 , 30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);


        back = new JButton("BACK");
        back.setBounds(150 , 180, 150 , 30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,600,300);
        add(img);


        // size of login page
        setSize(600 ,300);              // setting height and width of login screen
        setLocation(450 , 200);               // centering the login page on screen while pop up
        setLayout(null);                           // for modification of login page according to us
        setVisible(true);                           // this will help in visibility of login page
        setTitle("EMS LOGIN");                     // title on the upper border



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){             // when login is pressed it will execute to homepage after matching password

        } else if(e.getSource() == back){
                System.exit(0);          // for closing when back is pressed
        }
    }

    // main function

    public static void main(String[] args) {
        new Login();
    }
}
