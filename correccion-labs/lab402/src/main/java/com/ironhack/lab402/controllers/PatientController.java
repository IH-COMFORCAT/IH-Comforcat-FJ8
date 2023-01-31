package com.ironhack.lab402.controllers;

import com.ironhack.lab402.models.Patient;
import com.ironhack.lab402.models.Status;
import com.ironhack.lab402.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/patients")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    @GetMapping("/patients-id")
    @ResponseStatus(HttpStatus.OK)
    public Patient getPatientById(@RequestParam Integer id){
        if(patientRepository.findById(id).isPresent()) return patientRepository.findById(id).get();
        return null;
    }

    @GetMapping("/patients-dateOfBirth")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findByDateOfBirth(@RequestParam LocalDate start, @RequestParam LocalDate end){
        return patientRepository.findByDateOfBirthBetween(start, end);

    }

    @GetMapping("/patients-department")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findPatientsByDoctorDepartment(@RequestParam String department){
        return patientRepository.findByAdmittedByDepartment(department);
    }

    @GetMapping("/patients-status")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findPatientsByDoctorStatus(@RequestParam Status status){
        return patientRepository.findByAdmittedByStatus(status);
    }








}
