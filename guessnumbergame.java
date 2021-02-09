package test2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Button;

public class guessnumbergame extends JFrame {

	private JPanel contentPane;
	private JTextField numbertext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guessnumbergame frame = new guessnumbergame();
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
	public guessnumbergame() {
		setTitle("\u6BD4\u5927\u5C0F\u904A\u6232");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 402);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8ACB\u8F38\u51651~20\u7684\u6578\u5B57:");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel.setBounds(57, 64, 169, 20);
		contentPane.add(lblNewLabel);
		
		numbertext = new JTextField();
		numbertext.setColumns(10);
		numbertext.setBounds(219, 64, 100, 20);
		contentPane.add(numbertext);
		
		JLabel lblNewLabel_1 = new JLabel("\u8ACB\u9078\u64C7\u8CED\u6CE8\u91D1\u984D:");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(57, 90, 139, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel playernumLabel = new JLabel("");
		playernumLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		playernumLabel.setBounds(57, 225, 169, 20);
		contentPane.add(playernumLabel);
		
		JLabel pcnumLabel = new JLabel("");
		pcnumLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		pcnumLabel.setBounds(57, 255, 169, 20);
		contentPane.add(pcnumLabel);
		
		JLabel endgameLabel = new JLabel("");
		endgameLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		endgameLabel.setBounds(57, 312, 367, 20);
		contentPane.add(endgameLabel);
		
		JLabel moneyLabel = new JLabel("");
		moneyLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		moneyLabel.setBounds(57, 282, 169, 20);
		contentPane.add(moneyLabel);
		
		Panel panel = new Panel();
		panel.setBackground(SystemColor.control);
		panel.setBounds(219, 90, 89, 88);
		contentPane.add(panel);
		
		JRadioButton RadioButton_100 = new JRadioButton("100",true);
		panel.add(RadioButton_100);
		
		JRadioButton RadioButton_500 = new JRadioButton("500");
		panel.add(RadioButton_500);
		
		JRadioButton RadioButton_1000 = new JRadioButton("1000");
		panel.add(RadioButton_1000);
		
		ButtonGroup g = new ButtonGroup();
		g.add(RadioButton_1000);
		g.add(RadioButton_500);
		g.add(RadioButton_100);
		
		JButton btnNewButton = new JButton("\u958B\u59CB\u904A\u6232");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = Integer.parseInt(numbertext.getText());
				int r ;
				if(n >= 21 || n <= 0  ) {
					JOptionPane.showMessageDialog(null, "數字超過範圍！");
					numbertext.setText("");
					return;
				}
				String str = null ;
				if(RadioButton_100.isSelected()) {
					str = "100" ;
				}else if(RadioButton_500.isSelected()){
					str = "500" ;
				}else if(RadioButton_1000.isSelected()) {
					str = "1000" ;
				}
				
				Random ran = new Random();
				r = ran.nextInt(20)+1;
				if(r > n) {
					endgameLabel.setText("電腦數字比你大,你輸了"+str+"元");
				}else {
					endgameLabel.setText("電腦數字比你小,你贏了"+str+"元");
				}
				playernumLabel.setText("你的數字為:"+n);
				pcnumLabel.setText("電腦的數字為:"+r);
				moneyLabel.setText("賭注金額為:"+ str +"元");
				
			}
		});
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		btnNewButton.setBounds(219, 184, 100, 40);
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
		backButton.setBounds(333, 328, 87, 23);
		contentPane.add(backButton);
		
		
		
		
		
	}
}
