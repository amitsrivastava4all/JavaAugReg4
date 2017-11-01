
public class Calc {
	
	
	
	public int add(int ...arr) throws NullPointerException {
		int sum = 0;
		if(arr==null){
			throw new NullPointerException("Array Is Null");
		}
		if(arr!=null && arr.length==0){
			throw new NullPointerException("Array is Empty");
		}
	
	if(arr!=null && arr.length>0){
	for(int num : arr){
		sum += num;
	}
	}
		
	return sum;
		
	}
	
	public void subtract(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

