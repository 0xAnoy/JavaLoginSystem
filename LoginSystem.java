import javax.swing.*;    
import java.awt.event.*;  
public class LoginSystem {  
    public static void main(String[] args) {    
    JFrame f=new JFrame("Login System by Anoy");    
     final JLabel label = new JLabel();            
     label.setBounds(20,150, 200,50);  
     final JPasswordField value = new JPasswordField();   
     value.setBounds(100,75,100,30);   
     JLabel l1=new JLabel("Username:");    
        l1.setBounds(20,20, 100,30);    
        JLabel l2=new JLabel("Password:");    
        l2.setBounds(20,75, 100,30);    
        JButton b = new JButton("Login");  
        b.setBounds(75,120, 80,30);  
        JButton r = new JButton("Register");
        r.setBounds(150, 120, 80, 30);
        JButton c = new JButton("Forgot Password?");
        c.setBounds(85, 160, 140, 30);
        final JTextField text = new JTextField();
        text.setBounds(100,20, 100,30);    
                f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(r); f.add(c); f.add(text);  
                f.setSize(300,300);    
                f.setLayout(null);    
                f.setVisible(true);     
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLocationRelativeTo(null);
                   
}  
}  