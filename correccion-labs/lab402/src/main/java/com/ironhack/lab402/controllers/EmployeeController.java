package com.ironhack.lab402.controllers;

import com.ironhack.lab402.models.Employee;
import com.ironhack.lab402.models.Status;
import com.ironhack.lab402.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/doctors")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllDoctors(){
        return employeeRepository.findAll();
    }

    @GetMapping("/doctors/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee findEmployeeById(@PathVariable Integer id){
        if(employeeRepository.findById(id).isPresent()) return employeeRepository.findById(id).get();
        else return null;
    }

    @GetMapping("/doctors-status/{status}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findEmployeeByStatus(@PathVariable Status status){
        return employeeRepository.findByStatus(status);
    }

    @GetMapping("/doctors-department/{department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findEmployeeByDepartment(@PathVariable String department){
        return employeeRepository.findByDepartment(department);
    }




}
