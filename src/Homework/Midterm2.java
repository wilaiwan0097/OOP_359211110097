package Homework;
import java.util.Scanner;
public class Midterm2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String ID = GetID();
        String Name = Getname();
        float Salary = GetSalary();
        float OverTime = GetOverTime();
        calculateTex(Salary,OverTime);
        ShowDataInfo(ID,Name,Salary,OverTime);

    }//mian

    private static void ShowDataInfo(String ID, String Name, float Salary, float OverTime) {
        Midterm2 a = new Midterm2 ();
        System.out.println("ID: "+ID);
        System.out.println("Name: "+Name);
        System.out.println("Salary: "+Salary);
        System.out.println("OverTime: "+OverTime);
        System.out.println("Tex is: "+a.calculateTex(Salary,OverTime));

    }//ShowDataInfo

    private static float calculateTex(float a, float b) {

        float sum = a+b;
        System.out.println("Salary Total: = "+sum);
        if (sum>=100000)
        {
            return (sum*10)/100;
        }

        else if (sum>=70000){
            return (sum*7)/100;
        }
        else if (sum>=50000) {
            return (sum*5)/100;
        }
        else if (sum>=30000) {
            return (sum*3)/100;
        }
        else{
            return (sum*1)/100;
        }

    }//calculateTex


    private static Float GetOverTime() {
        System.out.print("Enter your OverTime : ");
        Float OverTime = scan.nextFloat();
        return OverTime;
    }

    private static int GetSalary() {
        System.out.print("Enter your Salary : ");
        int Salary = scan.nextInt();
        return Salary;
    }//GetSalary

    private static String Getname() {
        System.out.print("Enter your Name : ");
        String Name = scan.nextLine();
        return Name;
    }//Getname

    private static String GetID() {
        System.out.print("Enter your ID : ");
        String ID = scan.nextLine();
        return ID;
    }//GetID


}//class
