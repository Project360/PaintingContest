package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
 
public class Login extends JFrame implements ActionListener 
  { 
	
    JLabel label1, label2, label3 ;
    JTextField UserN, PassWd;
    JButton Loginbtn, cancelbtn;
    
 
    Login()
     {	
    	//JFrame frame;
       // setVisible(true);
        setSize(550, 450);
        getContentPane().setBackground(Color.green);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(" Login Window ");
 
        label1 = new JLabel("Welcome To Login Window :");
        label1.setForeground(Color.blue);
        label1.setFont(new Font("Serif", Font.BOLD, 25));
 
        label2 = new JLabel("User Name:");// user name
        label3 = new JLabel("Password:"); // password
        
        UserN = new JTextField(); // for 1st name
        PassWd = new JTextField(); // for last name
        
 
        Loginbtn = new JButton("Login");
        cancelbtn = new JButton("Cancel");
        cancelbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Cancel")) {
	                dispose();
	            }
			}
		});
 
        Loginbtn.addActionListener(this);
       // cancelbtn.addActionListener(this);
 
        label1.setBounds(100, 30, 400, 30);//registration form
        label2.setBounds(80, 70, 250, 30);//1st name
        label3.setBounds(80, 110, 250, 30);//last name
        
        UserN.setBounds(300, 70, 200, 30);
        PassWd.setBounds(300, 110, 200, 30);
        
        Loginbtn.setBounds(150, 300, 120, 50); // register
        cancelbtn.setBounds(370, 300, 100, 50); //clear
 
        add(label1);
        add(label2);
        add(UserN);
        add(label3);
        add(PassWd);
        
        add(Loginbtn);
        add(cancelbtn);
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e) 
     {
    	
        if (e.getSource() == Loginbtn)
         {
            

       
            if(UserN.getText().equals("") || PassWd.getText().equals("") )
            	
            	try {
            		JOptionPane.showMessageDialog(Loginbtn,  "Entry Fields can not be blank"); 
            
            	}
          catch (Exception ex) 
                {
        	  			System.out.println(ex);
                }
            else
            {
          	  JOptionPane.showMessageDialog(Loginbtn, " Congradulation!!" + " \n You are Successfully Login");

             } 
            }
        else {
        	 UserN.setText("");
        	 PassWd.setText("");
        	 
        }
        
        } 
          
    
    public static void main(String args[])
   {
        new Login();
    }
}
