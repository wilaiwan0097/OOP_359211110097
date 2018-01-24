package ooplab7;
//talking about Student?
//1.Student ID
//2.Name
//3.Address
//4.Gender

public class Student {
    //properties of Student
    private String id;
    private String name;
    private String Address;
    private String gender;
    //constructor
    //Default constructor
    public Student () {}
    //constructor by own
    public Student (String id,String n,String a,String g){
        //assign data to properties
        this.id = id;
        this.name = n;
        this.Address = a;
        this.gender = g;
    }//Student
    //getter and setter methods

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getId (){
        return id
    }
    public void setId (String id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}//class
