

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class GameFrame extends JFrame implements GameConstants {
	
	public GameFrame(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		
		setLocationRelativeTo(null);
		
		setTitle(GAME_TITLE);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Board board = new Board();
		add(board);
		setVisible(true);
		Toolkit.getDefaultToolkit().sync();
	}
	
	

	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		

	}

}
