import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player implements GameConstants, PlayerState {
	
	private int x;
	private int y;
	private int w;
	private int h;
	private int speed ;
	BufferedImage spriteSheet;
	private final int  GRAVITY  = 1;
	private int force ;
	private final int FLOOR = GAME_HEIGHT - 50;
	private int state;
	
	
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	private BufferedImage kickImageArr [];
	public Player(){
		loadSpriteSheet();
		defaultImageArr = defaultImage();
		kickImageArr = kickImage();
		
		x = 100;
		h = 100;
		w = 80;
		speed = 7;
		state = WALK;
		y = FLOOR - h;
	}
	private boolean isJump;
	public void jump(){
		if(!isJump){
		force = -20;
		y = y + force;
		isJump = true;
		}
	}
	
	public void fall(){
		if(y<FLOOR-h){
			force = force + GRAVITY;
			y = y + force;
		}
		if(y>=FLOOR-h){
			isJump = false;
			y = FLOOR - h;
		}
	}
	public void walk(){
		x+=speed;
	}
	int walkPass = 0;
	int walkIndex = 0;
	BufferedImage defaultImageArr[] ;
	
	
	
	public void walkEffect(Graphics g){
		
		if(walkIndex>=defaultImageArr.length-1){
			walkIndex = 0;
		}
		else
		{
			g.drawImage(defaultImageArr[walkIndex], x, y, w, h, null);
			walkPass++;
			if(walkPass==4){
			
			walkIndex++;
			walkPass=0;
			}
			
			//GameUtils.delay(1);
		}
	}
	int kickIndex = 0;
	int kickPass = 0; 
	public void kickEffect(Graphics g){
		if(kickIndex>=kickImageArr.length-1){
			kickIndex = 0;
			walkIndex = 0;
			state = WALK;
		}
		else
		{
			g.drawImage(kickImageArr[kickIndex], x, y, w, h, null);
			kickPass++;
			if(kickPass==4){
			
				kickIndex++;
				kickPass=0;
			}
			
			//GameUtils.delay(1);
		}
	}
	
	private void loadSpriteSheet(){
		try {
			spriteSheet = ImageIO.read(Player.class.getResource("player.gif"));
			System.out.println("Load Sprite Sheet...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BufferedImage[] defaultImage(){
		BufferedImage array[] = new BufferedImage[5];
		array[0]= spriteSheet.getSubimage(5, 110, 37, 84);
		array[1]= spriteSheet.getSubimage(73, 106, 39, 87);
		array[2]= spriteSheet.getSubimage(134, 107, 43, 90);
		array[3]= spriteSheet.getSubimage(201, 109, 37, 84);
		array[4]= spriteSheet.getSubimage(267, 108, 35, 82);
		return array;
	}
	
	public BufferedImage[] kickImage(){
		BufferedImage array[] = new BufferedImage[4];
		array[0]= spriteSheet.getSubimage(5, 308, 39, 88);
		array[1]= spriteSheet.getSubimage(67, 309, 43, 86);
		array[2]= spriteSheet.getSubimage(129, 303, 75, 91);
		array[3]= spriteSheet.getSubimage(224, 310, 45, 84);
		
		return array;
	}
	
	
	
	public void drawPlayer(Graphics g){
		//g.drawImage(defaultImage(), x, y, w, h, null);
		if(state==WALK){
			walkEffect(g);
		}
		else
		if(state==KICK){	
			kickEffect(g);
		}
	}

}
