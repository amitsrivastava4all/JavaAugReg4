package com.brainmentors.kbc.dto.question;

public class QuestionDTO {
	private int id;
	private String name;
	private String options[]= new String[4];
	private int score;
	private String rightAnswer;
	private String yourAnswer;
	public boolean compareAnswer(){
		return rightAnswer.equals(yourAnswer);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public String getYourAnswer() {
		return yourAnswer;
	}
	public void setYourAnswer(String yourAnswer) {
		this.yourAnswer = yourAnswer;
	}
	

}
