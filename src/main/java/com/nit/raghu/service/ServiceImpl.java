package com.nit.raghu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.raghu.bindingrequest.SearchRequest;
import com.nit.raghu.entity.CitizenPlan;
import com.nit.raghu.repository.CitizenRepo;
@Service
public class ServiceImpl implements ReportService {
	@Autowired
	private CitizenRepo repo;

	@Override
	public List<String> getAllPlanName() {
		
		return null;
	}

	@Override
	public List<String> getAllPlanStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
