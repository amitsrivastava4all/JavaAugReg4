package com.brainmentors.kbc.views.user;

import java.util.Scanner;

import com.brainmentors.kbc.dto.user.UserDTO;
import com.brainmentors.kbc.model.user.UserOperations;
import com.brainmentors.kbc.views.question.QuestionView;

public class LoginView {
	
	public void login(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		UserOperations userOperations = new UserOperations();
		
		if(userOperations.isAuth(userDTO)){
			System.out.println("Welcome "+userid);
			QuestionView questionView = new QuestionView();
			questionView.printQuestion();
		}
		else{
			System.out.println("Invalid userid or password");
			
		}
		
		
	}

}
