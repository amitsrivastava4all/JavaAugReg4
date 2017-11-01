package com.srivastava.basics;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userTxt;
	private JPasswordField pwdtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginForm = new JLabel("Login Form");
		lblLoginForm.setForeground(Color.RED);
		lblLoginForm.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblLoginForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginForm.setBounds(129, 6, 190, 55);
		contentPane.add(lblLoginForm);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setBounds(22, 93, 61, 16);
		contentPane.add(lblUserid);
		
		userTxt = new JTextField();
		userTxt.setBounds(95, 88, 242, 26);
		contentPane.add(userTxt);
		userTxt.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(22, 149, 61, 16);
		contentPane.add(lblPassword);
		
		pwdtxt = new JPasswordField();
		pwdtxt.setBounds(95, 144, 242, 26);
		contentPane.add(pwdtxt);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setMnemonic('L');
		btnLogin.setIcon(new ImageIcon(Login.class.getResource("/com/srivastava/basics/login.png")));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			checkLogin();
			}
		});
		btnLogin.setBounds(32, 207, 127, 65);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(171, 207, 117, 29);
		contentPane.add(btnReset);
		setLocationRelativeTo(null);
	}
	
	private void checkLogin(){
		String userid = userTxt.getText();
		String password = new String(pwdtxt.getPassword());
		if(userid.equals(password)){
			this.setVisible(false);
			MainScreen mainScreen = new MainScreen();
			mainScreen.setExtendedState(JFrame.MAXIMIZED_BOTH);
			mainScreen.setVisible(true);
			//TicTacToeGame game = new TicTacToeGame();
			//game.setVisible(true);
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Invalid Userid or password");
		}
	}
}
