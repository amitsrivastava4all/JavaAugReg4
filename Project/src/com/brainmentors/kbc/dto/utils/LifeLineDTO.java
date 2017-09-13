package com.brainmentors.kbc.dto.utils;

public class LifeLineDTO {
	private String name;
	private boolean isActive;
	public LifeLineDTO(){
		isActive = true;
	}
	public LifeLineDTO(String name){
		this();
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

}
