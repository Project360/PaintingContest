package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Download extends JFrame implements ActionListener {
	
	JLabel label1,CompanyA,CompanyB,CompanyC, pic1,pic2, pic3,pic4,pic5,pic6,pic7,pic8,pic9,pic10,pic11,pic12,pic13,pic14,pic15,pic16,pic17,pic18;
    JButton Downloadbtn, cancelbtn;
	private Object btnDownload;
    
    
   
	 Download() {
		 
		
		getContentPane().setBackground(Color.CYAN);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Picture Download Screen ");

        JLabel lblPaintingDownloadScreen = new JLabel("Choose picture(s) to Download");
		lblPaintingDownloadScreen.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblPaintingDownloadScreen.setBounds(100, 30, 233, 16);
		getContentPane().add(lblPaintingDownloadScreen);
		
		JLabel CompanyA = new JLabel("Company A");
		CompanyA.setBounds(20, 83, 85, 16);
		getContentPane().add(CompanyA);
		
		JLabel CompanyB = new JLabel("Company B");
		CompanyB.setBounds(20, 122, 85, 16);
		getContentPane().add(CompanyB);
		
		JLabel CompanyC = new JLabel("Company C");
		CompanyC.setBounds(20, 161, 85, 16);
		getContentPane().add(CompanyC);
		
		JButton Downloadbtn = new JButton("Download");
		Downloadbtn.setBounds(65, 251, 132, 57);
		getContentPane().add(Downloadbtn);
		
		JButton Cancelbtn = new JButton("Cancel");
		Cancelbtn.setBounds(327, 251, 118, 57);
		getContentPane().add(Cancelbtn);
		
		JLabel Pic1 = new JLabel("pic1");
		//Image img = new ImageIcon(this.getClass().getResource("rabit.png")).getImage();
		//Downloadbtn.setIcon(new ImageIcon(img));
		Pic1.setBounds(151, 83, 33, 16);
		getContentPane().add(Pic1);
		
		JLabel Pic2 = new JLabel("pic2");
		Pic2.setBounds(196, 83, 33, 16);
		getContentPane().add(Pic2);
		
		JLabel Pic3 = new JLabel("pic3");
		Pic3.setBounds(255, 83, 33, 16);
		getContentPane().add(Pic3);
		
		JLabel Pic4 = new JLabel("pic4");
		Pic4.setBounds(300, 83, 33, 16);
		getContentPane().add(Pic4);
		
		JLabel Pic5 = new JLabel("pic5");
		Pic5.setBounds(361, 83, 33, 16);
		getContentPane().add(Pic5);
		
		JLabel Pic6 = new JLabel("pic6");
		Pic6.setBounds(431, 83, 33, 16);
		getContentPane().add(Pic6);
		
		JLabel pic7 = new JLabel("pic7");
		pic7.setBounds(151, 122, 33, 16);
		getContentPane().add(pic7);
		
		JLabel Pic8 = new JLabel("pic8");
		Pic8.setBounds(196, 122, 33, 16);
		getContentPane().add(Pic8);
		
		JLabel Pic9 = new JLabel("pic9");
		Pic9.setBounds(255, 122, 33, 16);
		getContentPane().add(Pic9);
		
		JLabel Pic10 = new JLabel("pic10");
		Pic10.setBounds(300, 122, 49, 16);
		getContentPane().add(Pic10);
		
		JLabel Pic11 = new JLabel("pic11");
		Pic11.setBounds(361, 122, 49, 16);
		getContentPane().add(Pic11);
		
		JLabel pic12 = new JLabel("pic12");
		pic12.setBounds(431, 122, 49, 16);
		getContentPane().add(pic12);
		
		JLabel pic13 = new JLabel("pic13");
		pic13.setBounds(151, 161, 43, 16);
		getContentPane().add(pic13);
		
		JLabel Pic14 = new JLabel("pic14");
		Pic14.setBounds(196, 161, 47, 16);
		getContentPane().add(Pic14);
		
		JLabel Pic15 = new JLabel("pic15");
		Pic15.setBounds(255, 161, 49, 16);
		getContentPane().add(Pic15);
		
		JLabel Pic16 = new JLabel("pic16");
		Pic16.setBounds(300, 161, 49, 16);
		getContentPane().add(Pic16);
		
		JLabel Pic17 = new JLabel("pic17");
		Pic17.setBounds(361, 161, 49, 16);
		getContentPane().add(Pic17);
		
		JLabel Pic18 = new JLabel("pic18");
		Pic18.setBounds(431, 161, 49, 16);
		getContentPane().add(Pic18);
		
		JPanel panel = new JPanel();
		panel.setBounds(131, 76, 349, 34);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(131, 116, 349, 28);
		getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(131, 154, 349, 34);
		getContentPane().add(panel_2);
	
		
		// set visibility at end to show previous work
        setVisible(true);
        setSize(500, 400);
	}
	 private boolean validateForm() {
			return (CompanyA.getText().equals("") || CompanyB.getText().equals("")||CompanyC.getText().equals(""));
		}
	 
	 public void actionPerformed(ActionEvent e) {
		 
		 	

	        if (e.getSource() == btnDownload) {
	        	if (validateForm()) {
	        		try {
	                    JOptionPane.showInputDialog(btnDownload, "This will take you the pics");
	                } catch (Exception ex) {
	                    System.out.println(ex);
	                }
	        	} 
	        	else {	
	                JOptionPane.showInputDialog(btnDownload, " Congradulation!!" + 
	                		" \n You are Successfully Download");
	        	}
	        } else {	// cancel button
	            cancel();
	        }
	    }
	    
	    //@SuppressWarnings("unused")
		private boolean DownloadPic() {
	    	
	    	return true;
	    }
		private void cancel() {
			CompanyA.getText();
			CompanyB.getText();
			CompanyC.getText();
			
		}
		
	 public static void main(String args[]) { 
	    	
	    }
}
