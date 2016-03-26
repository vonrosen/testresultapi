package org.archiveit.jsonmodel;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.archiveit.model.Application;
import org.archiveit.model.TestResult;

public class TestResultJson {
	private String id;

	private String buildTested;

	private String clientHost;

	private String clientTested;

	private String commitTested;

	private Timestamp created;

	private byte[] detailMessage;

	private Date endTime;

	private Timestamp lastUpdated;

	private String name;

	private Date startTime;

	private String testFiles;

	private String testGroupId;

	private String testOptions;

	private String testResults;

	private String applicationName;

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

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
}
