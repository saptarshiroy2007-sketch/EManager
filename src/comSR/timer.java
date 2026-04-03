package comSR;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class timer extends JFrame {
    private static timer frame = new timer();
	private JPanel contentPane;
	private JTextField textSecs;
	private JTextField textMins;
	private JTextField textHrs;
    private boolean flag=true;
    private boolean counterflag=true;
    private JButton btnStart;
    private JButton btnStop;
    Timer timer = new Timer(); 
    TimerTask task = new Helper(); 
      
   // timer.schedule(task,0, 700); 
	/**
	 * Launch the application.
	 */
    public int i = 0;
   	class Helper extends TimerTask 
   	{ 
   	    
   	    public void run() 
   	    { 
   	    	try { 
   	    		if(counterflag) {
   	    			
   	    		}else {
   	    			int hr=Integer.parseInt(textHrs.getText());	
   	    			int min=Integer.parseInt(textMins.getText());
   	    			int sec=Integer.parseInt(textSecs.getText());
   	    			
   	    				
   	    			while(true) {
   	    				//btnStop.setVisible(true);	
   	    				//btnStart.setVisible(false);
   	    				if(sec==0 && min>=1) {
   	    					min-=1;
   	    					sec+=59;
   	    				}else if(sec==0 && min==0 && hr>0) {
   	    					hr-=1;
   	    					min+=59;
   	    					sec+=59;
   	    				}else if(sec==0) {
   	    				timer g = new timer();
   	    				g.setVisible(true);
   	    				frame.setVisible(false);
   	    				btnStop.setVisible(false);	
   	   	    		    btnStart.setVisible(true);
   	    				timer.cancel();
   	    					break;
   	    				}
   	    				sec-=1;
   	    				
   	    				textHrs.setText(String.valueOf(hr));
   	    				textMins.setText(String.valueOf(min));
   	    				textSecs.setText(String.valueOf(sec));
   	    				try {
   	    					Thread.sleep(1000);
   	    				} catch (InterruptedException e) {
   	    					e.printStackTrace();
   	    				}
   	    				//btnStop.setVisible(false);	
   	    				//btnStart.setVisible(true);
   	    				flag=false;
   	    				Start();
   	    				}
   	    		
   	    			}
   	    		}catch (Exception e1) {
 			       e1.printStackTrace();
   		     }
   	    	} 
   	    }


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
	public timer() {
		 timer.schedule(task,0, 700); 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 613, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				flag=false;
//				Start();
//				counterflag=false;
				int hr=Integer.parseInt(textHrs.getText());	
	    			int min=Integer.parseInt(textMins.getText());
	    			int sec=Integer.parseInt(textSecs.getText());
	    			
	    				
	    			while(true) {
	    				//btnStop.setVisible(true);	
	    				//btnStart.setVisible(false);
	    				if(sec==0 && min>=1) {
	    					min-=1;
	    					sec+=59;
	    				}else if(sec==0 && min==0 && hr>0) {
	    					hr-=1;
	    					min+=59;
	    					sec+=59;
	    				}else if(sec==0) {
//	    				timer g = new timer();
//	    				g.setVisible(true);
	    				//frame.setVisible(false);
	    				btnStop.setVisible(false);	
	   	    		    btnStart.setVisible(true);
	   	    		 Desktop d =Desktop.getDesktop();
	 				try {
	 					d.browse(new URI("file:///D:/E Manager/Photos/buzz.mp3"));
	 					
	 				} catch (IOException e1) {
	 					// TODO Auto-generated catch block
	 					e1.printStackTrace();
	 				} catch (URISyntaxException e1) {
	 					// TODO Auto-generated catch block
	 					e1.printStackTrace();
	 				}
	    				timer.cancel();
	    					break;
	    				}
	    				sec-=1;
	    				
	    				textHrs.setText(String.valueOf(hr));
	    				textMins.setText(String.valueOf(min));
	    				textSecs.setText(String.valueOf(sec));
	    				try {
	    					Thread.sleep(1000);
	    				} catch (InterruptedException e1) {
	    					e1.printStackTrace();
	    				}
	    				//btnStop.setVisible(false);	
	    				//btnStart.setVisible(true);
	    				flag=false;
	    				Start();
	    				Desktop d =Desktop.getDesktop();
		 				try {
		 					d.browse(new URI("file:///D://E Manager//Photos//buzz.mp3"));
		 					
		 				} catch (IOException e1) {
		 					// TODO Auto-generated catch block
		 					e1.printStackTrace();
		 				} catch (URISyntaxException e1) {
		 					// TODO Auto-generated catch block
		 					e1.printStackTrace();
		 				}
	    				}
			}
		});
		btnStart.setBounds(10, 11, 233, 52);
		contentPane.add(btnStart);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textHrs.setText("0");
				textMins.setText("0");
				textSecs.setText("0");	
			}
		});
		btnReset.setBounds(354, 238, 233, 52);
		contentPane.add(btnReset);
		
		textSecs = new JTextField();
		textSecs.setFont(new Font("Tahoma", Font.BOLD, 25));
		textSecs.setText("0");
		textSecs.setHorizontalAlignment(SwingConstants.CENTER);
		textSecs.setBackground(Color.WHITE);
		textSecs.setEditable(false);
		textSecs.setBounds(420, 103, 152, 52);
		contentPane.add(textSecs);
		textSecs.setColumns(10);
		
		textMins = new JTextField();
		textMins.setText("0");
		textMins.setFont(new Font("Tahoma", Font.BOLD, 25));
		textMins.setHorizontalAlignment(SwingConstants.CENTER);
		textMins.setBackground(Color.WHITE);
		textMins.setEditable(false);
		textMins.setColumns(10);
		textMins.setBounds(224, 103, 152, 52);
		contentPane.add(textMins);
		
		textHrs = new JTextField();
		textHrs.setFont(new Font("Tahoma", Font.BOLD, 25));
		textHrs.setText("0");
		textHrs.setHorizontalAlignment(SwingConstants.CENTER);
		textHrs.setBackground(Color.WHITE);
		textHrs.setEditable(false);
		textHrs.setColumns(10);
		textHrs.setBounds(28, 103, 152, 52);
		contentPane.add(textHrs);
		
		JButton btndownhrs = new JButton("Down");
		btndownhrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				down("hr");
			}
		});
		btndownhrs.setBounds(64, 166, 89, 23);
		contentPane.add(btndownhrs);
		
		JButton btnuphrs = new JButton("Up");
		btnuphrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				up("hr");
			}
		});
		btnuphrs.setBounds(64, 71, 89, 23);
		contentPane.add(btnuphrs);
		
		JButton btnupmins = new JButton("Up");
		btnupmins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				up("min");
			}
		});
		btnupmins.setBounds(255, 69, 89, 23);
		contentPane.add(btnupmins);
		
		JButton btndownmins = new JButton("Down");
		btndownmins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				down("min");
			}
		});
		btndownmins.setBounds(255, 166, 89, 23);
		contentPane.add(btndownmins);
		
		JButton btndownsecs = new JButton("Down");
		btndownsecs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				down("sec");
			}
		});
		btndownsecs.setBounds(451, 166, 89, 23);
		contentPane.add(btndownsecs);
		
		JButton btnupsecs = new JButton("Up");
		btnupsecs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				up("sec");
			}
		});
		btnupsecs.setBounds(451, 71, 89, 23);
		contentPane.add(btnupsecs);
		
		JLabel lblNewLabel = new JLabel(":");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(185, 103, 32, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(381, 103, 32, 52);
		contentPane.add(lblNewLabel_1);
		
		btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=true;
				Start();
			}
		});
		btnStop.setVisible(false);
		btnStop.setBounds(10, 238, 233, 52);
		contentPane.add(btnStop);
		Timer timer = new Timer(); 
        TimerTask task = new Helper(); 
          
        timer.schedule(task,0, 700); 
	}
	public void Start() {
		if(flag) {
			btnStop.setVisible(false);	
			btnStart.setVisible(true);
		}else{
		btnStop.setVisible(true);	
		btnStart.setVisible(false);
		}
	}
	public void up(String a) {
		int b;
		if(a.equals("hr")) {
			b=Integer.parseInt(textHrs.getText());
			if(b==24) {
				
			}else {
				b+=1;
				textHrs.setText(String.valueOf(b));
			}
		}else if(a.equals("min")) {
			b=Integer.parseInt(textMins.getText());
            if(b==59) {
				
			}else {
				b+=1;
				textMins.setText(String.valueOf(b));
			}
		}else if(a.equals("sec")) {
			b=Integer.parseInt(textSecs.getText());
              if(b==59) {
				
			}else {
				b+=1;
				textSecs.setText(String.valueOf(b));
			}
		}
	}
	public void down(String a) {
		int b;
		if(a.equals("hr")) {
			b=Integer.parseInt(textHrs.getText());
			if(b==00) {
				
			}else {
				b-=1;
				textHrs.setText(String.valueOf(b));
			}
		}else if(a.equals("min")) {
			b=Integer.parseInt(textMins.getText());
            if(b==00) {
				
			}else {
				b-=1;
				textMins.setText(String.valueOf(b));
			}
		}else if(a.equals("sec")) {
			b=Integer.parseInt(textSecs.getText());
              if(b==00) {
				
			}else {
				b-=1;
				textSecs.setText(String.valueOf(b));
			}
		}
	}
	public void timer() {
	int hr=Integer.parseInt(textHrs.getText());	
	int min=Integer.parseInt(textMins.getText());
	int sec=Integer.parseInt(textSecs.getText());
	
		
	while(true) {
		btnStop.setVisible(true);	
		btnStart.setVisible(false);
		if(sec==0 && min>=1) {
			sec+=59;
		}else if(sec==0 && min==0 && hr>0) {
			min+=59;
			sec+=59;
		}else if(sec==0) {
			break;
		}
		sec-=1;
		textHrs.setText(String.valueOf(hr));
		textMins.setText(String.valueOf(min));
		textSecs.setText(String.valueOf(sec));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		btnStop.setVisible(false);	
		btnStart.setVisible(true);
		}
	}
	}

