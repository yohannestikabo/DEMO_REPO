package com.yohannes.project.quesionengine;

import javax.ws.rs.core.Response;

public class ServerUtil {

	static Response buildResponse(Object entity){
		 return Response.status(200)
	                .header("Access-Control-Allow-Origin", "http://localhost:4200")
	                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
	                .header("Access-Control-Allow-Credentials", "true")
	                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	                .header("Access-Control-Max-Age", "1209600").entity(entity).build();
	}
}
