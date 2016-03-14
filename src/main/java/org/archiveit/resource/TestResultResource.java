package org.archiveit.resource;

import org.archiveit.model.TestResult;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class TestResultResource extends ServerResource {

    @Get("json")
    public String getTestResults() {
    	if (getRequest().getAttributes().get("id") != null) {
    		String id = getRequest().getAttributes().get("id").toString();
    		
    		try {
    			return new JsonRepresentation(new JSONObject("{id: " + id + " }")).getText();
    		}
    		catch (Exception exc) {
    			exc.printStackTrace();
    		}
    	}

    	return null;
    }

    @Put
    public void store(TestResult contact) {
    	
    }
	
}
