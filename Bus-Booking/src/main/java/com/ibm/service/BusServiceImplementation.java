package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Bus;
import com.ibm.repo.BusRepository;

@Service
public class BusServiceImplementation implements BusService{
	
	@Autowired
	private BusRepository repo;
	
	@Override
	public int save(Bus b) {
		// TODO Auto-generated method stub
		repo.save(b);
		return b.getBusNumber();
	}

	@Override
	public Bus fetch(int code) {
		// TODO Auto-generated method stub
		return repo.findById(code).get();
	}

	@Override
	public List<Bus> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int code) {
		// TODO Auto-generated method stub
		repo.deleteById(code);
	}

	@Override
	public List<Bus> byTravels(String carrier) {
		// TODO Auto-generated method stub
		return repo.findByTravels(carrier);
	}

	@Override
	public List<Bus> byRoute(String source, String destiny) {
		// TODO Auto-generated method stub
		return repo.findBySourceAndDestiny(source, destiny);
	}
}
