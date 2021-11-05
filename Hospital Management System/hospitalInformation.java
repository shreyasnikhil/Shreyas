import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class hospitalInformation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hospitalInformation frame = new hospitalInformation();
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
	public hospitalInformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HOME\\Desktop\\HMS ICON\\HospitalInformation.jpeg"));
		lblNewLabel.setBounds(162, 49, 446, 223);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrAHospitalManageent = new JTextArea();
		txtrAHospitalManageent.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtrAHospitalManageent.setText("A hospital manageent system is an element of health informatics that focuses mainly on the\n administrational needs of hospitals. These systems enhance the ability of health care\r\nprofessionals to coordinate care by providing a patient's health information and visit history\n at the place and time that is needed. ");
		txtrAHospitalManageent.setBackground(Color.MAGENTA);
		txtrAHospitalManageent.setBounds(10, 322, 777, 154);
		contentPane.add(txtrAHospitalManageent);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HOME\\Desktop\\HMS ICON\\add new patient background.jpg"));
		lblNewLabel_1.setBounds(10, 10, 777, 306);
		contentPane.add(lblNewLabel_1);
	}
}
