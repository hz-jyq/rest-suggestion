package com.fengdai.suggestion.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fengdai.suggestion.api.SuggestionApiProvider;
import com.fengdai.suggestion.model.MySuggestion;
import com.fengdai.suggestion.service.MySuggestionService;


@Path("jersey")
@Produces(MediaType.APPLICATION_JSON)
public class SuggestionResoure{
	
	MySuggestionService  mySuggestionService=SuggestionApiProvider.getMySuggestionService();
	
	@GET
	@Path("/thing")
	public Response get() {
		System.out.println("=----成功-----");
		MySuggestion mySuggestion=mySuggestionService.selectByPrimaryKey("11");
		return Response.status(Status.OK).entity(mySuggestion).type(MediaType.APPLICATION_JSON).build();
	}
}
