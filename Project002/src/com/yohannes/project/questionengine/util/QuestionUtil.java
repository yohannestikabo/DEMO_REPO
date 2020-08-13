package com.yohannes.project.questionengine.util;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.yohannes.project.quesionengine.doman.Question;
import com.yohannes.project.questionengine.db.MDBDatabaseServer;
public class QuestionUtil {

	public static List<Question> getAllQuestions(){
		
		return null;
	}
	
	public static boolean addQuestion(Question question) {
		boolean status = false;
		try {
		DBObject questionDBObject = new BasicDBObject("questionId", question.getQuestionId())
				                     .append("statement", question.getStatement())
				                     .append("typeCode", question.getTypeCode())
				                     .append("answer",question.getAnswer())
		                              .append("choices",question.getChoices());
		 MongoClient client =  MDBDatabaseServer.getInstance("mongodb://localhost:27017");
		 DB quizbox= client.getDB("quizbox");
		 DBCollection questionsDBObject= quizbox.getCollection("question");
		 questionsDBObject.insert(questionDBObject);
		 status=true;
		}
		catch(Exception e) {
			status =false;
		}
		return status;
	}
}
