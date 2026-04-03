package comSR;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Reminders extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reminders frame = new Reminders();
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
	public Reminders() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1098, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reminders");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 1062, 64);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Date :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 132, 163, 64);
		contentPane.add(lblNewLabel_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(183, 146, 282, 36);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_1_1 = new JLabel("Description :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(10, 207, 163, 64);
		contentPane.add(lblNewLabel_1_1);
		File f= new File("D:\\E Manager\\Reminders");
		f.mkdirs();
		JButton btnNewButton = new JButton("Set");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date i =dateChooser.getDate();
				SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
//				try {
//				System.out.println(sdf.format(i));
//				}catch(Exception e2) {
//					e2.printStackTrace();
//					JFrame h = null;
//					JOptionPane.showMessageDialog(h, "All the fields have to be filled");
//				}
				if(sdf.format(i).equals("")||textPane.getText().isEmpty()||comboBox.getSelectedItem()=="") {
					JFrame h = null;
					JOptionPane.showMessageDialog(h, "All the fields have to be filled");
				}
			else {
				
				PrintWriter writer;
				try {
					System.out.println(sdf.format(i));
					String name =sdf.format(i);
					 writer= new PrintWriter("D://E Manager//Reminders//"+name+".txt", "UTF-8");
					 writer.println(String.valueOf(comboBox.getSelectedItem())+": "+textPane.getText());
					 writer.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
			}
		});
		btnNewButton.setBounds(299, 368, 130, 50);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(183, 207, 301, 129);
		contentPane.add(scrollPane);
		
		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Event :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(494, 179, 163, 64);
		contentPane.add(lblNewLabel_1_1_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Business", "Birthday", "Anniversary", "Others"}));
		comboBox.setBounds(667, 192, 196, 36);
		contentPane.add(comboBox);
	}
}
