package com.ironhack.lab402.controllers;

import com.ironhack.lab402.controllers.dtos.*;
import com.ironhack.lab402.models.*;
import com.ironhack.lab402.repositories.*;
import com.ironhack.lab402.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;



    @GetMapping("/patients")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> getAllPatients(){
        return patientService.getAll();
    }

    @GetMapping("/patients-id")
    @ResponseStatus(HttpStatus.OK)
    public Patient getPatientById(@RequestParam Integer id){
        return patientService.findById(id);
    }

    @GetMapping("/patients-dateOfBirth")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findByDateOfBirth(@RequestParam LocalDate start, @RequestParam LocalDate end){
        return patientService.findByDateOfBirth(start, end);

    }

    @GetMapping("/patients-department")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findPatientsByDoctorDepartment(@RequestParam String department){
        return patientService.findByDoctorDepartment(department);

    }

    @GetMapping("/patients-status")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findPatientsByDoctorStatus(@RequestParam Status status){
       return patientService.findByDoctorStatus(status);
    }

    @PostMapping("/patient/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient createNewPatient(@RequestBody PatientDTO patientDTO) {
        return patientService.createNew(patientDTO);

    }



}
