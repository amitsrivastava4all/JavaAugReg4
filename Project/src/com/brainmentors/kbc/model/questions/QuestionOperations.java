package com.brainmentors.kbc.model.questions;

import com.brainmentors.kbc.dto.question.QuestionDTO;

public class QuestionOperations {
	public static final int MAX_QUESTIONS = 3;
	QuestionDTO questions[] = new QuestionDTO[MAX_QUESTIONS]; 
	String x[] = new String[3];
	
	public QuestionOperations(){
		prepareQuestions();
	}
	
	private QuestionDTO prepareQuestionObject(int id , String name, String options[], String rightAns, int score){
		QuestionDTO question = new QuestionDTO();
		question.setId(id);
		question.setName(name);
		question.setOptions(options);
		question.setRightAnswer(rightAns);
		question.setScore(score);
		return question;
	}
	
	public void prepareQuestions(){
		
		String options[]={"Java Virtual Machine","Java Vital Machine","Both a and b", "None of these"};
		questions[0] = this.prepareQuestionObject(1, "JVM Stands For ", options, "a", 1000);
		String options2[]={"Java Run Machine","Java Runtime Machine","Both a and b", "None of these"};
		questions[1] = this.prepareQuestionObject(2, "JRE Stands For ", options2, "b", 3000);
		String options3[]={"Java Dev Kit","Java Dave Kit","Java Development Kit", "None of these"};
		questions[2] = this.prepareQuestionObject(3, "JDK Stands For ", options3, "c", 5000);
		
		
//		question.setId(1);
//		question.setName("JVM Stands For ");
//		String options[]={"Java Virtual Machine","Java Vital Machine","Both a and b", "None of these"};
//		question.setOptions(options);
//		question.setRightAnswer("a");
//		question.setScore(1000);
		/*questions[0] = question;
		question = new QuestionDTO();
		question.setId(2);
		question.setName("JRE Stands For ");
		String options2[]={"Java Run Machine","Java Runtime Machine","Both a and b", "None of these"};
		question.setOptions(options2);
		question.setRightAnswer("b");
		question.setScore(3000);
		questions[1] = question;
	*/
	}
	
	public QuestionDTO getQuestion(int index){
		return questions[index];
	}
	
	

}
