package com.brainmentors.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.brainmentors.dto.UserDTO;
import com.brainmentors.utils.CommonUtility;

public class UserDAO  {
	private static UserDAO userDAO ;
	private UserDAO(){}
	public static UserDAO getInstance(){
		if(userDAO == null){
			userDAO = new UserDAO();
			
		}
		return userDAO;
	}
	
	public boolean isAuthorize(UserDTO userDTO) throws ClassNotFoundException, IOException{
		FileInputStream fs = null;
		ObjectInputStream os  = null;
		boolean isAuth = false;
		try{
			fs = new FileInputStream(CommonUtility.getUserFilePath());
			os = new ObjectInputStream(fs);
			UserDTO userDTOFS = (UserDTO)os.readObject();
			if(userDTO.equals(userDTOFS)){
				isAuth = true;
			}
		}
		finally{
			if(os!=null){
				os.close();
			}
			if(fs!=null){
				fs.close();
			}
		}
		return isAuth;
	}
	
	public boolean addNewUser(UserDTO userDTO) throws IOException{
		
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		boolean isAdded = false;
		try{
		fs =new FileOutputStream(CommonUtility.getUserFilePath());
		os = new ObjectOutputStream(fs);
		os.writeObject(userDTO);
		isAdded = true;
		}
		finally{
			if(os!=null){
				os.close();
			}
			if(fs!=null){
				fs.close();
			}
			
		}
		return isAdded;
	}
}
