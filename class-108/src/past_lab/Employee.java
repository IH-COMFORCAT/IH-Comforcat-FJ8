package past_lab;

import java.math.*;

public class Employee {
    private String dni;
    private String name;
    private String lastName;
    private String department;
    private BigDecimal salary;

    public Employee(String dni, String name, String lastName, String department, BigDecimal salary) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        setSalary(salary);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        if (salary.compareTo(BigDecimal.ZERO) > 0) {
            this.salary = salary;
        } else {
            System.out.println("Error");
        }
    }

    public void raiseSalary(BigDecimal raise) {
        this.salary.add(raise);
    }

    @Override
    public String toString() {
        return "past_lab.Employee{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


}
