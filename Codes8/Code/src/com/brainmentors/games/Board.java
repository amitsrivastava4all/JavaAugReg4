package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	private Image backgroundImage;
	private Player player;
	private Timer timer;
	Enemy enemies[] = new Enemy[MAX_ENEMY];
	
	private void loadEnemies(){
		int x = 100;
		
		for(int i = 0 ; i<MAX_ENEMY; i++){
			enemies[i] = new Enemy(x, 70);
			x+=200;
		}
	}
	
	private void loadImages(){
		backgroundImage = new ImageIcon(Board.class.getResource("space.jpg")).getImage();
	}
	
	private void bindEvents(){
		this.addKeyListener(new KeyAdapter() {
			
			
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("Key Release "+e.getKeyCode());
				player.stop();
				player.yAcc = player.xAcc = 0;
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				//e.getKeyChar()
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					player.addBullets();
				}
				if(e.getKeyCode()==KeyEvent.VK_UP){
					player.up();
					//player.setY(player.getY()+player.acc);
					player.yAcc--;
				}
				if(e.getKeyCode()==KeyEvent.VK_DOWN){
					player.down();
					//player.setY(player.getY()+player.acc);
					player.yAcc++;
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					player.left();
					player.xAcc--;
				}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					player.right();
					player.xAcc++;
				}
				//player.move();
				
				//System.out.println("Key Press "+e.getKeyCode());
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	private void gameLoop(){
		timer = new Timer(DELAY,(e)->{
			repaint();
			player.move();
		});
		timer.start();
	}
	
	public Board(){
		setSize(GAME_WIDTH, GAME_HEIGHT);
		player = new Player();
		loadImages();
		loadEnemies();
		gameLoop();
		setFocusable(true);
		bindEvents();
	}
	
	private void drawEnemies(Graphics g){
		for(Enemy enemy : enemies){
			if(enemy.isVisible){
				enemy.drawEnemy(g);
			}
		}
	}
	
	private void drawBackGround(Graphics g){
		g.drawImage(backgroundImage,0, 0, GAME_WIDTH, GAME_HEIGHT, null);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawBackGround(g);
		player.drawPlayer(g);
		drawEnemies(g);
		player.drawBullets(g);
	}

}
