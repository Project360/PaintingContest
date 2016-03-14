/*
 * 
  @Minyahil Kebebbegn
 
  */


package view;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

  @SuppressWarnings("serial")
public class Download extends JFrame implements ActionListener{
   // instance variables
   
    
      
     
      JMenuItem Open = null;
      JMenuItem Save = null;
      JMenuItem Close = null;
      JTextArea fTextArea;
      static JLabel label;
      static BufferedImage icon;
      static File file;
      JFileChooser fc;
      ImageFilter1 fJavaFilter = new ImageFilter1();
      static File FilterFile;
      
      
     
  	
  
   /**
    * Constructor for objects of class Calculate
    */
      
     
     Download(){
        Container contentPane;
     
       //Set the frame properties
        
        contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.setBackground( new Color(102, 205, 170));
        
     	
        JMenu menu = new JMenu("File");
        menu.add(Open = makeMenuItem("Open"));
        menu.add(Open = makeMenuItem("Save"));
        menu.add(Close = makeMenuItem("Quit"));
        JMenuBar Menubar = new JMenuBar();
        Menubar.add(menu);
        setJMenuBar(Menubar);
        setSize(550, 450);
        setVisible(true);
        
       
     }
  
   //Event handler
     public void actionPerformed(ActionEvent e){
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
         fc.setCurrentDirectory(new File("."));
         fc.setFileFilter(fJavaFilter);
         int result = fc.showOpenDialog(this);
         if (result == JFileChooser.CANCEL_OPTION) {
             return true;
         } else if (result == JFileChooser.APPROVE_OPTION) {

             FilterFile = fc.getSelectedFile();
             file = FilterFile;
             System.out.println(FilterFile);
             FileInputStream fileInputStream = new FileInputStream(FilterFile);
             System.out.println(fileInputStream);
             System.out.println(FilterFile.getAbsolutePath());
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
         fc.setSelectedFile(FilterFile);
         int result = fc.showSaveDialog(this);
         if (result == JFileChooser.CANCEL_OPTION) {
             return true;
         } else if (result == JFileChooser.APPROVE_OPTION) {
             FilterFile = fc.getSelectedFile();
             if (FilterFile.exists()) {
                 int response = JOptionPane.showConfirmDialog(null,
                         "File already exist! Do you want to overwrite existing file?", "Confirm Overwrite",
                         JOptionPane.OK_CANCEL_OPTION,
                         JOptionPane.QUESTION_MESSAGE);
                 if (response == JOptionPane.CANCEL_OPTION)
                     return false;
             }
             return writeFile(FilterFile, label);
         } else {
             return false;
         }
     }

     public static boolean writeFile(File file, Object component) {
         try {

             BufferedImage i1 = ImageIO.read(file);
             BufferedImage bi = new BufferedImage(i1.getWidth(), i1.getHeight(),
                     BufferedImage.TYPE_INT_RGB);
             Graphics g = bi.createGraphics();
             ImageIO.write(i1, "png", FilterFile);
         } catch (IOException e) {
             return false;
         }
         return true;
     }

class ImageFilter1 extends javax.swing.filechooser.FileFilter {
    public boolean accept(File f) {
        return f.getName().toLowerCase().endsWith(".png")
                || f.getName().toLowerCase().endsWith(".jpg")
                || f.getName().toLowerCase().endsWith(".jif")
                || f.isDirectory();
    }

    public String getDescription() {
        return " (*.png) File";
    }


        	
}

  	
  }

