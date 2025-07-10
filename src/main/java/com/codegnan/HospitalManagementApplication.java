package com.codegnan;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codegnan.entity.Doctor;
import com.codegnan.entity.Patient;
import com.codegnan.entity.Visit;
import com.codegnan.exception.InvalidDateFormatException;
import com.codegnan.exception.InvalidDoctorIdException;
import com.codegnan.exception.InvalidPatientIdException;
import com.codegnan.service.DoctorService;
import com.codegnan.service.PatientService;
import com.codegnan.service.VisitService;

@SpringBootApplication
public class HospitalManagementApplication {

	public static void main(String[] args) {
    ApplicationContext ctxt = SpringApplication.run(HospitalManagementApplication.class, args);
		
//	PatientService patientService = ctxt.getBean(PatientService.class);
//	DoctorService doctorService = ctxt.getBean(DoctorService.class);
//	VisitService visitService = ctxt.getBean(VisitService.class);
//		
////		try {
////			Patient p1 = patientService.findPatientById(2);
////			Doctor d1 = doctorService.findDoctorById(1);
////			
////			List<Visit> visits1 = visitService.findVisitsByDoctor(d1);
////			List<Visit> visits2 = visitService.findVisitsByPatient(p1);
////			
////			System.out.println("Visits of Doctor "+d1+" : ");
////			System.out.println("Visits : ");
////			for( Visit visit : visits1) {
////				System.out.println(visit);
////			}
////			System.out.println("Visits of Patient "+p1+" : "+visits2);
////		}
////		catch(InvalidPatientIdException e) {
////			e.printStackTrace();
////		}
////		catch(InvalidDoctorIdException e) {
////			e.printStackTrace();
////		}
//		
////		Saving/Creating Doctor
	    /*Doctor doctor = new Doctor("Doc_01", "doc1@gmail.com", "9999999999", "M", "Dermitology", 25, "MS", 450000);
		Doctor hireDoctor = doctorService.hireDoctor(doctor);
//
//
//	
////		Saving/Creating Patient	
		try {
			Patient patient1=new Patient("patient_01","patient1@gmail.com","8908767865","M","01-03-2020",25);
			Patient patient2=new Patient("patient_02","patient2@gmail.com","8908767878","F","01-03-2024",25);
			
			Visit visit1 = new Visit("01-02-2024", "Skin Alergy", 79.5, 98.6, 123.5, "Cash");
			Visit visit2 = new Visit("01-02-2024", "Skin Rashes", 77.0, 98.6, 120.5, "UPI");
			
			visit1.setPatient(patient1);
			visit1.setDoctor(doctor);
			
			visit2.setPatient(patient2);
			visit2.setDoctor(doctor);
			
			patient1.setVisits(Arrays.asList(visit1));
			patient2.setVisits(Arrays.asList(visit2));
			doctor.setVisits(Arrays.asList(visit1, visit2));
			
			
			Patient savedPatient1 = patientService.savePatient(patient1);
			Patient savedPatient2 = patientService.savePatient(patient2);
			
			

			Visit savedVisit1 = visitService.saveVisit(visit1);
			Visit savedVisit2 = visitService.saveVisit(visit2);
		}
		catch(InvalidDateFormatException e) {
			e.printStackTrace();
		}*/
			
			
		}

}
