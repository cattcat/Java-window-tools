package test2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class autoshutdown extends JFrame {

	private JPanel contentPane;
	private JTextField timetext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					autoshutdown frame = new autoshutdown();
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
	public autoshutdown() {
		setTitle("\u5B9A\u6642\u95DC\u6A5F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		timetext = new JTextField();
		timetext.setBounds(168, 52, 96, 21);
		contentPane.add(timetext);
		timetext.setColumns(10);
		
		JButton btnNewButton = new JButton("\u9810\u7D04\u95DC\u6A5F");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int minute = Integer.parseInt(timetext.getText())*60;
				Runtime runtime = Runtime.getRuntime();
				String shutdown = "shutdown -s -t " + minute;
				try {
					 runtime.exec(shutdown);
					 JOptionPane.showMessageDialog(null, "預約成功！");
				}catch (IOException e) {
		             e.printStackTrace();
		         }
				
			}
		});
		btnNewButton.setBounds(168, 132, 100, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u8ACB\u8F38\u5165\u5E7E\u5206\u9418\u5F8C\u95DC\u6A5F:");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel.setBounds(22, 53, 136, 20);
		contentPane.add(lblNewLabel);
		
		JButton backButton = new JButton("\u56DE\u4E3B\u9078\u55AE");
		backButton.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				index indexwindow = new index();
				indexwindow.setVisible(true);
			}
		});
		backButton.setBounds(311, 220, 87, 23);
		contentPane.add(backButton);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88\u9810\u7D04");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String shutdowncancel = "shutdown -a " ;
				Runtime runtime = Runtime.getRuntime(); 
				try {
					 runtime.exec(shutdowncancel);
					 JOptionPane.showMessageDialog(null, "取消成功！");
				}catch (IOException e) {
		             e.printStackTrace();
		         }
				
			}
		});
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btnNewButton_1.setBounds(168, 192, 100, 50);
		contentPane.add(btnNewButton_1);
	}
}
