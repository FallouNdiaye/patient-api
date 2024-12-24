package com.example.patient_api.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.patient_api.modeles.Contact;
import com.example.patient_api.modeles.Patient;
import com.example.patient_api.modeles.Statistique;
import com.example.patient_api.services.PatientService;


@RestController
@RequestMapping("/api/patients")
public class Controller {

	    @Autowired
	    private PatientService patientService;

	    // Add a new patient
	    @PostMapping
	    public Patient addPatient(@RequestBody Patient patient) {
	    	 if( patient.getContacts()==null) {
            	 List<Contact> contacts = new ArrayList<>();
            	 patient.setContacts(contacts);
             }
	        return patientService.addPatient(patient);
	    }

	    // Get all patients
	    @GetMapping
	    public List<Patient> getAllPatients() {
	    	List<Patient> result = patientService.getAllPatients();;
			
			return result;
	       
	    }

	    // Get patient by ID
	    @GetMapping("/{id}")
	    public Patient getPatientById(@PathVariable String id) {
	        return patientService.getPatientById(id);
	    }

	    // Update a patient
	    @PutMapping("/{id}")
	    public Patient updatePatient(@PathVariable String id, @RequestBody Patient updatedPatient) {
	             if( updatedPatient.getContacts()==null) {
	            	 List<Contact> contacts = new ArrayList<>();
	                 updatedPatient.setContacts(contacts);
	             }
	            return patientService.updatePatient(id, updatedPatient);
	       
	    }

	    // Delete a patient
	    @DeleteMapping("/{id}")
	    public void  deletePatient(@PathVariable String id) {
	    	 patientService.deletePatient(id);
	      
	    }
	    @GetMapping("/statistique")
	    public Statistique getPatientStatistics() {
	       
	        return  patientService.getPatientStatistics();
	    }
	

}
