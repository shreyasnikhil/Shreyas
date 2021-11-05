import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ItemEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addDiagnosisInformation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public int flag=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addDiagnosisInformation frame = new addDiagnosisInformation();
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
	public addDiagnosisInformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Patient ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(167, 28, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Patient Id does not exist");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(274, 67, 152, 14);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(274, 25, 135, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		table = new JTable();
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String patientID= textField.getText();
				try {
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from patient where patientID='"+patientID+"'");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception ae){
					JOptionPane.showMessageDialog(null, "Connection error");
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\HMS ICON\\search.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(464, 24, 101, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 107, 733, 49);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2 = new JLabel("Symptoms");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(23, 295, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 292, 223, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Diagnosis");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(23, 331, 69, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 328, 223, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Medicines");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(23, 367, 69, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(116, 364, 223, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Ward Required?");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(492, 295, 104, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Type Of Ward");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(492, 331, 79, 14);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setVisible(false);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"General", "Single", "Duo"}));
		comboBox.setBounds(598, 327, 101, 22);
		contentPane.add(comboBox);
		comboBox.setVisible(false);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Yes");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					lblNewLabel_6.setVisible(true);
					comboBox.setVisible(true);
				}
				else {
					lblNewLabel_6.setVisible(false);
					comboBox.setVisible(false);
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox.setBounds(602, 291, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
					String patientID=textField.getText();
					String symptom=textField_1.getText();
					String diagnosis=textField_2.getText();
					String medicines=textField_3.getText();
					String wardReq;
					String typeWard;
					if(chckbxNewCheckBox.isSelected()) {
						wardReq="YES";
						typeWard=(String)comboBox.getSelectedItem();
					}
					else {
						wardReq="NO";
						typeWard="";
					}
					try {
						Connection con=ConnectionProvider.getCon();
						Statement st=con.createStatement();
						st.executeUpdate("insert into patientreport values('"+patientID+"','"+symptom+"','"+diagnosis+"','"+medicines+"','"+wardReq+"','"+typeWard+"')");
	                    JOptionPane.showMessageDialog(null, "Successfully Updated");
	                    setVisible(false);
	                    new addDiagnosisInformation().setVisible(true);
					}
					catch(Exception ae) {
						JOptionPane.showMessageDialog(null, ae);
					}
				
				
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\HMS ICON\\save-icon--1.png"));
		btnNewButton_1.setBounds(116, 478, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\HMS ICON\\Close.png"));
		btnNewButton_2.setBounds(598, 478, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\HMS ICON\\add new patient background.jpg"));
		lblNewLabel_7.setBounds(0, -19, 776, 558);
		contentPane.add(lblNewLabel_7);
		
		
	}
	
}
