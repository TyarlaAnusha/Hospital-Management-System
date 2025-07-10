package com.codegnan.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codegnan.entity.Doctor;
import com.codegnan.entity.Patient;
import com.codegnan.entity.Visit;
import com.codegnan.exception.InvalidDoctorIdException;
import com.codegnan.exception.InvalidPatientIdException;
import com.codegnan.service.DoctorService;
import com.codegnan.service.VisitService;
@RestController
@RequestMapping("/doctors")
public class DoctorController{
	DoctorService doctorservice;
	VisitService visitservice;
	
	public  DoctorController(DoctorService doctorservice,VisitService visitservice) {
		this.doctorservice=doctorservice;
		this.visitservice=visitservice;
	}
//To get all	
	@GetMapping("")
	public ResponseEntity<List<Doctor>> getAllDoctors(){
		List<Doctor> doctors=doctorservice.findAllDoctors();
//		We should add responses code in response ofAPI Call
		ResponseEntity<List<Doctor>> responseEntity= new ResponseEntity<List<Doctor>>(doctors, HttpStatus.OK);
		return responseEntity;
	}
	
//find doc by id
	
	@GetMapping("/{id}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable int id) throws InvalidDoctorIdException{
		
		Doctor doctor=doctorservice.findDoctorById(id);
		return new ResponseEntity<Doctor>(doctor,HttpStatus.OK);
	}
	
	@GetMapping("/{id}/visits")
	public ResponseEntity<List<Visit>> getVisitsByDoctorId(@PathVariable int id) throws InvalidDoctorIdException{
		Doctor doctor=doctorservice.findDoctorById(id);
		List<Visit> visits=visitservice.findVisitsByDoctor(doctor);
		return new ResponseEntity<List<Visit>>(visits,HttpStatus.OK);
 
	}
//	Add Doctor
	@PostMapping("")
	public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctors){
		Doctor savedDoctor=doctorservice.hireDoctor(doctors);
		return new ResponseEntity<Doctor>(savedDoctor,HttpStatus.OK);
	
	}
//	Edit by using index
	@PutMapping("/{id}")
	public ResponseEntity<Doctor> editDoctor(@PathVariable int id,@RequestBody Doctor doctor) throws InvalidDoctorIdException {
		if(id!=doctor.getId()){
			throw new InvalidDoctorIdException("ID of the doctor "+doctor.getId()+"is not matching with id"+id+"provided");
		}
		doctorservice.updateDoctor(doctor);
		 return new ResponseEntity<Doctor>(doctor,HttpStatus.OK);
		 
	}                          
//	Delete doctor by id
	@DeleteMapping("/{id}")
	public ResponseEntity<Doctor> deleteDoctorByid(@PathVariable int id) throws InvalidDoctorIdException {
		Doctor removedoctor=doctorservice.deleteDoctor(id);
		return new ResponseEntity<Doctor>(removedoctor,HttpStatus.OK);
		
	}
	
}
