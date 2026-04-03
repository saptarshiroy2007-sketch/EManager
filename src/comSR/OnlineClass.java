package comSR;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

public class OnlineClass extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnlineClass frame = new OnlineClass();
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
	public OnlineClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1077, 431);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Maths");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop d =Desktop.getDesktop();
				try {
					d.browse(new URI("https://us04web.zoom.us/j/76553688052?pwd=K3QyelYzc3pSd3d5Z3QxSERsN2QyZz09"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(26, 81, 138, 106);
		contentPane.add(btnNewButton);
		
		JButton btnBiology = new JButton("Biology");
		btnBiology.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBiology.setBounds(174, 81, 138, 106);
		contentPane.add(btnBiology);
		
		JButton btnPhysics = new JButton("Physics");
		btnPhysics.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnPhysics.setBounds(321, 81, 138, 106);
		contentPane.add(btnPhysics);
		
		JButton btnChemistry = new JButton("Chemistry");
		btnChemistry.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChemistry.setBounds(469, 81, 138, 106);
		contentPane.add(btnChemistry);
		
		JButton btnNewButton_3_1 = new JButton("Computer");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3_1.setBounds(617, 81, 138, 106);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Bengali");
		btnNewButton_3_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_3_2.setBounds(765, 81, 138, 106);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("New button");
		btnNewButton_3_3.setBounds(913, 81, 138, 106);
		contentPane.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_4 = new JButton("Literature");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop d =Desktop.getDesktop();
				try {
					d.browse(new URI("https://us05web.zoom.us/j/89216883686?pwd=VTkycWVXSW5Yb0o4bEQvTmhjN2xrQT09&open=1"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3_4.setBounds(26, 198, 138, 106);
		contentPane.add(btnNewButton_3_4);
		
		JButton btnNewButton_3_5 = new JButton("Language");
		btnNewButton_3_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3_5.setBounds(174, 198, 138, 106);
		contentPane.add(btnNewButton_3_5);
		
		JButton btnNewButton_3_6 = new JButton("History");
		btnNewButton_3_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3_6.setBounds(321, 198, 138, 106);
		contentPane.add(btnNewButton_3_6);
		
		JButton btnNewButton_3_7 = new JButton("Geography");
		btnNewButton_3_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3_7.setBounds(469, 198, 138, 106);
		contentPane.add(btnNewButton_3_7);
		
		JButton btnNewButton_3_8 = new JButton("GK");
		btnNewButton_3_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_8.setBounds(617, 198, 138, 106);
		contentPane.add(btnNewButton_3_8);
		
		JButton btnNewButton_3_9 = new JButton("V ed.");
		btnNewButton_3_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_9.setBounds(765, 198, 138, 106);
		contentPane.add(btnNewButton_3_9);
		
		JLabel lblNewLabel = new JLabel("Online Class");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(253, 11, 422, 59);
		contentPane.add(lblNewLabel);
	}
}
