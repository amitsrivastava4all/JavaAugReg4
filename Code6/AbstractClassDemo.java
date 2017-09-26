abstract class Account
{
	void showBalance(){
		System.out.println("Balance is ");
	}
	void updateBalance(){
		
	}
	abstract void roi();
	 abstract void withDraw();
		
	
}
class SavingAccount extends Account{
	@Override
	void roi(){
		System.out.println("Pay By Bank 4% ...");
	}

	@Override
	void withDraw() {
		// TODO Auto-generated method stub
		
	}
}
abstract class CurrentAccount extends Account{
	@Override
	void roi(){
		System.out.println("Pay By Customer 7%");
	}
}
class CorpCurrentAccount extends CurrentAccount{

	@Override
	void withDraw() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account ac = new Account();
		SavingAccount sa = new SavingAccount();
		
	}

}
