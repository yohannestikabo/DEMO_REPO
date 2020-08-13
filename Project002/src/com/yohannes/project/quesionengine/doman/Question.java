package com.yohannes.project.quesionengine.doman;

public class Question {
/*
 * Types
 * Choice Code - A
 * Dichotomy Code - B
 * 
 */
	private String questionId;
	//private String subject
	private String answer;
	private String statement;
	private String typeCode;
	private String[] choices;

	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public Question() {
	}
	public Question(String questionId, String answer, String statement, String typeCode) {
		super();
		this.questionId = questionId;
		this.answer = answer;
		this.statement = statement;
		this.typeCode=typeCode;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String[] getChoices() {
		return choices;
	}
	public void setChoices(String[] choices) {
		this.choices = choices;
	}

	
}
