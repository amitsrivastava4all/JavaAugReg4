package com.brainmentors.producer;

public class EnhanceProducer implements IProducer {

	@Override
	public void withDraw(int amount) {
		// TODO Auto-generated method stub
		System.out.println("this is faster Producer class with draw...");
	}

	@Override
	public void print() {
		System.out.println("this is faster Producer class print...");
		// TODO Auto-generated method stub
		
	}
	
	public void noOfTransAllowed(){
		System.out.println("Only 2 Trans Allowed in a Day");
	}

}
