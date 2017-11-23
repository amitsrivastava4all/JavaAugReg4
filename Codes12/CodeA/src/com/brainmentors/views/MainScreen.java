package com.brainmentors.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public MainScreen(String userid) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAdmin = new JMenu("User");
		menuBar.add(mnAdmin);
		
		JMenuItem mntmAddQuestion = new JMenuItem("Add Question");
		mnAdmin.add(mntmAddQuestion);
		
		JMenuItem mntmShowQuestion = new JMenuItem("Show Question");
		mnAdmin.add(mntmShowQuestion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnAdmin.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcome = new JLabel("Welcome "+userid);
		welcome.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setBounds(39, 50, 405, 126);
		contentPane.add(welcome);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
