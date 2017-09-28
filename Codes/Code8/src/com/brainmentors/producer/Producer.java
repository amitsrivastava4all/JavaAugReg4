package com.brainmentors.producer;

public class Producer implements IProducer {
	
	public boolean checkAccountNo(){
		return true;
	}
	@Override
	public void withDraw(int amount){
		if(checkAccountNo()){
		System.out.println("WithDraw Success "+amount);
		}
		else{
			System.out.println("Invalid Account No");
		}
	}
	@Override
	public void print(){
		System.out.println("this is producer print");
	}

}
