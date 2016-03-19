package view;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener 
{ 

	JLabel label1, label2, label3 ;
	JTextField UserN,p1;
	JButton Loginbtn, cancelbtn;
	static String register;
	private static boolean exampleBool = false;
	
	private HashMap<String,String> userInformations;


	public Login()
	{	
		//JFrame frame;
		
		setBackground(new Color(102, 205, 170));
		getContentPane().setBackground(new Color(102, 205, 170));
		setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle(" Login Window ");

		label1 = new JLabel("  Login:");
		label1.setForeground(Color.BLACK);
		label1.setFont(new Font("Serif", Font.BOLD, 17));

		label2 = new JLabel("User Name:");// user name
		label3 = new JLabel("Registration#:"); // password

		UserN = new JTextField(); // user name
		p1 = new JTextField(); // password


		Loginbtn = new JButton("Login");
		cancelbtn = new JButton("Clear");

		Loginbtn.addActionListener(this);
		cancelbtn.addActionListener(this);

		label1.setBounds(100, 30, 400, 50);//
		label2.setBounds(80, 100, 250, 30);//
		label3.setBounds(80, 150, 250, 30);//

		UserN.setBounds(270, 100, 200, 30);
		p1.setBounds(270, 150, 200, 30);

		Loginbtn.setBounds(150, 300, 120, 50); // register
		cancelbtn.setBounds(370, 300, 100, 50); //clear

		add(label1);
		add(label2);
		add(UserN);
		add(label3);
		add(p1);

		add(Loginbtn);
		add(cancelbtn);
		
		// set visibility and size
		setVisible(true);
		setSize(550, 450);
	}


	private boolean validateForm() {
		return (UserN.getText().equals("") || p1.getText().equals(""));
	}
	public void actionPerformed(ActionEvent e) 
	{
		boolean boolVar;
        boolVar = false;
       // boolean boolRegn; // registration #
       // boolRegn = false;

		if (e.getSource() == Loginbtn) {
			if (validateForm()) {

				try {
					JOptionPane.showMessageDialog(Loginbtn, "Entry Fields can not be blank");
				} 
				catch (Exception ex) {
					System.out.println(ex);
				}
			} else {
				String pass= p1.getText();
				register = pass;
				String regn = UserN.getText();
				if (!LoginUser(pass, regn)) {
					JOptionPane.showMessageDialog(Loginbtn, 
							" Wrong Registration Number!!" + " \n Please Try Again");
				} else {
					//new HomeScreen();
				}
			}
		} else {	// cancel button
			cancel();
		}
	}

	/***
	 * 
	 * @param pass
	 * @param regn
	 * @return
	 * @throws FileNotFoundException if the file is not found
	 */
	public boolean LoginUser(String pass, String regn) {
		Scanner streamIn=null;
		
		try
		{
			streamIn=new Scanner(new FileInputStream("registeration.txt"));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File Not Found");
			System.exit(0);
		}
		boolean foundUser = false;
		while(streamIn.hasNextLine())
		{
			String line=streamIn.nextLine();
			//String line2 = UserN.nextLine();
			String[] theLine=line.split("\\|");
			//System.out.println("Account:" + theLine[0] + " name:" + theLine[1]);
			String[] userInfo = theLine[1].split(",");
			if(theLine[0].trim().equalsIgnoreCase(pass.trim()) && 
					userInfo[0].trim().equalsIgnoreCase(regn.trim()))
			{
				foundUser = true;
			}
			if (foundUser) {
				JOptionPane.showMessageDialog(Loginbtn, " Congradulation!!" + " \n You are Successfully Login");
				exampleBool = true;
				dispose();
				return true;
			}
		}
		return false;
	}

	private void cancel() {
		// clears all the textfields
		UserN.setText("");
		p1.setText("");
	}
	
	public static String getRegister() {
		return register;
	}
	public static boolean ReturnExampleBool () {return exampleBool ;}



	
}
