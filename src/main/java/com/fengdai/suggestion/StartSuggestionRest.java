package com.fengdai.suggestion;

import java.io.IOException;

import org.glassfish.jersey.server.ResourceConfig;

import com.fengdai.rest.base.StartRest;

public  class  StartSuggestionRest extends  StartRest {
	    public static void main(String[] args) throws IOException {  
	    	StartSuggestionRest  startSuggestionRest=new StartSuggestionRest();
	        final String baseUri = "http://localhost:9999/";   
	        startSuggestionRest.startServer(baseUri);	
	    }

		@Override
		public ResourceConfig settingResourceConfig(ResourceConfig rc) {
		    rc.packages("com.fengdai.suggestion.resource");
		    rc.packages("com.fengdai.rest.config");
		    return rc;
		}  
}
