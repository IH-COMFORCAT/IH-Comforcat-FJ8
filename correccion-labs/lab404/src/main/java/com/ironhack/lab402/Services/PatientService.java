package com.ironhack.lab402.Services;

import com.ironhack.lab402.models.DTO.PatientDTO;
import com.ironhack.lab402.models.Employee;
import com.ironhack.lab402.models.Patient;
import com.ironhack.lab402.repositories.EmployeeRepository;
import com.ironhack.lab402.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    PatientRepository patientRepository;

    public Patient createNewPatient(PatientDTO patientDTO){
        Employee employee = employeeRepository.findById(patientDTO.getEmployeeId()).get();
        return patientRepository.save(new Patient(patientDTO.getName(), patientDTO.getDateOfBirth(), employee));
    }


    public Patient updatePatient(PatientDTO patientDTO, Integer id){

        Patient patient = patientRepository.findById(id).get();

        if(patientDTO.getName() != null) patient.setName(patientDTO.getName());
        if(patientDTO.getDateOfBirth() != null) patient.setDateOfBirth(patientDTO.getDateOfBirth());
        if(patientDTO.getEmployeeId() != null) {
            Employee newEmployee = employeeRepository.findById(patientDTO.getEmployeeId()).get();
            patient.setAdmittedBy(newEmployee);
        }
        return patientRepository.save(patient);
    }
}
