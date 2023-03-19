public class Employee {

    private static int idNextValue = 0;

    private int emplId;
    private String fullNameEmpl;
    private int department;
    private double salary;

    public int getEmplId() {
        return emplId;
    }

    public String getFullNameEmpl() {

        return fullNameEmpl;
    }

    public int getDepartment() {

        return department;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String fullNameEmpl, int department, double salary) {
        idNextValue++;
        this.emplId = idNextValue;
        this.fullNameEmpl = fullNameEmpl;
        this.department = department;
        this.salary = salary;
    }

    public void setDepartment(int department) {

        this.department = department;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emplId=" + emplId +
                ", fullNameEmpl='" + fullNameEmpl + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
