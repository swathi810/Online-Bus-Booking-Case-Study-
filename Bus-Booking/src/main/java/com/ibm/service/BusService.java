package com.ibm.service;

import java.util.List;

import com.ibm.entity.Bus;

public interface BusService {
	
	int save(Bus f);
	
	Bus fetch(int busNumber);
	
	List<Bus> list();
	
	void delete(int code);
	
	
	
	List<Bus> byTravels(String carrier);
	
	List<Bus> byRoute(String source, String destiny);
}
