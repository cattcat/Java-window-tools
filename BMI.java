package test2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI frame = new BMI();
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
	public BMI() {
		setTitle("BMI\u8A08\u7B97\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8EAB\u9AD8:");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		lblNewLabel.setBounds(64, 47, 100, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u9AD4\u91CD:");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(64, 98, 100, 25);
		contentPane.add(lblNewLabel_1);
		
		text1 = new JTextField();
		text1.setBounds(138, 47, 100, 25);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setColumns(10);
		text2.setBounds(138, 98, 100, 25);
		contentPane.add(text2);
		
		JLabel lblNewLabel_2 = new JLabel("BMI\u70BA:");
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(57, 159, 71, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel bmitotal = new JLabel("");
		bmitotal.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		bmitotal.setBounds(138, 159, 77, 33);
		contentPane.add(bmitotal);
		
		JButton backButton = new JButton("\u56DE\u4E3B\u9078\u55AE");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				index indexwindow = new index();
				indexwindow.setVisible(true);
			}
		});
		backButton.setBounds(262, 225, 87, 23);
		contentPane.add(backButton);
		
		JButton btnNewButton = new JButton("\u8A08\u7B97");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double h = Integer.parseInt(text1.getText());
				double w = Integer.parseInt(text2.getText());
				double BMI = w / Math.pow(h/100,2);
				
				bmitotal.setText(""+Math.floor(BMI*10.0)/10.0);
			}
		});
		btnNewButton.setBounds(140, 202, 87, 23);
		contentPane.add(btnNewButton);
	}
 
}
