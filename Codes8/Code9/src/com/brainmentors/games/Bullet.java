package com.brainmentors.games;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Bullet extends Sprite implements GameConstants {
	public Bullet(int x, int y){
		//img = new ImageIcon(Enemy.class.getResource("alien2.gif")).getImage();
		h = w = 10;
		this.x = x ;
		this.y = y;
		//x = (GAME_WIDTH / 2)-(w/2);
		//y = GAME_HEIGHT - (h+50) ;
		ySpeed = -10;
		//ySpeed = xSpeed = 0;
		isVisible = true;
		life = 3;
	}
	
	public void move(){
		y+=ySpeed;
	}
	
	public void drawBullet(Graphics g,int OWNER){
		if(OWNER == PLAYER){
		g.setColor(Color.YELLOW);
		}
		else
		if(OWNER == ENEMY)	
		{
			g.setColor(Color.RED);
		}
		g.fillOval(x, y, w, h);
		move();
	}

}
