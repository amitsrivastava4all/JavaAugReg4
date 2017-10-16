

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Board extends JPanel implements GameConstants , ActionListener{
	private Timer timer;
	private Image background;
	private Player player;
	
	
	
	@Override
	public void actionPerformed(ActionEvent e){
		repaint();
		
		
	}
	
	private void drawBackGround(Graphics g){
		g.drawImage(background, 0, 0, GAME_WIDTH, GAME_HEIGHT, null);
	}
	
	private void loadImages(){
		background = new ImageIcon(Board.class.getResource(BACKGROUND_IMAGE)).getImage();
		//ImageIO.read(new File("c:\\abcd\\xyz.jpg"));
//		try {
//			
//			//background = ImageIO.read(Board.class.getResource(BACKGROUND_IMAGE));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Can't Load BackGround Image");
//			e.printStackTrace();
//			System.exit(0);
//		}
	}
	
	public Board(){
		player = new Player();
		loadImages();
		setSize(GAME_WIDTH,GAME_HEIGHT);
		//setBackground(Color.WHITE);
		gameLoop();
	}
	
	
	

	
	public void gameLoop(){
		
	
		timer = new Timer(GAME_SPEED,this);
		timer.start();
	}
	
	
	
	
	
	@Override
	public void paintComponent(Graphics g){
		//System.out.println("Paint Call");
		super.paintComponent(g);
		drawBackGround(g);
		player.drawPlayer(g);
		
		
	}
	
	
	
	
	
}
