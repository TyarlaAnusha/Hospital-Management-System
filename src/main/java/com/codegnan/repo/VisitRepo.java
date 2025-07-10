package com.codegnan.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codegnan.entity.Doctor;
import com.codegnan.entity.Patient;
import com.codegnan.entity.Visit;

@Repository
public interface VisitRepo extends JpaRepository<Visit, Integer> {
	public List<Visit> findAllByPatient(Patient patient);
	public List<Visit> findAllByDoctor(Doctor doctor);
//Custom Query
//	@Query("SELECT  v FROM Visit WHERE v.date>=fromDate AND v.date<=toDate ")
//	public List<Visit> findAllByPatientBetweenDates(Patient patient,Date toDate);
	
}
//http://localhost:8080/doctors/id/visits
//http://localhost:8080/doctors/id/patients