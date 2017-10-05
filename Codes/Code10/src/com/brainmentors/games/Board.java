package com.brainmentors.games;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.games.utils.GameConstants;
import com.brainmentors.games.utils.GameUtils;

public class Board extends JPanel implements GameConstants{//,ActionListener{
	private Timer timer;
	//int x [] = new int[5];
	final int MAX_BALL = 50;
	Ball balls[] = new Ball[MAX_BALL];
	//Ball ball = new Ball();
	
	private void prepareBalls(){
		for(int i = 0; i<MAX_BALL; i++){
			Ball ball = new Ball();
			balls[i] = ball;
		}
	}
	
	public Board(){
		prepareBalls();
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setBackground(Color.BLACK);
		gameLoop();
	}
//	@Override
//	public void actionPerformed(ActionEvent e){
//		repaint();
//	}
	
	public void gameLoop(){
		
		//timer = new Timer(GAME_SPEED,this);
		System.out.println("Balls are "+balls.length);
		timer = new Timer(GAME_SPEED,(e)->{
			repaint();
			
		});
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for(Ball ball : balls){
			ball.drawBall(g);
			System.out.println("Ball "+ball.getX()+" "+ball.getY());
			ball.move();
			ball.changeDirection();
			}
		
		
		//g.setColor(Color.BLUE);
		//g.fillOval((x-10), (y-10), 20, 20);
		
		//g.setColor(Color.GREEN);
		//g.fillRect(400,100,50,50);
		//g.drawOval(100,100,50,50);
		
		
	}
	
	
	
	
	
}
