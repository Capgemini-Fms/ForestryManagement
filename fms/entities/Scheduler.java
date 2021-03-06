package com.cap.fms.entities;

public class Scheduler {
	private String schedulerId;
	private String schedulerName;
	private String schedulerContact;
	private String truckNumber;
	public Scheduler() {}
	
	public Scheduler(String schedulerId, String schedulerName, String schedulerContact, String truckNumber) {
		super();
		this.schedulerId = schedulerId;
		this.schedulerName = schedulerName;
		this.schedulerContact = schedulerContact;
		this.truckNumber = truckNumber;
	}

	public String getSchedulerId() {
		return schedulerId;
	}
	public void setSchedulerId(String schedulerId) {
		this.schedulerId = schedulerId;
	}
	public String getSchedulerName() {
		return schedulerName;
	}
	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
	}
	public String getSchedulerContact() {
		return schedulerContact;
	}
	public void setSchedulerContact(String schedulerContact) {
		this.schedulerContact = schedulerContact;
	}
	public String getTruckNumber() {
		return truckNumber;
	}
	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}
	
	
}
