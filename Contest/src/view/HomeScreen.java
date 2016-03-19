package view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

/**
 * 
 * @author Minyahil Kebebbegn
 * @author Sara Vandandaigue - refactoring
 *
 */
public class HomeScreen extends JFrame{

	private static final long serialVersionUID = 1L;
	private JFrame frame;

	public static void main(String[] args) {
		new HomeScreen();
	}
	/**
	 * Create the application.
	 */
	public HomeScreen() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(100, 100, 679, 439);
		frame.getContentPane().setBackground( new Color(102, 205, 170 ));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE COLORING CONTEST");
		lblWelcomeToThe.setForeground(Color.RED);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWelcomeToThe.setBounds(124, 16, 404, 64);
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JButton btnRegister = new JButton("REGISTER");//download
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Registration();
			}
		});
		btnRegister.setBounds(91, 120, 141, 64);
		frame.getContentPane().add(btnRegister);
		
		JButton btnLogin = new JButton("LOGIN");//reg -->login
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login();
			}
		});
		btnLogin.setBounds(91, 273, 141, 64);
		frame.getContentPane().add(btnLogin);
		
		JButton btnDownload = new JButton("DOWNLOAD");//login
		btnDownload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Download();
			}
		});
		btnDownload.setBounds(421, 120, 141, 64);
		frame.getContentPane().add(btnDownload);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Login.ReturnExampleBool())
				{
					new Submit();
				}
				else
				{
					JOptionPane.showMessageDialog(btnSubmit,"Please Login");
				}				 
			
				}
		});
		btnSubmit.setBounds(421, 273, 141, 64);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnEntry = new JButton("ENTRY");
		btnEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Submit();
			}
		});
		btnEntry.setBounds(91, 273, 141, 64);
		frame.getContentPane().add(btnEntry);
        frame.setVisible(true);

	}
}
