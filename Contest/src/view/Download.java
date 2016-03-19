package view;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 
 * @author Gring Mustafa, Minyahil Kebebbegn, Vinh Tran
 *
 */
  @SuppressWarnings("serial")
public class Download extends JFrame implements ActionListener{
   // instance variables
	  JButton load;
      JButton quit;
      private JButton CompanyA;
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
        setSize         (900, 740);
        setResizable    (false);
        setTitle        ("Download Screen");
        setLocation     (150, 250);
        setVisible(true);
     
        contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.setBackground( new Color(102, 205, 170 ));
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
       //Create and Place the Buttons on the frame
        
        CompanyA = new JButton("List 1");
        CompanyA.setBounds(6, 106, 171, 113);
        contentPane.add(CompanyA);
        CompanyA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //img = new ImageIcon(getClass().getResource(Ant.png));								
				try {
					String path = "C:/Users/Phu/git/NewPaintingContest/Contest/src/Image/Lists/list 1/";
				    JFrame frame=new JFrame();
				    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				    File folder = new File(path);
				    File[] listOfFiles = folder.listFiles();
				    DefaultListModel<ImageIcon> listModel = new DefaultListModel<ImageIcon>();
				    int count = 0;
				    for (int i = 0; i < listOfFiles.length; i++)
				    {
				        System.out.println("check path"+listOfFiles[i]);
				        String name = listOfFiles[i].toString();
				        // load only JPEGs
				        if ( name.endsWith("png") ) {
				            ImageIcon ii = new ImageIcon(ImageIO.read(listOfFiles[i]));
				            listModel.add(count++, ii);
				        }
				    }
				    JList<ImageIcon> lsm=new JList<ImageIcon>(listModel);
				    lsm.setVisibleRowCount(3);

				    frame.add(new JScrollPane(lsm));

				    frame.pack();
				    frame.setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}						
			}
		});
             	
        load = new JButton("Download");
        load.setBounds(314, 613, 158, 67);
        contentPane.add(load);
        load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //img = new ImageIcon(getClass().getResource(Ant.png));								
				String title = "Frame Test";				
				ImageCopy f = new ImageCopy(title);
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setVisible(true);						
			}
		});
     	
        quit = new JButton("Quit");
        quit.setBounds(611, 613, 153, 67);
        contentPane.add(quit);
        
        btnCompanyB = new JButton("List 2");
        btnCompanyB.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		        		
				try {
					String path = "C:/Users/Phu/git/NewPaintingContest/Contest/src/Image/Lists/list 2/";
				    JFrame frame=new JFrame();
				    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				    File folder = new File(path);
				    File[] listOfFiles = folder.listFiles();
				    DefaultListModel<ImageIcon> listModel = new DefaultListModel<ImageIcon>();
				    int count = 0;
				    for (int i = 0; i < listOfFiles.length; i++)
				    {
				        System.out.println("check path"+listOfFiles[i]);
				        String name = listOfFiles[i].toString();
				        // load only JPEGs
				        if ( name.endsWith("png") ) {
				            ImageIcon ii = new ImageIcon(ImageIO.read(listOfFiles[i]));
				            listModel.add(count++, ii);
				        }
				    }
				    JList<ImageIcon> lsm=new JList<ImageIcon>(listModel);
				    lsm.setVisibleRowCount(3);

				    frame.add(new JScrollPane(lsm));

				    frame.pack();
				    frame.setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			
        	}
        });
        btnCompanyB.setBounds(6, 231, 171, 113);
        getContentPane().add(btnCompanyB);
                
        btnCompanyC = new JButton("List 3");
        btnCompanyC.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
				try {
					String path = "C:/Users/Phu/git/NewPaintingContest/Contest/src/Image/Lists/list 3/";
				    JFrame frame=new JFrame();
				    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				    File folder = new File(path);
				    File[] listOfFiles = folder.listFiles();
				    DefaultListModel<ImageIcon> listModel = new DefaultListModel<ImageIcon>();
				    int count = 0;
				    for (int i = 0; i < listOfFiles.length; i++)
				    {
				        System.out.println("check path"+listOfFiles[i]);
				        String name = listOfFiles[i].toString();
				        // load only JPEGs
				        if ( name.endsWith("png") ) {
				            ImageIcon ii = new ImageIcon(ImageIO.read(listOfFiles[i]));
				            listModel.add(count++, ii);
				        }
				    }
				    JList<ImageIcon> lsm=new JList<ImageIcon>(listModel);
				    lsm.setVisibleRowCount(3);

				    frame.add(new JScrollPane(lsm));

				    frame.pack();
				    frame.setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
        	}
        });
        btnCompanyC.setBounds(6, 356, 171, 113);
        getContentPane().add(btnCompanyC);
        
        btnCompanyD = new JButton("List 4");
        btnCompanyD.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
				try {
					String path = "C:/Users/Phu/git/NewPaintingContest/Contest/src/Image/Lists/list 4/";
				    JFrame frame=new JFrame();
				    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				    File folder = new File(path);
				    File[] listOfFiles = folder.listFiles();
				    DefaultListModel<ImageIcon> listModel = new DefaultListModel<ImageIcon>();
				    int count = 0;
				    for (int i = 0; i < listOfFiles.length; i++)
				    {
				        System.out.println("check path"+listOfFiles[i]);
				        String name = listOfFiles[i].toString();
				        // load only JPEGs
				        if ( name.endsWith("png") ) {
				            ImageIcon ii = new ImageIcon(ImageIO.read(listOfFiles[i]));
				            listModel.add(count++, ii);
				        }
				    }
				    JList<ImageIcon> lsm=new JList<ImageIcon>(listModel);
				    lsm.setVisibleRowCount(3);

				    frame.add(new JScrollPane(lsm));

				    frame.pack();
				    frame.setVisible(true);
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
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
     }
  
   //Event handler
     public void actionPerformed(ActionEvent e){
    	 if (e.getSource() == quit){
                //System.exit(0);
//    		 	setVisible(false);
//				Home_Screen.setVisible(true);
    		 dispose();
         }
     }
        
     public static void main(String[] args){
          new Download();
        // frame.setVisible(true);
     }
     
     
     public class ImageCopy extends JFrame implements ActionListener {
    	    JMenuItem fMenuOpen = null;
    	    JMenuItem fMenuSave = null;
    	    JMenuItem fMenuClose = null;
    	    JTextArea fTextArea;
    	    JLabel label;
    	    BufferedImage icon;
    	    File oldfile;
    	    JFileChooser fc;
    	    ImageFilter1 fJavaFilter = new ImageFilter1();
    	    File fFile;

    	    public ImageCopy(String title) {
    	        // TODO Auto-generated constructor stub

    	        super(title);
    	        Container content_pane = getContentPane();
    	        content_pane.setLayout(new BorderLayout());
    	        content_pane.setBackground( new Color(102, 205, 170 ));

    	        JMenu m = new JMenu("File");
    	        m.add(fMenuOpen = makeMenuItem("Open"));
    	        m.add(fMenuOpen = makeMenuItem("Save"));
    	        m.add(fMenuClose = makeMenuItem("Quit"));
    	        JMenuBar mb = new JMenuBar();
    	        mb.add(m);
    	        setJMenuBar(mb);
    	        setSize(400, 400);
    	    }

    	    public void actionPerformed(ActionEvent e) {
    	        boolean status = false;
    	        String command = e.getActionCommand();
    	        if (command.equals("Open")) {
    	            try {
    	                status = openFile();
    	            } catch (IOException e1) {
    	                // TODO Auto-generated catch block
    	                e1.printStackTrace();
    	            }
    	            if (!status)
    	                JOptionPane.showMessageDialog(null, "Error opening file!",
    	                        "File Open Error", JOptionPane.ERROR_MESSAGE);
    	        } else if (command.equals("Save")) {
    	            status = saveFile();
    	            if (!status)
    	                JOptionPane.showMessageDialog(null,
    	                        "IO error in saving file!!", "File Save Error",
    	                        JOptionPane.ERROR_MESSAGE);
    	        } else if (command.equals("Quit")) {
    	            dispose();
    	        }
    	    }

    	    private JMenuItem makeMenuItem(String name) {
    	        JMenuItem m = new JMenuItem(name);
    	        m.addActionListener(this);
    	        return m;
    	    }

    	    boolean openFile() throws IOException {
    	        JFileChooser fc = new JFileChooser();
    	        fc.setDialogTitle("Open File");
    	        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    	        fc.setCurrentDirectory(new File("C:/Users/Phu/git/NewPaintingContest/Contest/src/Image/Lists"));
    	        fc.setFileFilter(fJavaFilter);
    	        int result = fc.showOpenDialog(this);
    	        if (result == JFileChooser.CANCEL_OPTION) {
    	            return true;
    	        } else if (result == JFileChooser.APPROVE_OPTION) {

    	            fFile = fc.getSelectedFile();
    	            oldfile = fFile;
    	            System.out.println(fFile);
    	            FileInputStream fileInputStream = new FileInputStream(fFile);
    	            System.out.println(fileInputStream);
    	            System.out.println(fFile.getAbsolutePath());
    	            icon = ImageIO.read(fileInputStream);
    	            label = new JLabel(new ImageIcon(icon));
    	            label.setBounds(0, 0, 500, 500);
    	            label.setVisible(true);
    	            getContentPane().add(label);
    	            // Set the position of its text, relative to its icon:
    	            label.setVerticalTextPosition(JLabel.BOTTOM);
    	            label.setHorizontalTextPosition(JLabel.CENTER);
    	        } else {
    	            return false;
    	        }
    	        return true;
    	    }

    	    boolean saveFile() {
    	        File file = null;
    	        fc = new JFileChooser();
    	        javax.swing.filechooser.FileFilter filter = null;
    	        fc.setCurrentDirectory(new File("."));
    	        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    	        fc.addChoosableFileFilter(filter);
    	        filter = fc.getFileFilter();
    	        fc.setFileFilter(fJavaFilter);
    	        fc.setSelectedFile(fFile);
    	        int result = fc.showSaveDialog(this);
    	        if (result == JFileChooser.CANCEL_OPTION) {
    	            return true;
    	        } else if (result == JFileChooser.APPROVE_OPTION) {
    	            fFile = fc.getSelectedFile();
    	            if (fFile.exists()) {
    	                int response = JOptionPane.showConfirmDialog(null,
    	                        "Overwrite existing file?", "Confirm Overwrite",
    	                        JOptionPane.OK_CANCEL_OPTION,
    	                        JOptionPane.QUESTION_MESSAGE);
    	                if (response == JOptionPane.CANCEL_OPTION)
    	                    return false;
    	            }
    	            return writeFile(fFile, label);
    	        } else {
    	            return false;
    	        }
    	    }

    	    public boolean writeFile(File file, Object component) {
    	        try {

    	            BufferedImage i1 = ImageIO.read(oldfile);
    	            BufferedImage bi = new BufferedImage(i1.getWidth(), i1.getHeight(),
    	                    BufferedImage.TYPE_INT_RGB);
    	            Graphics g = bi.createGraphics();
    	            ImageIO.write(i1, "png", fFile);
    	        } catch (IOException e) {
    	            return false;
    	        }
    	        return true;
    	    }

    	    

    	}

    	class ImageFilter1 extends javax.swing.filechooser.FileFilter {
    	    public boolean accept(File f) {
    	        return f.getName().toLowerCase().endsWith(".png")
    	                || f.getName().toLowerCase().endsWith(".jpg")
    	                || f.getName().toLowerCase().endsWith(".jif")
    	                || f.isDirectory();
    	    }

    	    public String getDescription() {
    	        return "Image files (*.png)";
    	    }

    	}

  	 	
  	
  }

