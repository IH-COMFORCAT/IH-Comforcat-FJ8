package com.ironhack.lab402.services;


import com.ironhack.lab402.controllers.dtos.*;
import com.ironhack.lab402.models.*;
import com.ironhack.lab402.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.time.*;
import java.util.*;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    public Patient findById(Integer id) {
        if(patientRepository.findById(id).isPresent()) return patientRepository.findById(id).get();
        return null;
    }

    public List<Patient> findByDateOfBirth(LocalDate start, LocalDate end) {
        return patientRepository.findByDateOfBirthBetween(start, end);
    }

    public List<Patient> findByDoctorDepartment(String department) {
        return patientRepository.findByAdmittedByDepartment(department);
    }

    public List<Patient> findByDoctorStatus(Status status) {
        return patientRepository.findByAdmittedByStatus(status);

    }

    public Patient createNew(PatientDTO patientDTO) {
        Employee employee = employeeRepository.findById(patientDTO.getDoctorId()).get();
        Patient patient1 = new Patient(patientDTO.getName(), patientDTO.getLocalDate(), employee);
        return patientRepository.save(patient1);
    }


}
