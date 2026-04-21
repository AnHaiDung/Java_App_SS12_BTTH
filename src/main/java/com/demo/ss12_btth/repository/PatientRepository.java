package com.demo.ss12_btth.repository;

import com.demo.ss12_btth.model.entity.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@Repository
public class PatientRepository {
    private List<Patient> patients = new ArrayList<>();

    public List<Patient> findAll() {
        return patients;
    }

    public void save(Patient patient) {
        patients.add(patient);
    }
}
