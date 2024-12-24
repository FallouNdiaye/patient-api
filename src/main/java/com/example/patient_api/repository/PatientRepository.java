package com.example.patient_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.patient_api.modeles.Patient;

public interface PatientRepository extends MongoRepository<Patient, String> {
}