package ooplab8;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonApp { public static void main(String[] args) {
    //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Student student = new Student("Boy Saiyai",
            "Male","20/12/1990",
            20,"STD0001","IS:MT");
    System.out.println(student.toString());

    //Employee object
    Employee emp = new Employee("Girl Saiyai",
            "Female", "11/11/1991",
            22, "Programmer", 35000);
    System.out.println(emp.toString());


    }//main
}//class