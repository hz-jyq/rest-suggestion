package com.fengdai.suggestion.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fengdai.rest.helper.ResourceHelper;
import com.fengdai.suggestion.api.SuggestionApiProvider;
import com.fengdai.suggestion.model.MySuggestion;
import com.fengdai.suggestion.service.MySuggestionService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@Path("jersey")
@Produces(MediaType.APPLICATION_JSON)
public class SuggestionResoure{
	
	public static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();
	
	MySuggestionService  mySuggestionService=SuggestionApiProvider.getMySuggestionService();
	
	@GET
	@Path("Detail")
	public Response getDetail(@QueryParam("id") String id) {
		System.out.println("=----成功-----");
		MySuggestion mySuggestion=mySuggestionService.selectByPrimaryKey(id);
		return ResourceHelper.returnSuccess(GSON.toJson(mySuggestion));
	}
	
	@GET
	public Response getPage() {
		System.out.println("=----成功-----");
		MySuggestion mySuggestion=mySuggestionService.selectByPrimaryKey(null);
		return ResourceHelper.returnSuccess(GSON.toJson(mySuggestion));
	}
}
