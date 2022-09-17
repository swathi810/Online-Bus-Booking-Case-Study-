package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Bus;

import com.ibm.service.BusService;

@CrossOrigin
@RestController
public class BusController {
	@Autowired
	private BusService service;
	
	@PostMapping(value="/bus", consumes="application/json")
	public String addFlight(@RequestBody Bus b) {
		int code = service.save(b);
		return "Flight added with code" +code;
	}
	
	@GetMapping(value="/bus/{code}", produces="application/json")
	public Bus getFlight(@PathVariable int code ) {
		return service.fetch(code);
		
	}
	
	@GetMapping(value="/bus", produces="application/json")
	public List<Bus> getAll(){
		return service.list();
	}
	// http://localhost:8880/carrier/Jet
	@GetMapping(value = "/travels/{trav}", produces = "application/json")
	public List<Bus> getByTravels(@PathVariable String trav) {			
		return service.byTravels(trav);
	}
			
	// http://localhost:8880/route?source=Mumbai&destiny=Goa
	@GetMapping(value = "/route", produces = "application/json")		
	public List<Bus> getByRoute(@RequestParam String source, @RequestParam String destiny) {
		return service.byRoute(source, destiny);
	}
	
	@DeleteMapping(value="/bus/{code}")
	public String remove(@PathVariable int code) {
		service.delete(code);
		return "Bus with code: "+code+" is deleted";
	}
	
	@PutMapping(value="/bus/{code}")
	public int update(@PathVariable int code) {
		Bus b = service.fetch(code);
		b.setSeatsCount(b.getSeatsCount()-1);
		return service.save(b);
		
	}
	

}
