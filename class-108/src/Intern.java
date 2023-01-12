import java.math.*;

public class Intern extends Employee {

    private static final BigDecimal MAX_SALARY = new BigDecimal("20000");
    private String endOfContractDate;

    public Intern(String dni, String name, String lastName, String department, BigDecimal salary, String endOfContractDate) {
        super(dni, name, lastName, department, salary);
        this.endOfContractDate = endOfContractDate;
    }

    public void setEndOfContractDate(String endOfContractDate) {
        this.endOfContractDate = endOfContractDate;
    }

    public String getEndOfContractDate() {
        return endOfContractDate;
    }

    @Override
    public void setSalary(BigDecimal salary) {
        if (salary.compareTo(MAX_SALARY) > 0) {
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }

    @Override
    public String toString() {
        return "Intern{" +
                "endOfContractDate='" + endOfContractDate + '\'' +
                "} " + super.toString();
    }
}
