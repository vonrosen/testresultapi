package org.archiveit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the Application database table.
 * 
 */
@Entity
@NamedQuery(name="Application.findAll", query="SELECT a FROM Application a")
public class Application implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private Timestamp created;

	private Timestamp lastUpdated;

	private String name;

	private byte testsEnabled;

	//bi-directional many-to-one association to TestResult
	@OneToMany(mappedBy="application")
	private List<TestResult> testResults;

	public Application() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
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

	public byte getTestsEnabled() {
		return this.testsEnabled;
	}

	public void setTestsEnabled(byte testsEnabled) {
		this.testsEnabled = testsEnabled;
	}

	public List<TestResult> getTestResults() {
		return this.testResults;
	}

	public void setTestResults(List<TestResult> testResults) {
		this.testResults = testResults;
	}

	public TestResult addTestResult(TestResult testResult) {
		getTestResults().add(testResult);
		testResult.setApplication(this);

		return testResult;
	}

	public TestResult removeTestResult(TestResult testResult) {
		getTestResults().remove(testResult);
		testResult.setApplication(null);

		return testResult;
	}

}