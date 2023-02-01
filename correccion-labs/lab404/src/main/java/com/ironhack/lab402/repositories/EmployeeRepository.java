package com.ironhack.lab402.repositories;

import com.ironhack.lab402.models.Employee;
import com.ironhack.lab402.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByStatus(Status status);
    List<Employee> findByDepartment(String department);

}
