package com.nit.raghu.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.nit.raghu.entity.CitizenPlan;
import com.nit.raghu.repository.CitizenRepo;
@Component
public class DataLoader implements ApplicationRunner {
	@Autowired
	private CitizenRepo repo;


	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//Cash Plan 
		CitizenPlan c1=new CitizenPlan();
		c1.setCitizenName("Hamid");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBeneficialAmt(5000.00);
		
		CitizenPlan c2=new CitizenPlan();
		c2.setCitizenName("John");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Income");
		
		CitizenPlan c3=new CitizenPlan();
		c3.setCitizenName("Zoya");
		c3.setGender("FeMale");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Approved");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBeneficialAmt(5000.00);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationRsn("Employed");
		
		//Food 
		CitizenPlan c4=new CitizenPlan();
		c4.setCitizenName("Joy");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBeneficialAmt(4000.00);
		
		CitizenPlan c5=new CitizenPlan();
		c5.setCitizenName("Sam");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Property Income");
		
		CitizenPlan c6=new CitizenPlan();
		c6.setCitizenName("Kriti");
		c6.setGender("FeMale");
		c6.setPlanName("Food");
		c6.setPlanStatus("Approved");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBeneficialAmt(5000.00);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationRsn("Employed");
		
		// Medical
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Ben");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBeneficialAmt(4000.00);

		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Zak");
		c8.setGender("Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Property Income");

		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Ann");
		c9.setGender("FeMale");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Approved");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBeneficialAmt(5000.00);
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminationRsn("Govt Job");

		// Employment plan
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Ben");
		c10.setGender("Male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBeneficialAmt(4000.00);

		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Zak");
		c11.setGender("Male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Property Income");

		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Ann");
		c12.setGender("FeMale");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Approved");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBeneficialAmt(5000.00);
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminationRsn("Govt Job");

	List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
	repo.saveAll(list);
	
	}

}
