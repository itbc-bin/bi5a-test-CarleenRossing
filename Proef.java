/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proef;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextField;

/**
 *
 * @author carleen
 */
public class Proef extends JFrame {
    JTextField text;
    JButton button;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Proef frame = new Proef();
        frame.setSize(455, 455);
        frame.createGUI();
        frame.setVisible(true);
        
        
        
    }
    public void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        text = new JTextField(12);
        window.add(text);
        button = new JButton("test");
        window.add(button);
        
        
    
}
    
}
