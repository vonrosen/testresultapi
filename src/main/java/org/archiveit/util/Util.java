package org.archiveit.util;

import org.archiveit.jsonmodel.TestResultJson;
import org.archiveit.model.TestResult;

public class Util {

    public static TestResultJson createFlattened(TestResult result) {
        if (result == null) return null;
        
        TestResultJson t = new TestResultJson();
        
        t.setId(result.getId());
        t.setApplicationName(result.getApplication().getName());
        t.setBuildTested(result.getBuildTested());
        t.setClientHost(result.getClientHost());
        t.setClientTested(result.getClientTested());
        t.setCommitTested(result.getCommitTested());
        t.setCreated(result.getCreated());
        t.setDetailMessage(result.getDetailMessage());
        t.setEndTime(result.getEndTime());
        t.setLastUpdated(result.getLastUpdated());
        t.setName(result.getName());
        t.setStartTime(result.getStartTime());
        t.setTestFiles(result.getTestFiles());
        t.setTestGroupId(result.getTestGroupId());
        t.setTestOptions(result.getTestOptions());
        t.setTestResults(result.getTestResults());
        
        return t;
    }	
	
}
