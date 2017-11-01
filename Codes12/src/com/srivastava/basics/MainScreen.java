package com.srivastava.basics;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmDaveGame = new JMenuItem("Dave Game");
		mnFile.add(mntmDaveGame);
		mnFile.addSeparator();
		JMenuItem mntmTictactoe = new JMenuItem("TicTacToe");
		mntmTictactoe.setIcon(new ImageIcon(MainScreen.class.getResource("/com/srivastava/basics/login.png")));
		mntmTictactoe.setAccelerator(KeyStroke.getKeyStroke(
		        java.awt.event.KeyEvent.VK_T, 
		        java.awt.Event.CTRL_MASK));
		mntmTictactoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TicTacToeGame obj = new TicTacToeGame();
				obj.setVisible(true);
			}
		});
		mnFile.add(mntmTictactoe);
		
		//menuBar.setBounds(6, 0, 132, 22);
		//contentPane.add(menuBar);
	}
}
