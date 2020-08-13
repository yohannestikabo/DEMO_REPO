package com.yohannes.project.quesionengine;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.yohannes.project.quesionengine.doman.Category;
import com.yohannes.project.questionengine.util.CategoryUtil;

@Path("/rest")
public class CategoryServer {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("categories")
	public Response retrieveCategories(){
		 GenericEntity<List<Category>> categoryList = new GenericEntity<List<Category>>(CategoryUtil.getAllCategories()) {
	        };
	        return ServerUtil.buildResponse(categoryList);

	}

}
