package com.brainmentors.consumer;

import com.brainmentors.producer.IProducer;
import com.brainmentors.producer.Producer;
import com.brainmentors.producer.ProducerFactory;

public class Consumer2 {

	public static void main(String[] args) {
		//IProducer p = new Producer();
		IProducer p = ProducerFactory.getInstance();
		p.withDraw(10000);
		p.print();

	}

}
