/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heynet;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Jovial
 */
public class HeyNet {

    /**
     * @param args the command line arguments
     */
    JFrame f = new JFrame("HeyNet");
    JTextArea ta = new JTextArea();
    JTextField t = new JTextField("Enter the message");
    JButton b = new JButton("Send");
    
    HeyNet(){
     ta.setBounds(100, 40, 40, 40);
     t.setBounds(130,50,480,40);
     b.setBounds(130,100,100,40);
     f.add(ta);
     f.add(t);
     f.add(b);
     f.setSize(400,500);
     f.setLayout(new FlowLayout(FlowLayout.CENTER));
     f.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new HeyNet();
    }
    
}
