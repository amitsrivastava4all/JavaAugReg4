package com.brainmentors.games;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements GameConstants {

	public GameFrame(){
		Board board  = new Board();
		setSize(GAME_WIDTH,GAME_HEIGHT);
		
		setTitle(TITLE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		add(board);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame obj = new GameFrame();

	}

}
