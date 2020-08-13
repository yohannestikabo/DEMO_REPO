package com.yohannes.project.questionengine.db;

import java.util.Collection;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class TestClient {
 public static void main(String[] args) {
	
	 MongoClient cleint =  MDBDatabaseServer.getInstance("mongodb://localhost:27017");
	 MongoClient cleint2 =  MDBDatabaseServer.getInstance("mongodb://localhost:27017");
	 DB quizbox= cleint.getDB("quizbox");
	 DBCollection question= quizbox.getCollection("question");

}
}
