package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;



public class Submit extends JFrame implements ActionListener{
	String filelist = "nothing";
	private JFrame frame;
	static File sf;
	static File oldfile;
	JButton Submitbtn, Openbtn;
	final JLabel statusbarr = 
            new JLabel(" ");
	static String register;
	boolean bool = false;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Submit window = new Submit();
//					window.frame.setVisible(true);
//					
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Submit() 
	{
		initialize();
		//JFrame frame;
				setVisible(true);
				setSize(550, 450);
				setBackground(new Color(102, 205, 170));
				getContentPane().setBackground(new Color(102, 205, 170));
				setLayout(null);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				setTitle(" Submit Window ");

				
				Submitbtn = new JButton("Submit");
				Openbtn = new JButton("Upload Picture");

				Submitbtn.addActionListener(this);
				Openbtn.addActionListener(this);

				
				Submitbtn.setBounds(100, 150, 120, 50); // submit
				Openbtn.setBounds(300, 150, 120, 50); //open
				statusbarr.setBounds(300,180,150,150);

				

				add(Submitbtn);
				add(Openbtn);
		        add(statusbarr);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
    
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Openbtn) 
		{
			SimpleFileChooser sfc = new SimpleFileChooser();
		    sfc.setVisible(true);
		    
       
		}
		if (e.getSource() == Submitbtn) 
		{
			if (bool == true)
			{
			
			
			try {
			    // retrieve image
			    BufferedImage bi =ImageIO.read(oldfile);
			    register = Login.getRegister();
			    File outputfile = new File("C:/workspace/contest/images/Submited Image/"+register+".png");
			    ImageIO.write(bi, "png", outputfile);
			    JOptionPane.showMessageDialog(Submitbtn, " Thank you for submitting "+register);
			} catch (IOException e1) {
				return;
			}
       
		
		    }
			else
			{
				JOptionPane.showMessageDialog(Submitbtn, " please upload picture");	
			}
		}
		
		
		
	}
	public class SimpleFileChooser extends JFrame {

		   public SimpleFileChooser() {
		    super("File Chooser Test Frame");
		    setSize(350, 200);
		    setDefaultCloseOperation(EXIT_ON_CLOSE);

		    Container c = getContentPane();
		    c.setLayout(new FlowLayout());
		    
		    JButton openButton = new JButton("Open");
		    JButton doneButton = new JButton("Done");
		   
		    final JLabel statusbar = 
		                 new JLabel("Output of your selection will go here");

		    // Create a file chooser that opens up as an Open dialog
		    openButton.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ae) {
		        JFileChooser chooser = new JFileChooser();
		        chooser.setMultiSelectionEnabled(true);
		        int option = chooser.showOpenDialog(SimpleFileChooser.this);
		        if (option == JFileChooser.APPROVE_OPTION) {
		           sf = chooser.getSelectedFile();
		          oldfile = sf;
		          bool = true;
		          statusbar.setText("image uploaded ");
		          
		          
		        
		        }
		        else {
		          statusbar.setText("You canceled.");
		        }
		        
		      }
		      });

		    // Create a file chooser that opens up as a Save dialog
		    doneButton.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ae)
		      {
		    	  if(bool == true)
		    	  {
		    	  statusbarr.setText("Image Uploaded");
		    	  }
		    	  else
		    	  {
		    	   statusbarr.setText("NO Image Chosen");  
		    	  }
		    	  Window sfc = SwingUtilities.windowForComponent( doneButton );
		    	  sfc.dispose();
		          
		      }
		    });

		    // Create a file chooser that allows you to pick a directory
		    // rather than a file
		    

		    c.add(openButton);
		    c.add(doneButton);
		    
		    c.add(statusbar);
		  }

		  
		}
	

}
