package test2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\pastr\\eclipse-workspace\\test2\\src\\img\\icon1.JPG"));
		setTitle("\u842C\u80FD\u5DE5\u5177");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BMIButton = new JButton("\u8A08\u7B97BMI");
		BMIButton.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		BMIButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				BMI bmiwindow= new BMI();
				bmiwindow.setVisible(true);	
			}
		});
		BMIButton.setBounds(10, 21, 120, 120);
		contentPane.add(BMIButton);
		
		JButton shutdownButton = new JButton("\u5B9A\u6642\u95DC\u6A5F");
		shutdownButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				autoshutdown autoshutdownwindow= new autoshutdown();
				autoshutdownwindow.setVisible(true);	
			}
		});
		shutdownButton.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		shutdownButton.setBounds(10, 216, 120, 120);
		contentPane.add(shutdownButton);
		
		JButton selectnumButton = new JButton("\u62BD\u734E\u5668");
		selectnumButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				lottery indexwindow = new lottery();
				indexwindow.setVisible(true);
			}
		});
		selectnumButton.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		selectnumButton.setBounds(157, 21, 120, 120);
		contentPane.add(selectnumButton);
		
		JButton toolsButton = new JButton("DirectX");
		toolsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dxdiag = "dxdiag" ;
				Runtime runtime = Runtime.getRuntime(); 
				try {
					 runtime.exec(dxdiag);
				}catch (IOException e) {
		             e.printStackTrace();
		         }
			}
		});
		toolsButton.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		toolsButton.setBounds(305, 21, 120, 120);
		contentPane.add(toolsButton);
		
		JButton guessgameButton = new JButton("\u731C\u6578\u5B57");
		guessgameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				guessnumbergame indexwindow = new guessnumbergame();
				indexwindow.setVisible(true);
			}
		});
		guessgameButton.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		guessgameButton.setBounds(157, 216, 120, 120);
		contentPane.add(guessgameButton);
		
		JButton ipButton = new JButton("\u5C0F\u756B\u5BB6");
		ipButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String paint = "mspaint" ;
				Runtime runtime = Runtime.getRuntime(); 
				try {
					 runtime.exec(paint);
				}catch (IOException e) {
		             e.printStackTrace();
		         }
			}
		});
		ipButton.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		ipButton.setBounds(305, 216, 120, 120);
		contentPane.add(ipButton);
	}
}
