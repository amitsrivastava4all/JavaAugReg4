package com.brainmentors.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userid;
	private String password;
	public UserDTO(String userid, String password){
		this.userid = userid;
		this.password= password;
				
	}
	@Override
	public boolean equals(Object object){
		if(this == object){
			return true;
		}
		UserDTO userDTO = null;	
		if(object instanceof UserDTO){
				userDTO = (UserDTO) object;  // Downcasting
				if(this.userid.equals(userDTO.userid) && this.password.equals(userDTO.password)){
					return true;
				}
		}
		return false;
		
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
