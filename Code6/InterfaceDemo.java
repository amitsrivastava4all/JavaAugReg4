
// What to Do
interface Player{  // abstract interface Player
	void attack();  // public abstract void attack();
	void defense();
	void increasePower();
	int MIN_POWER = 1;
	int DEFAULT_POWER = 10;
	int MAX_POWER = 100;  // public static final int MAX_POWER = 100;
	void jump();
	int MAX_JUMP = 100;
}

interface StarPlayer{
	void extraPowers();
}

abstract class CommonPlayer{
	void score(){
		
	}
	void food(){
		
	}
}

class RedPlayer extends CommonPlayer implements Player, StarPlayer{

	int power = DEFAULT_POWER;
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increasePower() {
		// TODO Auto-generated method stub
		if(power<MAX_POWER){
			power+=2;
		}
	}

	@Override
	public void extraPowers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}
	
}

class WhitePlayer implements Player{

	int power = DEFAULT_POWER;
	@Override
	public void attack() {
		System.out.println("White Player Attack Hard...");
		
	}
	
	@Override
	public void increasePower(){
		if(power<MAX_POWER){
			power++;
		}
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
