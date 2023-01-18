package org.example;

import java.util.*;

public class Employee {

    private String name;
    private String dob;
    //IT, HR, MARKETING
    private Department department;
    private ContractType contractType;

    public Employee(String name, String dob, Department department) {
        this.name = name;
        this.dob = dob;
        this.department = department;

    }
    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", department=" + department +
                ", contractType=" + contractType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.getName()) && Objects.equals(getDob(), employee.getDob()) && getDepartment() == employee.getDepartment() && getContractType() == employee.getContractType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDob(), getDepartment(), getContractType());
    }
}
