package test2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTree;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.List;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.util.Random;
public class lottery extends JFrame {

	private JPanel contentPane;
	private JTextField numbertext1;
	private JTextField numbertext2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lottery frame = new lottery();
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
	public lottery() {
		setTitle("\u62BD\u865F\u78BC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 401);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textArea.setBounds(10, 258, 414, 94);
		textArea.setEditable(false);
		contentPane.add(textArea);
		
		numbertext1 = new JTextField();
		numbertext1.setBounds(161, 55, 100, 20);
		contentPane.add(numbertext1);
		numbertext1.setColumns(10);
		
		numbertext2 = new JTextField();
		numbertext2.setBounds(161, 106, 100, 20);
		contentPane.add(numbertext2);
		numbertext2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u8D77\u59CB\u6578\u5B57:");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel.setBounds(51, 55, 100, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u7D50\u5C3E\u6578\u5B57:");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(51, 106, 100, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel selectLabel = new JLabel("");
		selectLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 48));
		selectLabel.setBounds(161, 136, 87, 56);
		contentPane.add(selectLabel);
		
		JButton btnNewButton = new JButton("\u62BD\u734E");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(numbertext1.getText());
				int b = Integer.parseInt(numbertext2.getText());
				int r = 0;
				Random ran = new Random();
				r = ran.nextInt(b-a)+1;
				String str = String.valueOf(r);
				selectLabel.setText(str);
				textArea.append(str+",");
			}
		});
		btnNewButton.setBounds(302, 72, 100, 40);
		contentPane.add(btnNewButton);
		
		JButton backButton = new JButton("\u56DE\u4E3B\u9078\u55AE");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				index indexwindow = new index();
				indexwindow.setVisible(true);
			}
		});
		backButton.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		backButton.setBounds(319, 216, 87, 23);
		contentPane.add(backButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u62BD\u4E2D\u7684\u6578\u5B57:");
		lblNewLabel_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(51, 152, 100, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JButton clearButton = new JButton("\u6E05\u9664\u7D00\u9304");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		clearButton.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		clearButton.setBounds(225, 216, 87, 23);
		contentPane.add(clearButton);
		
		
	}
}
