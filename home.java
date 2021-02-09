package test2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class home extends JFrame {

	private JPanel contentPane;
	private JTextField nametext;
	static JFrame frame = new JFrame();
	private JPasswordField passwordtext;
	
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
		setTitle("\u842C\u80FD\u5DE5\u5177");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton LoginButton_1 = new JButton("\u767B\u5165");
		LoginButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = nametext.getText();
				
				String pw = passwordtext.getText();
				
				if(name.equals("admin") && pw.equals("1234")) {
					JOptionPane.showMessageDialog(null, "登入成功！");
					setVisible(false);
					index indexwindow= new index();
					indexwindow.setVisible(true);	
				}
				else {
					JOptionPane.showMessageDialog(null, "帳號或密碼錯誤！");
					nametext.setText("");
					passwordtext.setText("");
				}
				
			}
		});
		
		LoginButton_1.setBounds(174, 154, 87, 44);
		contentPane.add(LoginButton_1);
		
		JLabel lblNewLabel = new JLabel("\u8ACB\u8F38\u5165\u5E33\u865F:");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel.setBounds(39, 28, 112, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8ACB\u8F38\u5165\u5BC6\u78BC:");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(39, 85, 112, 23);
		contentPane.add(lblNewLabel_1);
		
		nametext = new JTextField();
		nametext.setBounds(161, 28, 120, 23);
		contentPane.add(nametext);
		nametext.setColumns(10);
		
		passwordtext = new JPasswordField();
		passwordtext.setBounds(161, 85, 120, 23);
		contentPane.add(passwordtext);

	}
	
}
