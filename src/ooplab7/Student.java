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
        return this.id
    }
    public void setId (String id){
        this.id = id;
    }
    public String getName (){
        return this.name
    }
    public void setId (String name){
        this.name = name;
    }
    public String getAddress (){
        return this.Address
    }
    public void setId (String address){
        this.Address = Address;
    }
    public String getGender (){
        return this.gender
    }
    public void setId (String gender) {
        this.Address = gender;
    }


}//class
