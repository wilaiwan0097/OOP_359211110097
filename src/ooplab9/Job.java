package ooplab9;

public class Job {
    private String position;
    private Double salary;

    //constructor

    public Job(String position, Double salary) {
        this.position = position;
        this.salary = salary;
    }

    //toString()

    @Override
    public String toString() {
        return "Job{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }


    //getter and setter method
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}//class
