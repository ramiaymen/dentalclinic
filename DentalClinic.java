package DentalClinic;
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 //*/
import dentalclinic.Login;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
 
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import dentalclinic.Splash;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DentalClinic {
      
       
    public static void main(String[] args) {
        Splash splash = new Splash();
        splash.showSplash();
        
        // code for Dental Clinic GUI
        JFrame frame = new JFrame("Dental Clinic");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        JLabel label = new JLabel("Welcome to Dental Clinic!");
        panel.add(label);
        frame.add(panel);
        
        // center the frame on the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int xPos = (screenSize.width - frame.getWidth()) / 2;
        int yPos = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(xPos, yPos);
        
        frame.setVisible(true);
        
        // close the splash screen after the GUI is visible
        splash.closeSplash();
    }
}



                    