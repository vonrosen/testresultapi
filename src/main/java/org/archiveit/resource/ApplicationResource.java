package org.archiveit.resource;

import org.archiveit.model.Application;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class ApplicationResource extends ServerResource {

    @Get("json")
    public String getApplications() {
		try {
			return new JsonRepresentation(new JSONObject("all")).getText();
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

    	return null;
    }

    @Put
    public void store(Application contact) {
    	
    }
	
}
