package comSR;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class cal {

	JFrame frmCalculator;
	private JTextField usertext;
	
	double firstnum =0.0;
	double secondnum=0.0;
	double result;
	String operations;
	String re;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btnEqual;
	private JButton btnC;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Acer\\Pictures\\My logo.png"));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 251, 390);
		frmCalculator.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		usertext = new JTextField();
		usertext.setFont(new Font("Tahoma", Font.BOLD, 32));
		usertext.setHorizontalAlignment(SwingConstants.RIGHT);
		usertext.setBounds(10, 54, 212, 53);
		frmCalculator.getContentPane().add(usertext);
		usertext.setColumns(10);
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBounds(10, 11, 212, 39);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum+= Double.parseDouble(usertext.getText()) ;
				usertext.setText("");
				textField.setText((re = String.format("%.2f", firstnum))+" +");
				operations = "+";
			
				
			
				
				
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnadd.setBounds(123, 118, 59, 47);
		frmCalculator.getContentPane().add(btnadd);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().endsWith("+")||textField.getText().endsWith("-")||textField.getText().endsWith("*")||textField.getText().endsWith("/")) {
					String answer;
					secondnum=Double.parseDouble(usertext.getText());
					
					if (operations== "+") {
						textField.setText((re = String.format("%.2f", firstnum))+" + " +(re = String.format("%.2f", secondnum)));
						result = firstnum + secondnum;
						answer = String.format("%.2f", result);
						usertext.setText(answer);
					}
						else if(operations== "-") {
							textField.setText((re = String.format("%.2f", firstnum))+" - " +(re = String.format("%.2f", secondnum)));
							result = firstnum - secondnum;
							answer = String.format("%.2f", result);
							usertext.setText(answer);
						
					}
						else if(operations== "*") {
							textField.setText((re = String.format("%.2f", firstnum))+" * " +(re = String.format("%.2f", secondnum)));
							result = firstnum * secondnum;
							answer = String.format("%.2f", result);
							usertext.setText(answer);
						}	
						else if(operations== "/") {
							textField.setText((re = String.format("%.2f", firstnum))+" / " +(re = String.format("%.2f", secondnum)));
							result = firstnum / secondnum;
							answer = String.format("%.2f", result);
							usertext.setText(answer);
						}
					
				}
				firstnum= Double.parseDouble(usertext.getText()) ;
				usertext.setText("");
				textField.setText((re = String.format("%.2f", firstnum))+" -");
				operations = "-";
						
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnminus.setBounds(184, 118, 50, 47);
		frmCalculator.getContentPane().add(btnminus);
		
		
		
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = usertext.getText() + btn1.getText();
				usertext.setText(enternum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(0, 167, 59, 47);
		frmCalculator.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = usertext.getText() + btn2.getText();
				usertext.setText(enternum);
							}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(61, 167, 59, 47);
		frmCalculator.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = usertext.getText() + btn3.getText();
				usertext.setText(enternum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(123, 167, 59, 47);
		frmCalculator.getContentPane().add(btn3);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = usertext.getText() + btn4.getText();
				usertext.setText(enternum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(0, 213, 59, 47);
		frmCalculator.getContentPane().add(btn4);
	
	
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usertext.setText(null);
				
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnC.setBounds(0, 118, 59, 47);
		frmCalculator.getContentPane().add(btnC);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = usertext.getText() + btn5.getText();
				usertext.setText(enternum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(61, 213, 59, 47);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = usertext.getText() + btn6.getText();
				usertext.setText(enternum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(123, 215, 59, 47);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = usertext.getText() + btn7.getText();
				usertext.setText(enternum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(0, 260, 59, 47);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = usertext.getText() + btn8.getText();
				usertext.setText(enternum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(61, 260, 59, 47);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = usertext.getText() + btn9.getText();
				usertext.setText(enternum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(123, 260, 59, 47);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnpoint = new JButton(".");
		btnpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = usertext.getText() + btnpoint.getText();
				usertext.setText(enternum);
			}
		});
		btnpoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpoint.setBounds(0, 307, 59, 47);
		frmCalculator.getContentPane().add(btnpoint);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String enternum = usertext.getText() + btn0.getText();
			usertext.setText(enternum);
		}
	});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(61, 307, 59, 47);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().endsWith("+")||textField.getText().endsWith("-")||textField.getText().endsWith("*")||textField.getText().endsWith("/")) {
					String answer;
					secondnum=Double.parseDouble(usertext.getText());
					
					if (operations== "+") {
						textField.setText((re = String.format("%.2f", firstnum))+" + " +(re = String.format("%.2f", secondnum)));
						result = firstnum + secondnum;
						answer = String.format("%.2f", result);
						usertext.setText(answer);
					}
						else if(operations== "-") {
							textField.setText((re = String.format("%.2f", firstnum))+" - " +(re = String.format("%.2f", secondnum)));
							result = firstnum - secondnum;
							answer = String.format("%.2f", result);
							usertext.setText(answer);
						
					}
						else if(operations== "*") {
							textField.setText((re = String.format("%.2f", firstnum))+" * " +(re = String.format("%.2f", secondnum)));
							result = firstnum * secondnum;
							answer = String.format("%.2f", result);
							usertext.setText(answer);
						}	
						else if(operations== "/") {
							textField.setText((re = String.format("%.2f", firstnum))+" / " +(re = String.format("%.2f", secondnum)));
							result = firstnum / secondnum;
							answer = String.format("%.2f", result);
							usertext.setText(answer);
						}
					
				}
				firstnum = Double.parseDouble(usertext.getText()) ;
				usertext.setText("");
				textField.setText((re = String.format("%.2f", firstnum))+" *");
				operations = "*";
						
			}
		});
		btnmult.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmult.setBounds(184, 167, 50, 47);
		frmCalculator.getContentPane().add(btnmult);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().endsWith("+")||textField.getText().endsWith("-")||textField.getText().endsWith("*")||textField.getText().endsWith("/")) {
					String answer;
					secondnum=Double.parseDouble(usertext.getText());
					
					if (operations== "+") {
						textField.setText((re = String.format("%.2f", firstnum))+" + " +(re = String.format("%.2f", secondnum)));
						result = firstnum + secondnum;
						answer = String.format("%.2f", result);
						usertext.setText(answer);
					}
						else if(operations== "-") {
							textField.setText((re = String.format("%.2f", firstnum))+" - " +(re = String.format("%.2f", secondnum)));
							result = firstnum - secondnum;
							answer = String.format("%.2f", result);
							usertext.setText(answer);
						
					}
						else if(operations== "*") {
							textField.setText((re = String.format("%.2f", firstnum))+" * " +(re = String.format("%.2f", secondnum)));
							result = firstnum * secondnum;
							answer = String.format("%.2f", result);
							usertext.setText(answer);
						}	
						else if(operations== "/") {
							textField.setText((re = String.format("%.2f", firstnum))+" / " +(re = String.format("%.2f", secondnum)));
							result = firstnum / secondnum;
							answer = String.format("%.2f", result);
							usertext.setText(answer);
						}
					
				}
				firstnum = Double.parseDouble(usertext.getText()) ;
				usertext.setText("");
				textField.setText((re = String.format("%.2f", firstnum))+" /");
				operations = "/";
						
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndiv.setBounds(184, 213, 50, 94);
		frmCalculator.getContentPane().add(btndiv);
		
		
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum=Double.parseDouble(usertext.getText());
				
				if (operations== "+") {
					textField.setText((re = String.format("%.2f", firstnum))+" + " +(re = String.format("%.2f", secondnum)));
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					usertext.setText(answer);
				}
					else if(operations== "-") {
						textField.setText((re = String.format("%.2f", firstnum))+" - " +(re = String.format("%.2f", secondnum)));
						result = firstnum - secondnum;
						answer = String.format("%.2f", result);
						usertext.setText(answer);
					
				}
					else if(operations== "*") {
						textField.setText((re = String.format("%.2f", firstnum))+" * " +(re = String.format("%.2f", secondnum)));
						result = firstnum * secondnum;
						answer = String.format("%.2f", result);
						usertext.setText(answer);
					}	
					else if(operations== "/") {
						textField.setText((re = String.format("%.2f", firstnum))+" / " +(re = String.format("%.2f", secondnum)));
						result = firstnum / secondnum;
						answer = String.format("%.2f", result);
						usertext.setText(answer);
					}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEqual.setBounds(123, 307, 111, 47);
		frmCalculator.getContentPane().add(btnEqual);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=0;
				secondnum=0;
				usertext.setText(null);
				textField.setText(null);
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCe.setBounds(61, 118, 59, 47);
		frmCalculator.getContentPane().add(btnCe);
		
		
		
	}
}
