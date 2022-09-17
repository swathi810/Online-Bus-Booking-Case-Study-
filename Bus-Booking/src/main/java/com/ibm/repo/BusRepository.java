package com.ibm.repo;
import com.ibm.entity.*;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Integer>{
	
	List<Bus> findByTravels(String carrier);
	
	List<Bus> findBySourceAndDestiny(String src, String dest);
}
