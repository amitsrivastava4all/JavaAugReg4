package com.brainmentors.games;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Player extends Sprite implements GameConstants {
	ArrayList<Bullet> bullets  = new ArrayList<>();
	int yAcc;
	int xAcc;
	final int SPEED = 2;
	
	
	public void addBullets(){
		Bullet bullet = new Bullet((this.x+((this.w/2)-5)),this.y);
		bullets.add(bullet);
	}
	
	public void drawBullets(Graphics g){
		for(Bullet bullet : bullets){
			if(bullet.isVisible()){
			bullet.drawBullet(g, PLAYER);
			}
		}
	}
	
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
		x += xSpeed  + xAcc;
		y+=ySpeed + yAcc;
		
		
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
	
		

}
