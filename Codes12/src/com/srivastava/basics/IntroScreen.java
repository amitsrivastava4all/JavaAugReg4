package com.srivastava.basics;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class IntroScreen extends JWindow {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroScreen frame = new IntroScreen();
					frame.setVisible(true);
					frame.animation();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IntroScreen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IntroScreen.class.getResource("/com/srivastava/basics/login.png")));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setIconImage(image);
		setBounds(100, 100, 493, 396);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel introImg = new JLabel("");
		introImg.setIcon(new ImageIcon(IntroScreen.class.getResource("/com/srivastava/basics/giphy.gif")));
		introImg.setBounds(6, 6, 481, 239);
		contentPane.add(introImg);
		
		
		progressBar.setBounds(6, 271, 481, 31);
		contentPane.add(progressBar);
		
		
		lblGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblGame.setFont(new Font("Lucida Grande", Font.BOLD, 32));
		lblGame.setBounds(125, 314, 325, 32);
		contentPane.add(lblGame);
		setLocationRelativeTo(null);
	}
	JLabel lblGame = new JLabel("GAME-2017");
	private int progress;
	private Timer timer;
	private boolean isVisible;
	JProgressBar progressBar = new JProgressBar();
	private void animation(){
		
		timer = new Timer(50,(e)->{
			if(progress>=100){
				timer.stop();
				IntroScreen.this.setVisible(false);
				IntroScreen.this.dispose();
				Login login = new Login();
				login.setVisible(true);
				
			}
			lblGame.setVisible(isVisible);
			isVisible = !isVisible;
			progress++;
			progressBar.setValue(progress);
		});
		timer.start();
	}
}
