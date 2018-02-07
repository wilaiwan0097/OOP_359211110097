package ooplab9;

public class Person {
    private String personID;
    private String name;
    private Address Address;
    private Job job;

    //Constructor
    public Person(String personID, String name, ooplab9.Address address, Job job) {
        this.personID = personID;
        this.name = name;
        Address = address;
        this.job = job;
    }
    //getter and setter method

    public String getPersonID() {
        return personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ooplab9.Address getAddress() {
        return Address;
    }

    public void setAddress(ooplab9.Address address) {
        Address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    //toString()


    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", Address=" + Address +
                ", job=" + job +
                '}';
    }
}//class
