package com.brainmentors.games;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.brainmentors.games.utils.GameConstants;

public class GameFrame extends JFrame implements GameConstants {
	
	public GameFrame(int noOfBalls){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		
		setLocationRelativeTo(null);
		
		setTitle(GAME_TITLE);
		setResizable(false);
		//setLocation(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Board board = new Board(noOfBalls);
		add(board);
		setVisible(true);
		Toolkit.getDefaultToolkit().sync();
	}
	
	private static int askForBalls(){
		return Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of Balls to Draw..."));
	}

	public static void main(String[] args) {
		GameFrame frame = new GameFrame(askForBalls());
		

	}

}
