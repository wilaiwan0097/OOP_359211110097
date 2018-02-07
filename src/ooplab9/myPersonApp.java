package ooplab9;

public class myPersonApp {
    public static void main(String[] args) {
        Person person = new Person("1800400231493","Wilaiwan",
                new Address("100 M.8","Nakhon Si Tammarat","80150"),
                new Job("Student","10000"));
        System.out.println(person.toString());

        person.getJob().setSalary(20000);
        System.out.println("Name: "+person.getName()+" Salary: "+ person.getJob().getSalary());





    }












}//class
