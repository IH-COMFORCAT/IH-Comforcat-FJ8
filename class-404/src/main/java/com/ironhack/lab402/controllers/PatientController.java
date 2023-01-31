package com.ironhack.lab402.controllers;

import com.ironhack.lab402.controllers.dtos.*;
import com.ironhack.lab402.models.*;
import com.ironhack.lab402.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    EmployeeRepository employeeRepository;

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

    @PostMapping("/patient/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient createNewPatient(@RequestBody PatientDTO patientDTO) {
        Employee employee = employeeRepository.findById(patientDTO.getDoctorId()).get();
        Patient patient1 = new Patient(patientDTO.getName(), patientDTO.getLocalDate(), employee);
        return patientRepository.save(patient1);


    }

}
