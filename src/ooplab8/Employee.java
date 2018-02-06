package ooplab8;

public class Employee extends Person {
    private String position;
    private double salary;
    public Employee(String name, String gender,
                    String dateOfBirth, int age,
                    String position, double salary) {
        super(name, gender, dateOfBirth, age);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
