package org.archiveit.resource;

import javax.persistence.EntityManager;

import org.archiveit.model.TestResult;
import org.archiveit.util.Util;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class TestResultResource extends ServerResource {

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	private EntityManager entityManager = null;

	@Get("json")
    public String getTestResults() {
    	if (getRequest().getAttributes().get("id") != null) {
    		String id = getRequest().getAttributes().get("id").toString();
    		
    		try {
    			TestResult testResult = entityManager.find(TestResult.class, id);
    			
    			return new JsonRepresentation(new JSONObject(Util.createFlattened(testResult))).getText();
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
