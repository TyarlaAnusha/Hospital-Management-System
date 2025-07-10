package com.codegnan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegnan.entity.Patient;

import com.codegnan.exception.InvalidPatientIdException;

import com.codegnan.repo.PatientRepo;

@Service
public class PatientService {
	private PatientRepo patientRepo;

	@Autowired
	public PatientService(PatientRepo patientRepo) {
		super();
		this.patientRepo = patientRepo;
	}

//	Add
	public Patient savePatient(Patient patient) {
		return patientRepo.save(patient);
	}

//	FindAll
	public List<Patient> findAllPatients() {

		return patientRepo.findAll();
	}

//	Find by id
	public Patient findPatientById(int id) throws InvalidPatientIdException {
		Optional<Patient> optPatient = patientRepo.findById(id);
		if (!optPatient.isPresent()) {
			throw new InvalidPatientIdException("Patient id :" + id + "not found");
		}
		return optPatient.get();
	}

//	Update
	public Patient updatePatient(Patient patient) throws InvalidPatientIdException {
		findPatientById(patient.getId());
		return patientRepo.save(patient);
	}

//	Delete Patient By id
	public Patient deletePatient(int id) throws InvalidPatientIdException {
		Patient patient = findPatientById(id); 
		patientRepo.deleteById(id);
		return patient;
	}
}