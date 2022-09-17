package com.ibm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "busList")
public class Bus {
	@Id
	private int busNumber;
	private String travels;
	private String source;
	private String destiny;
	public int seatsCount;
	public int getBusNumber() {
		return busNumber;
	}
	public int getSeatsCount() {
		return seatsCount;
	}
	public void setSeatsCount(int seatsCount) {
		this.seatsCount = seatsCount;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public String getTravels() {
		return travels;
	}
	public void setTravles(String travles) {
		this.travels = travles;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestiny() {
		return destiny;
	}
	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
	
	
	
}
