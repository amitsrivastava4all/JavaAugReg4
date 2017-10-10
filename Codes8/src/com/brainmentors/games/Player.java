package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Player implements GameConstants {
	private int x;
	private int y;
	private int w;
	private int h;
	private boolean isVisible;
	private int life;
	private Image img;
	private int ySpeed ;
	private int xSpeed ;
	  int acc;
	final int SPEED = 2;
	
	public void stop(){
		xSpeed = 0;
		ySpeed = 0;
	}
	
	public void up(){
		
		ySpeed = -SPEED;
	}
	public void down(){
		ySpeed = SPEED;
	}
	
	public void left(){
		xSpeed = -SPEED;
	}
	public void right(){
		xSpeed = SPEED;
	}
	public void move(){
		x += xSpeed;
		y+=ySpeed;
		
	}
	
	
	public Player(){
		img = new ImageIcon(Player.class.getResource("rocket.gif")).getImage();
		h = w = 100;
		x = (GAME_WIDTH / 2)-(w/2);
		y = GAME_HEIGHT - (h+50) ;
		ySpeed = xSpeed = 0;
		isVisible = true;
		life = 3;
	}
	
	public void drawPlayer(Graphics g){
		g.drawImage(img, x, y, w, h, null);
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
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	

}
