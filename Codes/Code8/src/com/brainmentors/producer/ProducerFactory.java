package com.brainmentors.producer;

import java.util.ResourceBundle;

public class ProducerFactory {
public static IProducer getInstance(){
	ResourceBundle rb = ResourceBundle.getBundle("config");
	String className = rb.getString("classname");
	try{
	Object object = Class.forName(className).newInstance();  // Upcasted
	IProducer p = (IProducer) object; // Downcast
	return p;
	}
	catch(Exception e){
		System.out.println("Problem in Factory "+e);
	}
	return null;
	//IProducer p = new EnhanceProducer();
	//return p;
}
}
