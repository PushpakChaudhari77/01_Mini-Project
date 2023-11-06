package com.nit.raghu.service;

import java.util.List;

import com.nit.raghu.bindingrequest.SearchRequest;
import com.nit.raghu.entity.CitizenPlan;

public interface ReportService {
	
	public List<String> getAllPlanName();
	public List<String> getAllPlanStatus();
	public List<CitizenPlan> search(SearchRequest request);
	public boolean exportExcel();
	public boolean exportPdf();
	

}
