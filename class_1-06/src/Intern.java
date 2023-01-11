public class Intern extends Employee{

    private final double MAX_SALARY = 20000;

    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }

    }
}
