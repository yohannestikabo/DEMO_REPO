package com.yohannes.project.quesionengine;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.yohannes.project.quesionengine.doman.Subject;

@Path("/rest")

public class SubjectServer {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("subject")
	public Response retrieveQuestions(){
		List<Subject> subjects = new ArrayList<Subject>();
		for(int i=1; i< 20;i++) {
			Subject subject = new Subject();
			subject.setSubjectId("Subj011"+i);
			subject.setSubjectName("Subject 0"+i);
			//subject.setSubjects(subjects);
			subjects.add(subject);
		}
	
		
		 GenericEntity<List<Subject>> subjectList = new GenericEntity<List<Subject>>(subjects) {
	        };
	        return ServerUtil.buildResponse(subjectList);

	}
}
