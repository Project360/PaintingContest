package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;


@SuppressWarnings("serial")
public class Registration extends JFrame implements ActionListener {
    String firstName,lasName,phoneNumber,ageGroup,emailAddress;
    JLabel label1, label2, label3, label4, label5, label6;
    JTextField firstN, lastN, phoneN, age, emailadd;
    JButton regbtn, clearbtn;


    Registration() {
        //JFrame frame;
        
        getContentPane().setBackground(new Color(102, 205, 170));
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Painting  Contest Registration Form ");

        label1 = new JLabel("Registration Form:");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Serif", Font.BOLD, 17));

        label2 = new JLabel("First Name:");
        label3 = new JLabel("Last Name:");
        label4 = new JLabel("Age:");
        label5 = new JLabel("Email Address:");
        label6 = new JLabel("Phone Number:");
        firstN = new JTextField(); // for 1st name
        lastN = new JTextField(); // for last name
        age = new JTextField(); // for age
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
        age.setBounds(300, 150, 200, 30);
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
        add(age);
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

    public boolean validateForm() {
    	return (firstN.getText().equals("") || lastN.getText().equals("") ||
                age.getText().equals("") || emailadd.getText().equals("") ||
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
        		registerUser();
        		new Login();
                dispose();
        	}
        }  else {	// cancel button
            cancel(); 
        }
    }
        
    
	protected void registerUser() {
    	// create a new Contestant
    	PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter( new FileOutputStream("registeration.txt",true));
			Random r = new Random( System.currentTimeMillis() );
			int random = (1 + r.nextInt(2)) * 10000 + r.nextInt(10000);
			String strI = Integer.toString(random);
			firstName = firstN.getText();
			lasName =  lastN.getText();
			phoneNumber = phoneN.getText();
			ageGroup = age.getText();
			emailAddress = emailadd.getText();
			outputStream.println(strI+"|"+firstName+","+lasName+","+phoneNumber+","+ageGroup+","+emailAddress);
	        JOptionPane.showMessageDialog(regbtn, " Congradulation!!" + 
	        		" \n You are Successfully Registered" + "\n Your Registration # is  "+strI + " and " + "\n User Name is " +firstName);
	        outputStream.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
    
    private void cancel() {
    	// clears all the textfields
    	firstN.setText("");
        lastN.setText("");
        age.setText("");
        emailadd.setText("");
        phoneN.setText("");
    }
    


   
    
}
