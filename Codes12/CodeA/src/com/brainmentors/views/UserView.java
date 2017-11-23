package com.brainmentors.views;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.brainmentors.dao.UserDAO;
import com.brainmentors.dto.UserDTO;

public class UserView extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField passwordField;
	private JTextField reguserid;
	private JPasswordField regpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserView frame = new UserView();
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
	public UserView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 19, 422, 290);
		contentPane.add(tabbedPane);
		
		JPanel loginPanel = new JPanel();
		tabbedPane.addTab("Login", null, loginPanel, null);
		loginPanel.setLayout(null);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblUserid.setBounds(6, 30, 116, 27);
		loginPanel.add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblPassword.setBounds(6, 81, 116, 27);
		loginPanel.add(lblPassword);
		
		userid = new JTextField();
		userid.setBounds(113, 32, 204, 26);
		loginPanel.add(userid);
		userid.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(113, 83, 204, 26);
		loginPanel.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			doLogin();
			}
		});
		btnLogin.setBounds(24, 140, 117, 29);
		loginPanel.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(145, 140, 117, 29);
		loginPanel.add(btnReset);
		
		JPanel regPanel = new JPanel();
		tabbedPane.addTab("Register", null, regPanel, null);
		regPanel.setLayout(null);
		
		reguserid = new JTextField();
		reguserid.setColumns(10);
		reguserid.setBounds(136, 31, 204, 26);
		regPanel.add(reguserid);
		
		JLabel label = new JLabel("Userid");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		label.setBounds(29, 29, 116, 27);
		regPanel.add(label);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		label_1.setBounds(29, 80, 116, 27);
		regPanel.add(label_1);
		
		regpassword = new JPasswordField();
		regpassword.setBounds(136, 82, 204, 26);
		regPanel.add(regpassword);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doRegister();
			}
		});
		btnRegister.setBounds(47, 139, 117, 29);
		regPanel.add(btnRegister);
		
		JButton button_1 = new JButton("Reset");
		button_1.setBounds(168, 139, 117, 29);
		regPanel.add(button_1);
	}

	private void doLogin(){
		String uid = userid.getText();
		String password = String.valueOf(passwordField.getPassword());
		UserDTO userDTO = new UserDTO(uid,password);
		UserDAO userDAO = UserDAO.getInstance();
		try {
			boolean isAuth =userDAO.isAuthorize(userDTO);
			
			String message = isAuth?"Login SuccessFul":"Invalid Userid or Password";
			JOptionPane.showMessageDialog(this, message);
			if(isAuth){
				MainScreen mainScreen = new MainScreen(userDTO.getUserid());
				mainScreen.setVisible(true);
				this.setVisible(false);
				this.dispose();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

private void doRegister(){
	String userid = reguserid.getText();
	String password = String.valueOf(regpassword.getPassword());
	UserDTO userDTO = new UserDTO(userid,password);
	UserDAO userDAO = UserDAO.getInstance();
	boolean isAdded= false;
	try {
		isAdded = userDAO.addNewUser(userDTO);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String message = isAdded?"Register SuccessFully:":"Not Able to Register the User";
	JOptionPane.showMessageDialog(this, message);
}

}
