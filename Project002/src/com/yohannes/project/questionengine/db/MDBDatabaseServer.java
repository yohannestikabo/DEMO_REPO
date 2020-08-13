package com.yohannes.project.questionengine.db;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MDBDatabaseServer extends MongoClient{

	private static MDBDatabaseServer mDBDatabaseServer;

	public MDBDatabaseServer(String url) throws UnknownHostException {
		super(new MongoClientURI("mongodb://localhost:27017"));
	}

	public static MDBDatabaseServer getInstance(String url) {	
			try {
				if(mDBDatabaseServer==null)
				 mDBDatabaseServer= new MDBDatabaseServer(url);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		 return mDBDatabaseServer;
	}
}
