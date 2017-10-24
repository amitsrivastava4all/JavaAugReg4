import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCalc {
	
//	@Test
//	public void testCollision(){
//		Player p = new Player();
//		p.setX(10);
//		p.setY(20);
//		p.setW(100);
//		
//	}
	
	private Calc calc;
	@BeforeMethod
	public void start(){
		calc = new Calc();
		System.out.println("Start...");
	}
	@AfterMethod
	public void end(){
		calc = null;
	}
	@Test()
	public void addTwoNumbers(){
		int expectedResult = 30;
		//Calc calc = new Calc();
		int result = calc.add(10, 20);
		Assert.assertEquals(result,expectedResult);
	}
	@Test
	public void addNNumbers(){
		int expectedResult = 100;
		//Calc calc = new Calc();
		int result = calc.add(10, 20,30,40);
		Assert.assertEquals(result,expectedResult);
	}
	
	@Test(enabled=false)
	//@Test(timeOut=2000)
	public void passIn2Sec(){
		int expectedResult = 250;
		Calc calc = new Calc();
		 calc.subtract();
		Assert.assertEquals(1000,expectedResult);
	}
	

}
