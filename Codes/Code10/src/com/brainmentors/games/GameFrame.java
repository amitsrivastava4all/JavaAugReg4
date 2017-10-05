package com.brainmentors.games;

import java.awt.Toolkit;

import javax.swing.JFrame;

import com.brainmentors.games.utils.GameConstants;

public class GameFrame extends JFrame implements GameConstants {
	
	public GameFrame(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		
		setLocationRelativeTo(null);
		
		setTitle(GAME_TITLE);
		setResizable(false);
		//setLocation(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Board board = new Board();
		add(board);
		setVisible(true);
		Toolkit.getDefaultToolkit().sync();
	}

	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		

	}

}
