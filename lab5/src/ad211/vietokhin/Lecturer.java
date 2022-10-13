package ad211.vietokhin;

public class Lecturer extends Person {
    String department;
    int salary;

    public Lecturer(String department, String name, int age, int salary) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Lecturer of the department: " + department + "; Name: " + name + "; Age: " + age + "; Salary: " + salary);
    }

}
