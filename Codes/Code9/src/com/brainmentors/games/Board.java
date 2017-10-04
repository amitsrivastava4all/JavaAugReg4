package com.brainmentors.games;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.games.utils.GameConstants;
import com.brainmentors.games.utils.GameUtils;

public class Board extends JPanel implements GameConstants{//,ActionListener{
	private Timer timer;
	private GameUtils gameUtils;
	final int SPEED = 30;
	public Board(){
		gameUtils = new GameUtils(SPEED);
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setBackground(Color.CYAN);
		gameLoop();
	}
//	@Override
//	public void actionPerformed(ActionEvent e){
//		repaint();
//	}
	
	public void gameLoop(){
		
		//timer = new Timer(GAME_SPEED,this);
		timer = new Timer(GAME_SPEED,(e)->{
			repaint();
			move();
			changeDirection();
		});
		timer.start();
	}
	int x = 100;
	int speed = SPEED;
	int y = 100;
	int ySpeed = SPEED;
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.fillOval(x, y, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval((x-10), (y-10), 20, 20);
		
		//g.setColor(Color.GREEN);
		//g.fillRect(400,100,50,50);
		//g.drawOval(100,100,50,50);
		
		
	}
	
	public void move(){
		x+=speed;
		y+= ySpeed;
	}
	
	public void changeDirection(){
		if(x>=(GAME_WIDTH-50)){
			speed = -gameUtils.getRandomNumber();
		}
		if(x<=0){
			speed = gameUtils.getRandomNumber();
		}
		if(y>=(GAME_HEIGHT-50)){
			ySpeed = -gameUtils.getRandomNumber();
		}
		if(y<=0){
			ySpeed = gameUtils.getRandomNumber();
		}
	}
	
}
