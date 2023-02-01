package com.ironhack.lab402.Services;

import com.ironhack.lab402.models.Employee;
import com.ironhack.lab402.models.Status;
import com.ironhack.lab402.repositories.EmployeeRepository;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public Employee createNewEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee updateEmployeeStatus(Integer employeeId, Status newStatus){
        Employee employee = employeeRepository.findById(employeeId).get();
        employee.setStatus(newStatus);
        return employeeRepository.save(employee);
    }

    public Employee updateEmployeeDepartment(Integer employeeId, String department){
        Employee employee = employeeRepository.findById(employeeId).get();
        employee.setDepartment(department);
        return employeeRepository.save(employee);

    }



}
