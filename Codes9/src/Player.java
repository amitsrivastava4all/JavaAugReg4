import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player implements GameConstants {
	
	private int x;
	private int y;
	private int w;
	private int h;
	BufferedImage spriteSheet;
	private final int FLOOR = GAME_HEIGHT - 50;
	public Player(){
		loadSpriteSheet();
		x = 100;
		h = 100;
		w = 80;
		y = FLOOR - h;
	}
	
	private void loadSpriteSheet(){
		try {
			spriteSheet = ImageIO.read(Player.class.getResource("player.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BufferedImage defaultImage(){
		return spriteSheet.getSubimage(5, 110, 37, 84);
	}
	
	public void drawPlayer(Graphics g){
		g.drawImage(defaultImage(), x, y, w, h, null);
	}

}
