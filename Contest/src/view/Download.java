package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

  @SuppressWarnings("serial")
public class Download extends JFrame implements ActionListener{
   // instance variables
   
    
      JButton CompanyA;
      JButton load;
      JButton quit;
      private JButton btnCompanyB;
      private JButton btnCompanyC;
      private JButton btnCompanyD;
      private JLabel lblChoosePaintingTo;
     
  	
  
   /**
    * Constructor for objects of class Calculate
    */
      
     
     Download(){
        Container contentPane;
     
     
     
       //Set the frame properties
        setSize         (975, 725);
        setResizable    (false);
        setTitle        ("Download Screen");
        setLocation     (150, 250);
        setVisible(true);
     
        contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.setBackground( Color.cyan );
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
       //Create and Place the Buttons on the frame
        
        CompanyA = new JButton("Company A");
        CompanyA.setBounds(6, 106, 171, 113);
        contentPane.add(CompanyA);
        CompanyA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String url = "http://r.ddmcdn.com/w_830/s_f/o_1/cx_98/cy_0/cw_640/ch_360/APL/uploads/2015/07/cecil-AP463227356214-1000x400.jpg";
				try {
					java.awt.Desktop.getDesktop().browse(
							java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			
			}
		});
        
     	
        load = new JButton("Download");
        load.setBounds(314, 613, 158, 67);
        contentPane.add(load);
     	
        quit = new JButton("Quit");
        quit.setBounds(611, 613, 153, 67);
        contentPane.add(quit);
        
        btnCompanyB = new JButton("Company B");
        btnCompanyB.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		String url = "http://img.izismile.com/img/img8/20160106/640/animals_who_look_like_they_had_a_rough_night_640_03.jpg";
				try {
					java.awt.Desktop.getDesktop().browse(
							java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			
        	}
        });
        btnCompanyB.setBounds(6, 231, 171, 113);
        getContentPane().add(btnCompanyB);
        
        
        
        btnCompanyC = new JButton("Company C");
        btnCompanyC.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		String url = "http://www.wired.com/wp-content/uploads/2015/04/85120553.jpg";
				try {
					java.awt.Desktop.getDesktop().browse(
							java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
        	}
        });
        btnCompanyC.setBounds(6, 356, 171, 113);
        getContentPane().add(btnCompanyC);
        
        btnCompanyD = new JButton("Company D");
        btnCompanyD.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		String url = "http://i.telegraph.co.uk/multimedia/archive/03379/animals-smile_3379238k.jpg";
				try {
					java.awt.Desktop.getDesktop().browse(
							java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
        	}
        });
        btnCompanyD.setBounds(6, 481, 171, 113);
        getContentPane().add(btnCompanyD);
        
        lblChoosePaintingTo = new JLabel("Choose Painting  to Download");
        lblChoosePaintingTo.setHorizontalAlignment(SwingConstants.CENTER);
        lblChoosePaintingTo.setFont(new Font("Lucida Grande", Font.BOLD, 18));
        lblChoosePaintingTo.setBounds(210, 25, 292, 36);
        getContentPane().add(lblChoosePaintingTo);
     	
        
		

     
       //Register this frame as an Action listener of the buttons
        CompanyA.addActionListener(this);
        load.addActionListener(this);
        quit.addActionListener(this);
        
 
       //Exit program when the viewer is closed
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
  
   //Event handler
     public void actionPerformed(ActionEvent e){
    	 if (e.getSource() == quit){
                //System.exit(0);
    		 	setVisible(false);
				Home_Screen.setVisible(true);
             }
        }
        
           
        
        
        	
     public static void main(String[] args){
          new Download();
        // frame.setVisible(true);
      	
      
       
      }
  	 	
  	
  }

