package view;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener 
{ 

	JLabel label1, label2, label3 ;
	JTextField UserN;
	JButton Loginbtn, cancelbtn;
	JPasswordField p1;


	Login()
	{	
		//JFrame frame;
		setVisible(true);
		setSize(550, 450);
		setBackground(Color.CYAN);
		getContentPane().setBackground(Color.CYAN);
		setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle(" Login Window ");

		label1 = new JLabel("Welcome To Login Window :");
		label1.setForeground(Color.blue);
		label1.setFont(new Font("Serif", Font.BOLD, 25));

		label2 = new JLabel("User Name:");// user name
		label3 = new JLabel("Password:"); // password

		UserN = new JTextField(); // user name
		p1 = new JPasswordField(); // password


		Loginbtn = new JButton("Login");
		cancelbtn = new JButton("Clear");

		Loginbtn.addActionListener(this);
		cancelbtn.addActionListener(this);

		label1.setBounds(100, 30, 400, 20);//
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
	}


	private boolean validateForm() {
		return (UserN.getText().equals("") || p1.getPassword().equals(""));
	}
	public void actionPerformed(ActionEvent e) 
	{


		if (e.getSource() == Loginbtn) {
			if (validateForm()) {

				try {
					JOptionPane.showMessageDialog(Loginbtn, "Entry Fields can not be blank");
				} catch (Exception ex) {
					System.out.println(ex);
				}
			} 
			else {	

				JOptionPane.showMessageDialog(Loginbtn, " Congradulation!!" + " \n You are Successfully Login");
				//setVisible = false;
			}
		} else {	// cancel button
			cancel();
		}
	}

	@SuppressWarnings("unused")
	private boolean LoginUser() {
		// create a new Contestant
		return true;
	}

	private void cancel() {
		// clears all the textfields
		UserN.setText("");
		p1.setText("");
	}



	public static void main(String args[])
	{
		new Login();
	}
}
