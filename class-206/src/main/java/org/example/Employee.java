package org.example;

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
}
