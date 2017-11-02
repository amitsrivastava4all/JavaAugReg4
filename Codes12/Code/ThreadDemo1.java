class AccountLogic{
	static int balance= 15000 ;
	static void show(){
		System.out.println("UR Current balance is ************** "+balance+" Thread "+Thread.currentThread().getName());
		if(balance>10000){
			
			balance = balance - 5000;
		}
//		for(int i = 1; i<=5; i++){
//			System.out.println("Time Pass Loop "+i+" "+Thread.currentThread().getName());
//		}
		System.out.println("With Draw Done..."+balance +" "+Thread.currentThread().getName());
		}
	}


// Runnable Interface
//class Job extends Thread
class Job implements Runnable{
	//int balance= 15000 ;
	AccountLogic al = new AccountLogic();
	 
	@Override
	public   void run(){
		System.out.println("Welcome "+Thread.currentThread());
		System.out.println("I am Inside the Banking..."+Thread.currentThread());
		//al.show();
		synchronized (AccountLogic.class) {
			AccountLogic.show();
		}
		/*synchronized(al){
			al.show();
		}*/
//		System.out.println("UR Current balance is ************** "+balance+" Thread "+Thread.currentThread().getName());
//		if(balance>10000){
//			
//			balance = balance - 5000;
//		}
////		for(int i = 1; i<=5; i++){
////			System.out.println("Time Pass Loop "+i+" "+Thread.currentThread().getName());
////		}
//		System.out.println("With Draw Done..."+balance +" "+Thread.currentThread().getName());
//		}
//		for( i = 1; i<=5; i++){
//			System.out.println("Job is Running "+i+" "+Thread.currentThread().getName());
//		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job  = new Job();
		Thread worker = new Thread(job,"ram");
		Job job2  = new Job();
		Thread worker2 = new Thread(job,"shyam");
		
		//System.out.println("NOW THIS IS MAIN THREAD.... "+Thread.currentThread().getName());
		
		Job job3  = new Job();
		Thread worker3 = new Thread(job,"mike");
		worker.start();
		worker2.start();
		worker3.start();
		
		StringBuilder sb = new StringBuilder();
		synchronized (sb) {
			sb.append("Hello");
			sb.append("How");
			
		}
		sb.append("Hi");
		
		

	}

}
