package org.archiveit.model;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TestResult database table.
 * 
 */
@Entity
@NamedQuery(name="TestResult.findAll", query="SELECT t FROM TestResult t")
public class TestResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String buildTested;

	private String clientHost;

	private String clientTested;

	private String commitTested;

	private Timestamp created;

	@Lob
	private byte[] detailMessage;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endTime;

	private Timestamp lastUpdated;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;

	private String testFiles;

	private String testGroupId;

	private String testOptions;

	private String testResults;

	//bi-directional many-to-one association to Application
	@ManyToOne
	@JoinColumn(name="applicationId")
	private Application application;

	public TestResult() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBuildTested() {
		return this.buildTested;
	}

	public void setBuildTested(String buildTested) {
		this.buildTested = buildTested;
	}

	public String getClientHost() {
		return this.clientHost;
	}

	public void setClientHost(String clientHost) {
		this.clientHost = clientHost;
	}

	public String getClientTested() {
		return this.clientTested;
	}

	public void setClientTested(String clientTested) {
		this.clientTested = clientTested;
	}

	public String getCommitTested() {
		return this.commitTested;
	}

	public void setCommitTested(String commitTested) {
		this.commitTested = commitTested;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public byte[] getDetailMessage() {
		return this.detailMessage;
	}

	public void setDetailMessage(byte[] detailMessage) {
		this.detailMessage = detailMessage;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Timestamp getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTestFiles() {
		return this.testFiles;
	}

	public void setTestFiles(String testFiles) {
		this.testFiles = testFiles;
	}

	public String getTestGroupId() {
		return this.testGroupId;
	}

	public void setTestGroupId(String testGroupId) {
		this.testGroupId = testGroupId;
	}

	public String getTestOptions() {
		return this.testOptions;
	}

	public void setTestOptions(String testOptions) {
		this.testOptions = testOptions;
	}

	public String getTestResults() {
		return this.testResults;
	}

	public void setTestResults(String testResults) {
		this.testResults = testResults;
	}

	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

    //bi-directional many-to-one association to TestResult
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="parentId")
    private TestResult testResult;	

    //bi-directional many-to-one association to TestResult
    @OneToMany(mappedBy="testResult", fetch = FetchType.EAGER)
    private List<TestResult> testRerunResults;
	
    public List<TestResult> getTestRerunResults() {
        return this.testRerunResults;
    }

    public void setTestRerunResults(List<TestResult> testRerunResults) {
        this.testRerunResults = testRerunResults;
    }
    
    public TestResult getTestResult() {
        return this.testResult;
    }

    public void setTestResult(TestResult testResult) {
        this.testResult = testResult;
    }

    public TestResult addTestRerunResult(TestResult testResult) {
        getTestRerunResults().add(testResult);
        testResult.setTestResult(this);

        return testResult;
    }

    public TestResult removeTestRerunResult(TestResult testResult) {
        getTestRerunResults().remove(testResult);
        testResult.setTestResult(null);

        return testResult;
    }	
}