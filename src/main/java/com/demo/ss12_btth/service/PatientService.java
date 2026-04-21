package com.demo.ss12_btth.service;

import com.demo.ss12_btth.model.entity.Patient;
import com.demo.ss12_btth.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;
@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }
}
