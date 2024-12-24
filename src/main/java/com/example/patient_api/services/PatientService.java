package com.example.patient_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.patient_api.modeles.Patient;
import com.example.patient_api.modeles.Statistique;
import com.example.patient_api.repository.PatientRepository;
@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    // Add a new patient
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Get all patients
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // Get a patient by ID
    public Patient getPatientById(String id) {
        return patientRepository.findById(id).get();
    }
    


    public Patient updatePatient(String id, Patient updatedPatient) {
    	
    	         Patient existingPatient=patientRepository.findById(id).get();
    	           if(existingPatient!=null) {
       
                    existingPatient.setNom(updatedPatient.getNom());
                    existingPatient.setPrenom(updatedPatient.getPrenom());
                    existingPatient.setDateNaissance(updatedPatient.getDateNaissance());
                    existingPatient.setSexe(updatedPatient.getSexe());
                    existingPatient.setTaille(updatedPatient.getTaille());
                    existingPatient.setPoids(updatedPatient.getPoids());
                    existingPatient.setContacts(updatedPatient.getContacts());
                   
    	           }
    	           return patientRepository.save(existingPatient);
               
                
    }
    

    // Delete a patient
    public void deletePatient(String id) {
        patientRepository.deleteById(id);
    }
    //Statistique
    public Statistique getPatientStatistics() {
        List<Patient> patients = patientRepository.findAll();

        int totalPatients = patients.size();
        int totalContacts = patients.stream()
                                     .mapToInt(patient -> patient.getContacts() == null ? 0 : patient.getContacts().size())
                                     .sum();

        return new Statistique(totalPatients, totalContacts);
    }
}
