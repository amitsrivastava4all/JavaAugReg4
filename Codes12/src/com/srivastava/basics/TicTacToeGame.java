package com.srivastava.basics;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TicTacToeGame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeGame frame = new TicTacToeGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void askToClose(){
		int choice = JOptionPane.showConfirmDialog(this, "Do u want to exit this game","TicTac",JOptionPane.YES_NO_OPTION);
		if(choice == JOptionPane.YES_OPTION){
			this.setVisible(false);
			this.dispose();
		}
		else
		{
			return ;
		}
	}

	/**
	 * Create the frame.
	 */
	public TicTacToeGame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askToClose();
			}
		});
		setResizable(false);
		setTitle("TicTacToe-Game");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton one = new JButton("");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(one);
				//one.setText("X");
				//JOptionPane.showMessageDialog(TicTacToeGame.this, "U click on first button");
			}
		});
		one.setToolTipText("Click on this button");
		one.setBounds(36, 28, 117, 29);
		contentPane.add(one);
		
		JButton two = new JButton("");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(two);
			}
		});
		two.setToolTipText("Click on this button");
		two.setBounds(165, 28, 117, 29);
		contentPane.add(two);
		
		JButton three = new JButton("");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(three);
			}
		});
		three.setToolTipText("Click on this button");
		three.setBounds(310, 28, 117, 29);
		contentPane.add(three);
	}
	private boolean isXorZero ;
	private void printXorZero(JButton currentButton){
		if(currentButton.getText().trim().length()==0){
		if(isXorZero){
			currentButton.setText("0");
		}
		else{
			currentButton.setText("X");
		}
		
		isXorZero = !isXorZero;
		}
	}
}
