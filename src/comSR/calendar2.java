package comSR;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JCalendar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calendar2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JCalendar calendar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calendar2 frame = new calendar2();
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
	public calendar2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1228, 727);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 calendar = new JCalendar();
		 calendar.getDayChooser().getDayPanel().addMouseMotionListener(new MouseMotionAdapter() {
		 	@Override
		 	public void mouseMoved(MouseEvent e) {
		 		
		 	}
		 });
		calendar.setBounds(5, 5, 1202, 448);
		contentPane.add(calendar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 485, 1192, 193);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		table.setRowSelectionAllowed(true);
	
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Matter"
			}
		));
		table.getColumnModel().getColumn(0).setMaxWidth(101);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
							"Date", "Matter"
						}
					));
				table.getColumnModel().getColumn(0).setMaxWidth(101);
				initialize();
				
			}
		});
		btnNewButton.setBounds(15, 453, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.removeRow(table.getSelectedRow());
			}
		});
		btnDelete.setBounds(109, 453, 89, 23);
		contentPane.add(btnDelete);
		initialize();
	}
	public void initialize() {
		Date a = calendar.getDate();
		SimpleDateFormat sdf = new SimpleDateFormat("MM");
	//	SimpleDateFormat sd = new SimpleDateFormat("yyyy");
//		SimpleDateFormat s = new SimpleDateFormat("MM/yyyy");
		String evaluate=sdf.format(a);
		int[] daysinm = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println(daysinm.length);
		if(evaluate.equals("01")) {
			process(daysinm[0],1);	
	}else if(evaluate.equals("02")) {
		process(daysinm[1],2);

	}else if(evaluate.equals("03")) {
		process(daysinm[2],3);

	}else if(evaluate.equals("04")) {
		process(daysinm[3],4);

	}else if(evaluate.equals("05")) {
		process(daysinm[4],5);

	}else if(evaluate.equals("06")) {
		process(daysinm[5],6);

	}else if(evaluate.equals("07")) {
		process(daysinm[6],7);

	}else if(evaluate.equals("08")) {
		process(daysinm[7],8);

	}else if(evaluate.equals("09")) {
		process(daysinm[8],9);

	}else if(evaluate.equals("10")) {
		process(daysinm[9],10);

	}else if(evaluate.equals("11")) {
		process(daysinm[10],11);

	}else if(evaluate.equals("12")) {
		process(daysinm[11],12);

	}
		
}
	public void process(int w,int m) {
		Date a = calendar.getDate();
//		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		SimpleDateFormat sd = new SimpleDateFormat("yyyy");
		SimpleDateFormat s = new SimpleDateFormat("MM/yyyy");
		//String evaluate=sdf.format(a);
		//int[] daysinm = {31,28,31,30,31,30,31,31,30,31,30,31};
		int i=0;
		while(i!=w) {
			i++;
			try {
			BufferedReader br = null;
			FileReader fr = null;
			if(m<10) {
			if(i<10 ) {
			
				fr=new FileReader("D:\\E Manager\\Reminders\\0"+i+" 0"+m+" "+sd.format(a)+".txt");
			
			}
			else {
				fr=new FileReader("D:\\E Manager\\Reminders\\"+i+" 0"+m+" "+sd.format(a)+".txt");	
			}}else {
				if(i<10 ) {
					
					fr=new FileReader("D:\\E Manager\\Reminders\\0"+i+" "+m+" "+sd.format(a)+".txt");
				
				}
				else {
					fr=new FileReader("D:\\E Manager\\Reminders\\"+i+" "+m+" "+sd.format(a)+".txt");	
				}	
			}
			br=new BufferedReader(fr);
			String r;
			
				while((r=br.readLine()) !=null) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.addRow(new Object[] {
						Integer.toString(i)+"/"+s.format(a),r	
					});
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Process Completed",
									 "jj", JOptionPane.OK_OPTION, null);
							
						}
					}

				}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
