package view;

import javax.swing.*;

import model.Contestant;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;


@SuppressWarnings("serial")
public class Registration extends JFrame implements ActionListener {
	private Contestant theContestant;
    //String firstName,lasName,phoneNumber,ageGroup,emailAddress;
    JLabel label1, label2, label3, label4, label5, label6;
    JTextField firstN, lastN, phoneN, age, emailadd;
    JButton regbtn, clearbtn;
    
    private final String DEL = ",";

    public Registration() {
        //JFrame frame;
        initialize();
    }
    
    public void initialize() {
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
    	if (fieldsAreEmpty()) {
    		try {
                JOptionPane.showMessageDialog(regbtn, "Entry Fields can not be blank");
            } catch (Exception ex) {
                System.out.println(ex);
            }
    		return false;
    	} 
    	if (!validAge(age.getText().trim())) {
    		try {
                JOptionPane.showMessageDialog(regbtn, "Age must be between 2 and 100.");
            } catch (Exception ex) {
                System.out.println(ex);
            }
    		return false;
    	} 
    	if (!validEmail(emailadd.getText().trim())) {
    		try {
                JOptionPane.showMessageDialog(regbtn, "The email address is invalid.");
            } catch (Exception ex) {
                System.out.println(ex);
            }
    		return false;
    	} 
    	if (!validPhone(phoneN.getText().trim())) {
    		try {
                JOptionPane.showMessageDialog(regbtn, "The phone number is invalid.");
            } catch (Exception ex) {
                System.out.println(ex);
            }
    	}
    	return true;
    }
    
    public boolean validEmail(String email) {
    	return (email.contains("@") && (email.endsWith(".com") || email.endsWith(".edu") ||
    			email.endsWith(".net")));
    }
    
    /**
     * Validates the given phone number based on the following.
     * 		1234567890
	* 		123-456-7890
	* 		123-456-7890 x1234
	* 		123-456-7890 ext1234
	* 		(123)-456-7890
	* 		123.456.7890
	* 		123 456 7890
	* Used code from journaldev.com
	* @param phone the phone number
     * @return true if the string matches the above.
     */
    public boolean validPhone(String phone) {
    	//validate phone numbers of format "1234567890"
        if (phone.matches("\\d{10}")) 
        	return true;
        //validating phone number with -, . or spaces
        else if(phone.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) 
        	return true;
        //validating phone number with extension length from 3 to 5
        else if(phone.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) 
        	return true;
        //validating phone number where area code is in braces ()
        else if(phone.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) 
        	return true;
        //return false if nothing matches the input
        else 
        	return false;
    }
    
    public boolean validAge(String age) {
    	int ageNo = Integer.parseInt(age);
    	return (ageNo >= 2 && ageNo <= 100);
    }
    
    public boolean fieldsAreEmpty() {
    	return (firstN.getText().equals("") || lastN.getText().equals("") ||
                age.getText().equals("") || emailadd.getText().equals("") ||
                phoneN.getText().equals(""));
    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == regbtn) {
        	if (validateForm()) {
        		
        		theContestant = new Contestant(firstN.getText(), lastN.getText(), phoneN.getText(), 
        				age.getText(), emailadd.getText());
        		registerUser(theContestant);
        		new Login();
                dispose();
        	}
        }  else {	// cancel button
            cancel(); 
        }
    }

	public void registerUser(Contestant user) {
    	// create a new Contestant
    	PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter( new FileOutputStream("registeration.txt",true));
			Random r = new Random( System.currentTimeMillis() );
			int random = (1 + r.nextInt(2)) * 10000 + r.nextInt(10000);
			String strI = Integer.toString(random);
			
			outputStream.println(strI+"|" + user.getFirst() + DEL + user.getLast() + DEL +
					user.getPhone() + DEL + user.getAgeGroup() + DEL + user.getEmail());
			//outputStream.println(strI+"|"+firstName+","+lasName+","+phoneNumber+","+ageGroup+","+emailAddress);
	        JOptionPane.showMessageDialog(regbtn, " Congradulation!!" + 
	        		" \n You are Successfully Registered" + "\n Your Registration # is  "+strI + " and " 
	        		+ "\n User Name is " + user.getFirst());
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
