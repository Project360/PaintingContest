package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame implements ActionListener {

    JLabel label1, label2, label3, label4, label5, label6;
    JTextField firstN, lastN, phoneN, dob, emailadd;
    JButton regbtn, clearbtn;


    Registration() {
        //JFrame frame;
        
        getContentPane().setBackground(Color.green);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Registration Form ");

        label1 = new JLabel("Registration Form:");
        label1.setForeground(Color.blue);
        label1.setFont(new Font("Serif", Font.BOLD, 25));

        label2 = new JLabel("First Name:");
        label3 = new JLabel("Last Name:");
        label4 = new JLabel("Date of Birth:");
        label5 = new JLabel("Email Address:");
        label6 = new JLabel("Phone Number:");
        firstN = new JTextField(); // for 1st name
        lastN = new JTextField(); // for last name
        dob = new JTextField(); // for dob
        emailadd = new JTextField(); // for email add
        phoneN = new JTextField(); // phone #

        regbtn = new JButton("Register");
        clearbtn = new JButton("Clear");

        regbtn.addActionListener(this);
        clearbtn.addActionListener(this);

        label1.setBounds(100, 30, 400, 30);//registration form
        label2.setBounds(80, 70, 250, 30);//1st name
        label3.setBounds(80, 110, 250, 30);//last name
        label4.setBounds(80, 150, 250, 30); // DOB
        label5.setBounds(80, 190, 250, 30);//email add
        label6.setBounds(80, 230, 250, 30);// phone number
        firstN.setBounds(300, 70, 200, 30);
        lastN.setBounds(300, 110, 200, 30);
        dob.setBounds(300, 150, 200, 30);
        emailadd.setBounds(300, 190, 200, 30);
        phoneN.setBounds(300, 230, 200, 30);
        regbtn.setBounds(150, 300, 120, 50); // register
        clearbtn.setBounds(370, 300, 100, 50); //clear

        add(label1);
        add(label2);
        add(firstN);
        add(label3);
        add(lastN);
        add(label4);
        add(dob);
        add(label5);
        add(emailadd);
        add(label6);
        add(phoneN);
        add(regbtn);
        add(clearbtn);
        
        // set visibility at end to show previous work
        setVisible(true);
        setSize(550, 450);
    }

    private boolean validateForm() {
    	return (firstN.getText().equals("") || lastN.getText().equals("") ||
                dob.getText().equals("") || emailadd.getText().equals("") ||
                phoneN.getText().equals(""));
    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == regbtn) {
        	if (validateForm()) {
        		try {
                    JOptionPane.showMessageDialog(regbtn, "Entry Fields can not be blank");
                } catch (Exception ex) {
                    System.out.println(ex);
                }
        	} else {	
                JOptionPane.showMessageDialog(regbtn, " Congradulation!!" + 
                		" \n You are Successfully Registered");
        	}
        } else {	// cancel button
            cancel();
        }
    }
    
    private boolean registerUser() {
    	// create a new Contestant
    	return true;
    }
    
    private void cancel() {
    	// clears all the textfields
    	firstN.setText("");
        lastN.setText("");
        dob.setText("");
        emailadd.setText("");
        phoneN.setText("");
    }


    public static void main(String args[]) { 
    	
    }
}