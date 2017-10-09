package com.brainmentors.games;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.games.utils.GameConstants;

public class Board extends JPanel implements GameConstants , ActionListener{
	private Timer timer;
	//int x [] = new int[5];
	
	Ball balls[] ;
	//Ball ball = new Ball();
	
	private void prepareBalls(){
		for(int i = 0; i<balls.length; i++){
			Ball ball = new Ball();
			balls[i] = ball;
		}
	}
	private int score = 0;
	private void drawScore(Graphics g){
		g.setColor(Color.YELLOW);
		g.setFont(new Font("Arial", Font.BOLD, 26));
		g.drawString("Score is "+score, 15,50 );
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		repaint();
		checkBallsCollision();
		
	}
	private boolean gameOverValue=true ;
	
	private void drawGameOver(Graphics g){
		//System.out.println("IS GAME OVER "+isGameOver);
		if(isGameOver){
			g.setColor(Color.RED);
			g.setFont(new Font("Arial",Font.BOLD,46));
			//System.out.println("inside if ....");
			String value = gameOverValue?"GAME OVER ":"";
			g.drawString(value, (GAME_WIDTH/2-20), GAME_HEIGHT/2);
			//System.out.println("GAME OVER VAL "+value+" Boolean "+gameOverValue);
			gameOverValue = !gameOverValue;
		}
	}
	boolean isGameOver ;  
	private void gameOver(Graphics g){
		isGameOver = true;
		for(Ball ball:balls){
			if(ball.isVisible()){
				isGameOver = false;
				break;
			}
		}
//		if(isGameOver){
//			g.setColor(Color.RED);
//			g.setFont(new Font("Arial",Font.BOLD,46));
//			g.drawString("GAME OVER", (GAME_WIDTH/2-20), GAME_HEIGHT/2);
//			timer.stop();
//		}
	}

	
	public Board(int noOfBalls){
		balls = new Ball[noOfBalls];
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
//		timer = new Timer(GAME_SPEED,(e)->{
//			repaint();
//			
//		});
		timer = new Timer(GAME_SPEED,this);
		timer.start();
	}
	
	
	
	public void checkBallsCollision(){
		for(int i = 0; i<balls.length-1; i++){
			for(int j = i + 1; j<balls.length; j++){
				if(balls[i].isVisible() && balls[j].isVisible()){
				if(isCollision(balls[i], balls[j])){
					score++;
						balls[i].setVisible(false);
						balls[j].setVisible(false);
				}
				}
			}
		}
	}
	
	public boolean isCollision(Ball firstBall, Ball secondBall){
		int xDistance = Math.abs(firstBall.getX() - secondBall.getX());
		int yDistance = Math.abs(firstBall.getY() - secondBall.getY());
		return xDistance<=firstBall.getW() && yDistance<=firstBall.getH();
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for(Ball ball : balls){
			if(ball.isVisible()){
			ball.drawBall(g);
			System.out.println("Ball "+ball.getX()+" "+ball.getY());
			ball.move();
			ball.changeDirection();
			}
			}
		drawScore(g);
		gameOver(g);
		drawGameOver(g);
		
		//g.setColor(Color.BLUE);
		//g.fillOval((x-10), (y-10), 20, 20);
		
		//g.setColor(Color.GREEN);
		//g.fillRect(400,100,50,50);
		//g.drawOval(100,100,50,50);
		
		
	}
	
	
	
	
	
}
