package com.nit.raghu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nit.raghu.entity.CitizenPlan;

public interface CitizenRepo extends JpaRepository<CitizenPlan, Integer> {
	@Query("select distinct (planName) from CitizenPlan")
	public List< String> getPlanName();
	
	@Query("select distinct (planStatus) from CitizenPlan")
	public List<String> getPlanStatus();

}
