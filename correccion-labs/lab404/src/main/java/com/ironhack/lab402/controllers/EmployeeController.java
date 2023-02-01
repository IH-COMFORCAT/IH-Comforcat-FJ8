package com.ironhack.lab402.controllers;

import com.ironhack.lab402.Services.EmployeeService;
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

    @Autowired
    EmployeeService employeeService;

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

    @PostMapping("/new-employee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(Employee employee){
        return employeeService.createNewEmployee(employee);
    }

    @PatchMapping("/update-status")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee updateStatus(@RequestParam Integer id, @RequestParam Status status){
        return employeeService.updateEmployeeStatus(id, status);
    }

    @PatchMapping("/update-department/{id}/{department}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee updateDepartment(@PathVariable Integer id, @PathVariable String department){
        return employeeService.updateEmployeeDepartment(id, department);
    }




}
