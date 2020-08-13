package com.yohannes.project.quesionengine;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.yohannes.project.quesionengine.doman.Menu;
import com.yohannes.project.questionengine.util.MenuUtil;

@Path("/rest")
public class MenuServer {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("menus")
	public Response retrieveMenus(){
		 GenericEntity<List<Menu>> menuList = new GenericEntity<List<Menu>>(MenuUtil.getAllMenus()) {
	        };
	        return ServerUtil.buildResponse(menuList);

	}

}
