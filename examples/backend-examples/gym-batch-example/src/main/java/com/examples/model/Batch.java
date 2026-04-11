package com.examples.model;

public class Batch {
	private int batchId;
	private String batchName;
	private String batchTimings;
	public Batch(String batchName, String batchTimings) {
		super();
		this.batchName = batchName;
		this.batchTimings = batchTimings;
	}
	public Batch(int batchId, String batchName, String batchTimings) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
		this.batchTimings = batchTimings;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBatchTimings() {
		return batchTimings;
	}
	public void setBatchTimings(String batchTimings) {
		this.batchTimings = batchTimings;
	}
	
	
}
