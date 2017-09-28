package com.brainmentors.consumer;

import com.brainmentors.producer.IProducer;
import com.brainmentors.producer.Producer;
import com.brainmentors.producer.ProducerFactory;

public class Consumer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IProducer p = new EnhanceProducer();
		IProducer p = ProducerFactory.getInstance();
		p.withDraw(12000);
		//p.checkAccountNo();
		p.print();

	}

}
