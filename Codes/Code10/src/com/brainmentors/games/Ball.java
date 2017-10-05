package com.brainmentors.games;

import java.awt.Color;
import java.awt.Graphics;

import com.brainmentors.games.utils.GameConstants;
import com.brainmentors.games.utils.GameUtils;

public class Ball implements GameConstants {
	private int x;
	private int y;
	private int w;
	private int h;
	private int xSpeed;
	private int ySpeed;
	private Color color;
	static GameUtils g;
	static GameUtils speed;
	static GameUtils red;
	static GameUtils green;
	static GameUtils blue;
	static{
		g = new GameUtils(GAME_HEIGHT);
		speed = new GameUtils(30);
		red = new GameUtils(100);
		green = new GameUtils(130);
		blue = new GameUtils(160);
	}
	static int currentColor;
	private Color getBallColor(){
		currentColor++;
		if(currentColor>7){
			currentColor = 1;
		}
		if(currentColor==1){
			return Color.RED;
		}
		if(currentColor==2){
			return Color.GREEN;
		}
		if(currentColor==3){
			return Color.BLUE;
		}
		if(currentColor==4){
			return Color.ORANGE;
		}
		if(currentColor==5){
			return Color.YELLOW;
		}
		if(currentColor==6){
			return Color.MAGENTA;
		}
		else
			return Color.PINK;
		
		
	}
	public Ball(){
		
		x  = g.getRandomNumber();
		y = g.getRandomNumber();
		w = h = 50;
		xSpeed = ySpeed = 10;
		//color = new Color(red.getRandomNumber(), green.getRandomNumber(), blue.getRandomNumber());
		color = getBallColor();
	}
	
	public void drawBall(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, w, h);
	}
	
	public void changeDirection(){
		if(x>=(GAME_WIDTH-50)){
			xSpeed = -speed.getRandomNumber();
		}
		if(x<=0){
			xSpeed = speed.getRandomNumber();
		}
		if(y>=(GAME_HEIGHT-50)){
			ySpeed = -speed.getRandomNumber();
		}
		if(y<=0){
			ySpeed = speed.getRandomNumber();
		}
	}
	
	public void move(){
		x+=xSpeed;
		y+= ySpeed;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
