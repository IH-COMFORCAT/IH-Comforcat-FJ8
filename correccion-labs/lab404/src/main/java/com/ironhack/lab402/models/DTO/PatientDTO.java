package com.ironhack.lab402.models.DTO;

import java.time.LocalDate;


public class PatientDTO {


    private String name;

    private LocalDate dateOfBirth;

    private Integer employeeId;

    public PatientDTO(String name, LocalDate dateOfBirth, Integer employeeId) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}
