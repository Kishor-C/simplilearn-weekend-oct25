package com.examples.model;

public class Participant {
	private int participantId;
	private String participantName;
	private long phone;
	private int batchId;
	public Participant(int participantId, String participantName, long phone, int batchId) {
		super();
		this.participantId = participantId;
		this.participantName = participantName;
		this.phone = phone;
		this.batchId = batchId;
	}
	public Participant(String participantName, long phone, int batchId) {
		super();
		this.participantName = participantName;
		this.phone = phone;
		this.batchId = batchId;
	}
	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	
}
