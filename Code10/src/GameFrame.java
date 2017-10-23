

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import jaco.mp3.player.MP3Player;



public class GameFrame extends JFrame implements GameConstants {
	Logger logger = Logger.getLogger(GameFrame.class);
	private void playMusic(){
		logger.debug("Inside Play");
		MP3Player mp3 = new MP3Player(GameFrame.class.getResource("pop.mp3"));
		mp3.play();
		logger.debug("End Play");
	}
	
	public GameFrame(){
		logger.debug("Frame Cons Start");
		setSize(GAME_WIDTH,GAME_HEIGHT);
		
		setLocationRelativeTo(null);
		
		setTitle(GAME_TITLE);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Board board = new Board();
		add(board);
		setVisible(true);
		Toolkit.getDefaultToolkit().sync();
		playMusic();
		logger.debug("Frame Cons End");
	}
	
	

	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		

	}

}
