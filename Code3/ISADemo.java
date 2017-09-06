class Account
{
	double balance;
	int id;
	String name;
	void withDraw(){
		System.out.println("Account Class WithDraw Call NO LIMIT");
	}
	void deposit(){
		System.out.println("Account Class Deposit Call");
	}
}
class SavingAccount extends Account{
	@Override
	void withDraw(){
		
		System.out.println("SA WITH DRAW WITH LIMIT.....");
		super.withDraw();
	}
}
class CurrentAccount extends Account{
	void odLimit(){
		System.out.println("CA OD Limit...");
	}
}
class FixedDepositAccount extends Account{
	void lockingPeriod(){
		System.out.println("FD Locking Period...");
	}
}

class AccountCaller{
	void callMe(Account account){
		account.withDraw();
		account.deposit();
		System.out.println("************************************");
		if(account instanceof CurrentAccount){
			CurrentAccount ca = (CurrentAccount) account ; // Downcasting
			ca.odLimit();
			ca.deposit();
		}
		else
		if(account instanceof FixedDepositAccount){
			FixedDepositAccount fa = (FixedDepositAccount) account;
			fa.lockingPeriod();
		}
	}
}

public class ISADemo {

	public static void main(String[] args) {
		
		AccountCaller ac = new AccountCaller();
		SavingAccount a =  new SavingAccount();
		ac.callMe(a);  //Account sa = new SavingAccount();  // Upcasting
		ac.callMe(new CurrentAccount());
		ac.callMe(new FixedDepositAccount());
//		// TODO Auto-generated method stub
//		Account sa = new SavingAccount();
//		//SavingAccount sa = new SavingAccount();
//		sa.withDraw();
//		
//		sa.deposit();
//		
//		System.out.println("********************************************");
//		
//		CurrentAccount ca = new CurrentAccount();
//		ca.withDraw();
//		ca.deposit();
//		ca.odLimit();
//		
//		System.out.println("********************************************");
//		
//		FixedDepositAccount fd = new FixedDepositAccount();
//		fd.deposit();
//		fd.withDraw();
//		fd.lockingPeriod();
	}

}
