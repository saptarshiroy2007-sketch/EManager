package comSR;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class calendar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtSunday;
	private JTextField txtMonday;
	private JTextField txtTuesday;
	private JTextField txtWednesday;
	private JTextField txtThursday;
	private JTextField txtFriday;
	private JTextField txtSaturday;
	private JTextField t1;
	private JTextField t8;
	private JTextField t15;
	private JTextField t22;
	private JTextField t29;
	private JTextField t2;
	private JTextField t9;
	private JTextField t16;
	private JTextField t23;
	private JTextField t30;
	private JTextField t31;
	private JTextField t24;
	private JTextField t17;
	private JTextField t10;
	private JTextField t3;
	private JTextField t4;
	private JTextField t11;
	private JTextField t18;
	private JTextField t25;
	private JTextField t32;
	private JTextField t5;
	private JTextField t12;
	private JTextField t19;
	private JTextField t26;
	private JTextField t33;
	private JTextField t6;
	private JTextField t13;
	private JTextField t20;
	private JTextField t27;
	private JTextField t34;
	private JTextField t35;
	private JTextField t28;
	private JTextField t21;
	private JTextField t14;
	private JTextField t7;
	private JTextField t36;
	private JTextField t37;
	private JTextField t38;
	private JTextField t39;
	private JTextField t40;
	private JTextField t41;
	private JTextField t42;
    private Calendar c =Calendar.getInstance();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calendar frame = new calendar();
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
	public calendar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1110, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 1055, 38);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(109, 60, 877, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 60, 89, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(996, 60, 89, 47);
		contentPane.add(btnNewButton_1);
		
		txtSunday = new JTextField();
		txtSunday.setHorizontalAlignment(SwingConstants.CENTER);
		txtSunday.setEditable(false);
		txtSunday.setText("Sunday");
		txtSunday.setBounds(10, 118, 145, 38);
		contentPane.add(txtSunday);
		txtSunday.setColumns(10);
		
		txtMonday = new JTextField();
		txtMonday.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonday.setEditable(false);
		txtMonday.setText("Monday");
		txtMonday.setColumns(10);
		txtMonday.setBounds(165, 118, 145, 38);
		contentPane.add(txtMonday);
		
		txtTuesday = new JTextField();
		txtTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		txtTuesday.setEditable(false);
		txtTuesday.setText("Tuesday");
		txtTuesday.setColumns(10);
		txtTuesday.setBounds(320, 118, 145, 38);
		contentPane.add(txtTuesday);
		
		txtWednesday = new JTextField();
		txtWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		txtWednesday.setEditable(false);
		txtWednesday.setText("Wednesday");
		txtWednesday.setColumns(10);
		txtWednesday.setBounds(475, 118, 145, 38);
		contentPane.add(txtWednesday);
		
		txtThursday = new JTextField();
		txtThursday.setHorizontalAlignment(SwingConstants.CENTER);
		txtThursday.setEditable(false);
		txtThursday.setText("Thursday");
		txtThursday.setColumns(10);
		txtThursday.setBounds(630, 118, 145, 38);
		contentPane.add(txtThursday);
		
		txtFriday = new JTextField();
		txtFriday.setHorizontalAlignment(SwingConstants.CENTER);
		txtFriday.setToolTipText("");
		txtFriday.setEditable(false);
		txtFriday.setText("Friday");
		txtFriday.setColumns(10);
		txtFriday.setBounds(785, 118, 145, 38);
		contentPane.add(txtFriday);
		
		txtSaturday = new JTextField();
		txtSaturday.setHorizontalAlignment(SwingConstants.CENTER);
		txtSaturday.setEditable(false);
		txtSaturday.setText("Saturday");
		txtSaturday.setColumns(10);
		txtSaturday.setBounds(940, 118, 145, 38);
		contentPane.add(txtSaturday);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setEditable(false);
		t1.setBounds(10, 167, 145, 82);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t8 = new JTextField();
		t8.setHorizontalAlignment(SwingConstants.CENTER);
		t8.setEditable(false);
		t8.setColumns(10);
		t8.setBounds(10, 260, 145, 82);
		contentPane.add(t8);
		
		t15 = new JTextField();
		t15.setHorizontalAlignment(SwingConstants.CENTER);
		t15.setEditable(false);
		t15.setColumns(10);
		t15.setBounds(10, 353, 145, 82);
		contentPane.add(t15);
		
		t22 = new JTextField();
		t22.setEditable(false);
		t22.setHorizontalAlignment(SwingConstants.CENTER);
		t22.setColumns(10);
		t22.setBounds(10, 446, 145, 82);
		contentPane.add(t22);
		
		t29 = new JTextField();
		t29.setEditable(false);
		t29.setHorizontalAlignment(SwingConstants.CENTER);
		t29.setColumns(10);
		t29.setBounds(10, 539, 145, 82);
		contentPane.add(t29);
		
		t2 = new JTextField();
		t2.setEditable(false);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setColumns(10);
		t2.setBounds(165, 167, 145, 82);
		contentPane.add(t2);
		
		t9 = new JTextField();
		t9.setEditable(false);
		t9.setHorizontalAlignment(SwingConstants.CENTER);
		t9.setColumns(10);
		t9.setBounds(165, 260, 145, 82);
		contentPane.add(t9);
		
		t16 = new JTextField();
		t16.setEditable(false);
		t16.setHorizontalAlignment(SwingConstants.CENTER);
		t16.setColumns(10);
		t16.setBounds(165, 353, 145, 82);
		contentPane.add(t16);
		
		t23 = new JTextField();
		t23.setEditable(false);
		t23.setHorizontalAlignment(SwingConstants.CENTER);
		t23.setColumns(10);
		t23.setBounds(165, 446, 145, 82);
		contentPane.add(t23);
		
		t30 = new JTextField();
		t30.setEditable(false);
		t30.setHorizontalAlignment(SwingConstants.CENTER);
		t30.setColumns(10);
		t30.setBounds(165, 539, 145, 82);
		contentPane.add(t30);
		
		t31 = new JTextField();
		t31.setHorizontalAlignment(SwingConstants.CENTER);
		t31.setEditable(false);
		t31.setColumns(10);
		t31.setBounds(320, 539, 145, 82);
		contentPane.add(t31);
		
		t24 = new JTextField();
		t24.setHorizontalAlignment(SwingConstants.CENTER);
		t24.setEditable(false);
		t24.setColumns(10);
		t24.setBounds(320, 446, 145, 82);
		contentPane.add(t24);
		
		t17 = new JTextField();
		t17.setEditable(false);
		t17.setHorizontalAlignment(SwingConstants.CENTER);
		t17.setColumns(10);
		t17.setBounds(320, 353, 145, 82);
		contentPane.add(t17);
		
		t10 = new JTextField();
		t10.setHorizontalAlignment(SwingConstants.CENTER);
		t10.setEditable(false);
		t10.setColumns(10);
		t10.setBounds(320, 260, 145, 82);
		contentPane.add(t10);
		
		t3 = new JTextField();
		t3.setEditable(false);
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setColumns(10);
		t3.setBounds(320, 167, 145, 82);
		contentPane.add(t3);
		
		t4 = new JTextField();
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setEditable(false);
		t4.setColumns(10);
		t4.setBounds(475, 167, 145, 82);
		contentPane.add(t4);
		
		t11 = new JTextField();
		t11.setHorizontalAlignment(SwingConstants.CENTER);
		t11.setEditable(false);
		t11.setColumns(10);
		t11.setBounds(475, 260, 145, 82);
		contentPane.add(t11);
		
		t18 = new JTextField();
		t18.setHorizontalAlignment(SwingConstants.CENTER);
		t18.setEditable(false);
		t18.setColumns(10);
		t18.setBounds(475, 353, 145, 82);
		contentPane.add(t18);
		
		t25 = new JTextField();
		t25.setHorizontalAlignment(SwingConstants.CENTER);
		t25.setEditable(false);
		t25.setColumns(10);
		t25.setBounds(475, 446, 145, 82);
		contentPane.add(t25);
		
		t32 = new JTextField();
		t32.setHorizontalAlignment(SwingConstants.CENTER);
		t32.setEditable(false);
		t32.setColumns(10);
		t32.setBounds(475, 539, 145, 82);
		contentPane.add(t32);
		
		t5 = new JTextField();
		t5.setEditable(false);
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setColumns(10);
		t5.setBounds(630, 167, 145, 82);
		contentPane.add(t5);
		
		t12 = new JTextField();
		t12.setHorizontalAlignment(SwingConstants.CENTER);
		t12.setEditable(false);
		t12.setColumns(10);
		t12.setBounds(630, 260, 145, 82);
		contentPane.add(t12);
		
		t19 = new JTextField();
		t19.setHorizontalAlignment(SwingConstants.CENTER);
		t19.setEditable(false);
		t19.setColumns(10);
		t19.setBounds(630, 353, 145, 82);
		contentPane.add(t19);
		
		t26 = new JTextField();
		t26.setHorizontalAlignment(SwingConstants.CENTER);
		t26.setEditable(false);
		t26.setColumns(10);
		t26.setBounds(630, 446, 145, 82);
		contentPane.add(t26);
		
		t33 = new JTextField();
		t33.setHorizontalAlignment(SwingConstants.CENTER);
		t33.setEditable(false);
		t33.setColumns(10);
		t33.setBounds(630, 539, 145, 82);
		contentPane.add(t33);
		
		t6 = new JTextField();
		t6.setEditable(false);
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		t6.setColumns(10);
		t6.setBounds(785, 167, 145, 82);
		contentPane.add(t6);
		
		t13 = new JTextField();
		t13.setHorizontalAlignment(SwingConstants.CENTER);
		t13.setEditable(false);
		t13.setColumns(10);
		t13.setBounds(785, 260, 145, 82);
		contentPane.add(t13);
		
		t20 = new JTextField();
		t20.setHorizontalAlignment(SwingConstants.CENTER);
		t20.setEditable(false);
		t20.setColumns(10);
		t20.setBounds(785, 353, 145, 82);
		contentPane.add(t20);
		
		t27 = new JTextField();
		t27.setHorizontalAlignment(SwingConstants.CENTER);
		t27.setEditable(false);
		t27.setColumns(10);
		t27.setBounds(785, 446, 145, 82);
		contentPane.add(t27);
		
		t34 = new JTextField();
		t34.setHorizontalAlignment(SwingConstants.CENTER);
		t34.setEditable(false);
		t34.setColumns(10);
		t34.setBounds(785, 539, 145, 82);
		contentPane.add(t34);
		
		t35 = new JTextField();
		t35.setHorizontalAlignment(SwingConstants.CENTER);
		t35.setEditable(false);
		t35.setColumns(10);
		t35.setBounds(940, 539, 145, 82);
		contentPane.add(t35);
		
		t28 = new JTextField();
		t28.setHorizontalAlignment(SwingConstants.CENTER);
		t28.setEditable(false);
		t28.setColumns(10);
		t28.setBounds(940, 446, 145, 82);
		contentPane.add(t28);
		
		t21 = new JTextField();
		t21.setEditable(false);
		t21.setHorizontalAlignment(SwingConstants.CENTER);
		t21.setColumns(10);
		t21.setBounds(940, 353, 145, 82);
		contentPane.add(t21);
		
		t14 = new JTextField();
		t14.setHorizontalAlignment(SwingConstants.CENTER);
		t14.setEditable(false);
		t14.setColumns(10);
		t14.setBounds(940, 260, 145, 82);
		contentPane.add(t14);
		
		t7 = new JTextField();
		t7.setHorizontalAlignment(SwingConstants.CENTER);
		t7.setEditable(false);
		t7.setColumns(10);
		t7.setBounds(940, 167, 145, 82);
		contentPane.add(t7);
		
		t36 = new JTextField();
		t36.setHorizontalAlignment(SwingConstants.CENTER);
		t36.setEditable(false);
		t36.setColumns(10);
		t36.setBounds(10, 632, 145, 82);
		contentPane.add(t36);
		
		t37 = new JTextField();
		t37.setHorizontalAlignment(SwingConstants.CENTER);
		t37.setEditable(false);
		t37.setColumns(10);
		t37.setBounds(165, 632, 145, 82);
		contentPane.add(t37);
		
		t38 = new JTextField();
		t38.setHorizontalAlignment(SwingConstants.CENTER);
		t38.setEditable(false);
		t38.setColumns(10);
		t38.setBounds(320, 632, 145, 82);
		contentPane.add(t38);
		
		t39 = new JTextField();
		t39.setHorizontalAlignment(SwingConstants.CENTER);
		t39.setEditable(false);
		t39.setColumns(10);
		t39.setBounds(475, 632, 145, 82);
		contentPane.add(t39);
		
		t40 = new JTextField();
		t40.setHorizontalAlignment(SwingConstants.CENTER);
		t40.setEditable(false);
		t40.setColumns(10);
		t40.setBounds(630, 632, 145, 82);
		contentPane.add(t40);
		
		t41 = new JTextField();
		t41.setHorizontalAlignment(SwingConstants.CENTER);
		t41.setEditable(false);
		t41.setColumns(10);
		t41.setBounds(785, 632, 145, 82);
		contentPane.add(t41);
		
		t42 = new JTextField();
		t42.setHorizontalAlignment(SwingConstants.CENTER);
		t42.setEditable(false);
		t42.setColumns(10);
		t42.setBounds(940, 632, 145, 82);
		contentPane.add(t42);
		initialize();
	}
	public void initialize() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date m = new Date();
		int month=m.getMonth();
		month++;
		if(month==1) {
			textField.setText("January " + String.valueOf(sdf.format(m)));
			
		}
	}
}
