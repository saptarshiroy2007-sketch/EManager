package comSR;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class Notepad extends JFrame {
	private JPanel contentPane;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JTextField textField;
	private JTextPane text;
	private boolean flag= true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notepad frame = new Notepad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Notepad() {
		setTitle("EPad-Untitled");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 10, 1334, 694);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("New");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s = text.getText();
			if(s.isEmpty()) {
				text.setText("");
			}else {
				JFrame frame=null;
				if(JOptionPane.showConfirmDialog(frame,"Do you want to add a new one without saving changes","E Pad",
						JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION) {
					text.setText("");
				}else {
					JOptionPane.showMessageDialog(frame, "This is Working");
				}
			}
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Open");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname = JOptionPane.showInputDialog("Enter File name");
				String text1 = reader(fname);
				text.setText(text1);
				if(flag) {
				textField.setText(fname);
				setTitle("EPad- "+fname);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Save");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nfname=textField.getText();
				if(nfname.isEmpty()) {
					writer(JOptionPane.showInputDialog("Enter File Name"),text.getText());	
				}
				else {
				writer(nfname,text.getText());
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Save As");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				writer(JOptionPane.showInputDialog("Enter File Name"),text.getText());	
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_4 = new JMenuItem("Print");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					text.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_5 = new JMenuItem("How to Use");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame= null;
				JOptionPane.showMessageDialog(frame, "In E Pad you can record notes of your work. Just type the text and click on the File Option to save,print etc.");
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		mntmNewMenuItem_6 = new JMenuItem("About EPad");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame= null;
				JOptionPane.showMessageDialog(frame, "E Pad is a free pad where you can store your notes virtually.");
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		textField = new JTextField();
		textField.setEditable(false);
		menuBar.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		menuBar.add(lblNewLabel);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(2, 2, 2, 2));
		contentPane.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		text = new JTextPane();
		scrollPane.setViewportView(text);
	}
	 public void writer(String name, String cont) {
			PrintWriter writer;
			try {
				writer = new PrintWriter("D://E Manager//E Pad//"+name+".txt", "UTF-8");
				writer.println(cont);
				writer.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		public String reader(String a) {
			try {
				BufferedReader br = null;
				FileReader fr = null;
				fr=new FileReader("D://E Manager//E Pad//"+a+".txt");
				br=new BufferedReader(fr);
				String strexpen = "";
				while((strexpen=br.readLine()) !=null) {
					return strexpen;
				}
			}catch(Exception e1 ) {
				e1.printStackTrace();
				textField.setText("File not Found");
				JFrame frame = null;
				JOptionPane.showMessageDialog(frame, "File not Found");
				flag=false;
			}
			return null;
			
		}
}
