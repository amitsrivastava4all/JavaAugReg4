package com.brainmentors.kbc.views.question;

import java.util.Scanner;

import com.brainmentors.kbc.dto.question.QuestionDTO;
import com.brainmentors.kbc.model.questions.QuestionOperations;

public class QuestionView {
	int index ;
	QuestionOperations questionOperations ;
	Scanner scanner ;
	public QuestionView(){
		index = 0;
		scanner = new Scanner(System.in);
		questionOperations = new QuestionOperations();
	}
	public void printQuestion(){
		int seq = 65;
		String yourAns="";
		QuestionDTO questionDTO = questionOperations.getQuestion(index);
		System.out.println("Q"+questionDTO.getId()+" "+questionDTO.getName());
		for(String option : questionDTO.getOptions()){
			System.out.println(((char)seq)+") "+option);
			seq++;
		}
		while(true){
		System.out.println("Enter Your Answer");
		
		 yourAns = String.valueOf(scanner.next().charAt(0));
		if(yourAns.equals("a") || yourAns.equals("b") || yourAns.equals("c") || yourAns.equals("d")){
			break;
		}
		else{
			System.out.println("Wrong Option u Selected...");
			continue;
		}
		}
		questionDTO.setYourAnswer(yourAns);
		if(questionDTO.compareAnswer()){
			System.out.println("Your Win Amount is "+questionDTO.getScore());
			if(index<QuestionOperations.MAX_QUESTIONS-1){
				index++;
				printQuestion();
			}
			else{
				System.out.println("Game Over "+questionDTO.getScore());
			}
			
		}
		else
		{
			System.out.println("Wrong Answer GAME OVER");
		}
		
		
	}

}
