package com.brainmentors.games;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy extends Sprite implements GameConstants {
	public Enemy(int x, int y){
		img = new ImageIcon(Enemy.class.getResource("alien2.gif")).getImage();
		h = w = 100;
		this.x = x ;
		this.y = y;
		//x = (GAME_WIDTH / 2)-(w/2);
		//y = GAME_HEIGHT - (h+50) ;
		ySpeed = xSpeed = 0;
		isVisible = true;
		life = 3;
	}
	
	public void drawEnemy(Graphics g){
		g.drawImage(img, x, y, w, h, null);
	}
}
