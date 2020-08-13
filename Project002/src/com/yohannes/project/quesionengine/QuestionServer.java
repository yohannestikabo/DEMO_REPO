package com.yohannes.project.quesionengine;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.glass.ui.Application;
import com.yohannes.project.quesionengine.doman.Question;
import com.yohannes.project.questionengine.util.QuestionUtil;

@Path("/rest")
public class QuestionServer {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("question")
	public Response retrieveQuestion(){
		
		List<Question> questions = new ArrayList<Question>();
		Question firstQuestion = new Question("001","First Choice","First Question","A");
		Question secondQuestion = new Question("002","No","Second Question","B");

		Question thirdQuestion = new Question("003","First Answer","Third Question","A");

		String [] firstChoices = {"First Choice","Second Choice","Thrid Choice"};
		firstQuestion.setChoices(firstChoices);
		secondQuestion.setChoices(firstChoices);
		thirdQuestion.setChoices(firstChoices);
		
		questions.add(firstQuestion);
		questions.add(secondQuestion);
		questions.add(thirdQuestion);
		//questions.add(new Question("002","Second Answer","Second Question"));
		
		 GenericEntity<List<Question>> questionList = new GenericEntity<List<Question>>(questions) {
	        };
	        return ServerUtil.buildResponse(questionList);
	}
	
	@POST
	@Path("addQuestion")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean addQuestion (Question question) {
		
		return QuestionUtil.addQuestion(question);
	}
	
	
}
