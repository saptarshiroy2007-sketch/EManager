package comSR;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JLabel;
//import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;



import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Desktop;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	 public int i = 0;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2_5;
	private JLabel lblNewLabel_2_4;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel;
	private String strexpen = "";
	private JTextPane textPane_1;
		class Helper extends TimerTask 
	{ 
		    
		    public void run() 
	    { 
		    	try {
		    		date();
		    		Date i = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		    		String s = sdf.format(i);
		    		BufferedReader br = null;
					FileReader fr = null;
					fr=new FileReader("D:\\E Manager\\Reminders\\"+s+".txt");
					br=new BufferedReader(fr);
					String r;
					while((r=br.readLine()) !=null) {
						textPane_1.setText(r);
					}
				}catch(Exception e1 ) {
					e1.printStackTrace();
				}
	    		
		    	}
//
//			
//
//			
//		    		
		    	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 50, 1318, 13);
		frame.getContentPane().add(separator);
		
		JTextPane textPane = new JTextPane();
		textPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPane.setForeground(Color.BLACK);
		textPane.setBounds(10, 11, 785, 28);
		frame.getContentPane().add(textPane);
		
		lblNewLabel = new JLabel("OC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnlineClass s = new OnlineClass();
				s.setVisible(true);
			}
		});
		lblNewLabel.setBounds(849, 11, 54, 28);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_1.setBounds(1278, 11, 30, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(lblNewLabel_1, popupMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Background");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrintWriter writer;
				try {
					
					 writer= new PrintWriter("D://E Manager//path.txt", "UTF-8");
					JOptionPane.showMessageDialog(frame, "Please save your image in this path D://E Manager//Photos as background.jpg ");
					 writer.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		popupMenu.add(mntmNewMenuItem);
		Image("E Manager\\Photos\\build.png", "settings", 30,28);
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(918, 11, 46, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(974, 11, 46, 28);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setBounds(1036, 11, 46, 28);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setBounds(1091, 11, 46, 28);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		lblNewLabel_2_4 = new JLabel("New label");
		lblNewLabel_2_4.setBounds(1147, 11, 46, 28);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		lblNewLabel_2_5 = new JLabel("New label");
		lblNewLabel_2_5.setBounds(1203, 11, 46, 28);
		frame.getContentPane().add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_3 = new JLabel("E");
		lblNewLabel_3.setForeground(new Color(0, 191, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(551, 114, 54, 70);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Manager");
		lblNewLabel_3_1.setForeground(new Color(255, 165, 0));
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel_3_1.setBounds(615, 114, 425, 70);
		frame.getContentPane().add(lblNewLabel_3_1);
		ImageIcon dabIcon1= new ImageIcon("D:\\Tulips.jpg");
		Image abImage1 = dabIcon1.getImage();
		Image modifiedDabImage1 = abImage1.getScaledInstance(392, 276, java.awt.Image.SCALE_SMOOTH);
		dabIcon1= new ImageIcon(modifiedDabImage1);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(dabIcon1);
		lblNewLabel_4.setBounds(897, 183, 392, 276);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField.setBounds(363, 217, 460, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
				
			ImageIcon dabIcon= new ImageIcon("D:\\E Manager\\Photos\\background.jpg");
			Image abImage = dabIcon.getImage();
			Image modifiedDabImage = abImage.getScaledInstance(1318, 590, java.awt.Image.SCALE_SMOOTH);
			dabIcon= new ImageIcon(modifiedDabImage);
		
		ImageIcon dabIcon11= new ImageIcon("D:\\E Manager\\Photos\\epad.jpg");
		Image abImage11 = dabIcon11.getImage();
		Image modifiedDabImage11 = abImage11.getScaledInstance(133, 107, java.awt.Image.SCALE_SMOOTH);
		dabIcon11= new ImageIcon(modifiedDabImage11);
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Notepad g = new Notepad();
				g.setVisible(true);
			}
		});
		lblNewLabel_5.setIcon(dabIcon11);
		lblNewLabel_5.setBounds(308, 352, 133, 107);
		frame.getContentPane().add(lblNewLabel_5);
		ImageIcon dabIcon111= new ImageIcon("D:\\E Manager\\Photos\\cal.jpg");
		Image abImage111 = dabIcon111.getImage();
		Image modifiedDabImage111 = abImage111.getScaledInstance(133, 107, java.awt.Image.SCALE_SMOOTH);
		dabIcon111= new ImageIcon(modifiedDabImage111);
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calendar2 c = new calendar2();
				c.setVisible(true);
			}
		});
		lblNewLabel_5_1.setIcon(dabIcon111);
		lblNewLabel_5_1.setBounds(473, 352, 133, 107);
		frame.getContentPane().add(lblNewLabel_5_1);
		ImageIcon dabIcon1111= new ImageIcon("D:\\E Manager\\Photos\\rem.jpg");
		Image abImage1111 = dabIcon1111.getImage();
		Image modifiedDabImage1111 = abImage1111.getScaledInstance(133, 107, java.awt.Image.SCALE_SMOOTH);
		dabIcon1111= new ImageIcon(modifiedDabImage1111);
		JLabel lblNewLabel_5_2 = new JLabel("New label");
		lblNewLabel_5_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Reminders c = new Reminders();
				c.setVisible(true);
			}
		});
		lblNewLabel_5_2.setIcon(dabIcon1111);
		lblNewLabel_5_2.setBounds(641, 352, 133, 107);
		frame.getContentPane().add(lblNewLabel_5_2);
		ImageIcon dabIcon11111= new ImageIcon("D:\\E Manager\\Photos\\calc.png");
		Image abImage11111 = dabIcon11111.getImage();
		Image modifiedDabImage11111 = abImage11111.getScaledInstance(133, 107, java.awt.Image.SCALE_SMOOTH);
		dabIcon11111= new ImageIcon(modifiedDabImage11111);
		JLabel lblNewLabel_5_3 = new JLabel("New label");
		lblNewLabel_5_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal window = new cal();
				window.frmCalculator.setVisible(true);
			}
		});
		lblNewLabel_5_3.setIcon(dabIcon11111);
		lblNewLabel_5_3.setBounds(308, 470, 133, 107);
		frame.getContentPane().add(lblNewLabel_5_3);
		ImageIcon dabIcon111111= new ImageIcon("D:\\E Manager\\Photos\\timer.jpg");
		Image abImage111111 = dabIcon111111.getImage();
		Image modifiedDabImage111111 = abImage111111.getScaledInstance(133, 107, java.awt.Image.SCALE_SMOOTH);
		dabIcon111111= new ImageIcon(modifiedDabImage111111);
		JLabel lblNewLabel_5_4 = new JLabel("New label");
		lblNewLabel_5_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timer window = new timer();
				window.setVisible(true);
			}
		});
		lblNewLabel_5_4.setIcon(dabIcon111111);
		lblNewLabel_5_4.setBounds(473, 470, 133, 107);
		frame.getContentPane().add(lblNewLabel_5_4);
		ImageIcon dabIcon1111111= new ImageIcon("D:\\E Manager\\Photos\\stopwatch.jpg");
		Image abImage1111111 = dabIcon1111111.getImage();
		Image modifiedDabImage1111111 = abImage1111111.getScaledInstance(133, 107, java.awt.Image.SCALE_SMOOTH);
		dabIcon1111111= new ImageIcon(modifiedDabImage1111111);
		JLabel lblNewLabel_5_5 = new JLabel("New label");
		lblNewLabel_5_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Stopwatch window = new Stopwatch();
				((Window) window.frmCalculator).setVisible(true);
			}
		});
		lblNewLabel_5_5.setIcon(dabIcon1111111);
		lblNewLabel_5_5.setBounds(641, 470, 133, 107);
		frame.getContentPane().add(lblNewLabel_5_5);
		File f = new File("D://E Manager");
		f.mkdirs();
		File g = new File("D://E Manager//E Pad");
		g.mkdirs();
		ImageIcon dabIcon11111111= new ImageIcon("D:\\E Manager\\Photos\\search.png");
		Image abImage11111111 = dabIcon11111111.getImage();
		Image modifiedDabImage11111111 = abImage11111111.getScaledInstance(52, 45, java.awt.Image.SCALE_SMOOTH);
		dabIcon11111111= new ImageIcon(modifiedDabImage11111111);
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop d =Desktop.getDesktop();
				try {
					
					d.browse(new URI(textField.getText()));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setIcon(dabIcon11111111);
		btnNewButton.setBounds(833, 217, 54, 47);
		frame.getContentPane().add(btnNewButton);
		
		text = new JTextField();
		text.setEditable(false);
		text.setBounds(897, 459, 392, 35);
		frame.getContentPane().add(text);
		text.setColumns(10);
		frame.setBounds(10, 10, 1334, 694);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Timer timer = new Timer(); 
       TimerTask task = new Helper(); 
	         
	        timer.schedule(task,0,1000); 
		//while() {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd   hh:mm");
//    		Date d = new Date();
//    		
//    		int date = d.getDate();
//    		Calendar c;
//    		
//    		
//    		int Year = d.getYear();
//    		
//    	//String full=(date+"/"+Month+"/"+Year);
//    	
//    		text.setText(sdf.format(d));
//    		
//    			
    
	//	}
	        JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(901, 505, 388, 107);
			frame.getContentPane().add(scrollPane);
			
			textPane_1 = new JTextPane();
			textPane_1.setEditable(false);
			scrollPane.setViewportView(textPane_1);
	        JLabel Background = new JLabel("");
			Background.setIcon(dabIcon);
			Background.setBounds(10, 55, 1318, 590);
			frame.getContentPane().add(Background);
			ImageIcon dabIcon111111111= new ImageIcon("D:\\E Manager\\Photos\\search.png");
			Image abImage111111111 = dabIcon111111111.getImage();
			Image modifiedDabImage111111111 = abImage111111111.getScaledInstance(32, 26, java.awt.Image.SCALE_SMOOTH);
			dabIcon111111111= new ImageIcon(modifiedDabImage111111111);
			JButton btnNewButton_1 = new JButton("");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Desktop d =Desktop.getDesktop();
					try {
						d.browse(new URI("https://www.google.com/search?q="+textPane.getText()+"&rlz=1C1CHBF_enIN917IN917&oq=&aqs=chrome.2.35i39i362l8...8.1530572j0j7&sourceid=chrome&ie=UTF-8"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_1.setIcon(dabIcon111111111);
			btnNewButton_1.setBounds(805, 11, 34, 28);
			frame.getContentPane().add(btnNewButton_1);
			
			
	}
	public void date() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd   hh:mm");
		Date d = new Date();
		
		int date = d.getDate();
		Calendar c;
		
		
		int Year = d.getYear();
		
	//String full=(date+"/"+Month+"/"+Year);
	
		text.setText(sdf.format(d));
			
	}
	public void Image(String a, String b,int x, int y) {
		ImageIcon dabIcon1= new ImageIcon("D:\\"+a);
		Image abImage1 = dabIcon1.getImage();
		Image modifiedDabImage1 = abImage1.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
		dabIcon1= new ImageIcon(modifiedDabImage1);
		if(b.equals("settings")) {
			lblNewLabel_1.setIcon(dabIcon1);
		}
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
