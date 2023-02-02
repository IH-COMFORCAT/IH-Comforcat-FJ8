package com.ironhack.lab406.Services;

import com.ironhack.lab406.Repositories.DepartmentRepository;
import com.ironhack.lab406.models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;


    public Department createNewDepartment(String departmentName){
        if(departmentName == null || departmentName.isEmpty()) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The desparment name cannot be null or empty");
        if(departmentRepository.findByDepartment(departmentName).isPresent()) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The deapartment already exists");

        return departmentRepository.save(new Department(departmentName));
    }
}
