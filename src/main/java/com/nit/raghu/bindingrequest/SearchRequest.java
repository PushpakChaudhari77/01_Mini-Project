package com.nit.raghu.bindingrequest;

import java.time.LocalDate;

import lombok.Data;
@Data
public class SearchRequest {
	
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;

}
