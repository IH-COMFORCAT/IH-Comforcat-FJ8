package com.ironhack.lab402.controllers.dtos;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.*;

import java.time.*;

public class PatientDTO {
    @NotNull
    @NotEmpty
    private String name;
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private LocalDate localDate;
    @NotNull
    @NotEmpty
    private Integer doctorId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }
}
