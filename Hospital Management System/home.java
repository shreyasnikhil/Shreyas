import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class home extends JFrame {
	public int i=0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setSize(new Dimension(240, 60));
		setPreferredSize(new Dimension(240, 60));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1225, 778);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Add New Patient Record");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new addNewPatientRecord().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(78, 137, 231, 59);
		btnNewButton_1.setPreferredSize(new Dimension(240, 60));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\HMS ICON\\add new patient.png"));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add Diagnosis");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new addDiagnosisInformation().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(78, 222, 231, 59);
		btnNewButton_2.setPreferredSize(new Dimension(240, 60));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\HMS ICON\\add diag.png"));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Full History of the Patient");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new fullHistoryOfThePatient().setVisible(true);
			}
		});
		btnNewButton_3.setBounds(78, 318, 231, 59);
		btnNewButton_3.setPreferredSize(new Dimension(240, 60));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\HMS ICON\\rsz_history1.png"));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Uppdate Patient record");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UpdatePatientRecord().setVisible(true);
			}
		});
		btnNewButton_4.setBounds(78, 404, 231, 59);
		btnNewButton_4.setPreferredSize(new Dimension(240, 60));
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\HMS ICON\\rsz_update_details.png"));
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Hospital Information");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new hospitalInformation().setVisible(true);
			}
		});
		btnNewButton_5.setBounds(78, 490, 231, 59);
		btnNewButton_5.setPreferredSize(new Dimension(240, 60));
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\HMS ICON\\rsz_hospital_information.png"));
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Logout");
		btnNewButton_6.setBounds(78, 586, 231, 59);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to logout","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					setVisible(false);
					new login().setVisible(true);
				}
			}
		});
		btnNewButton_6.setPreferredSize(new Dimension(240, 60));
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\HMS ICON\\exit.png"));
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\HMS ICON\\home.jpg"));
		lblNewLabel.setBounds(0, 0, 1225, 778);
		contentPane.add(lblNewLabel);
	}
}
