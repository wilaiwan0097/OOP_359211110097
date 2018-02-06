package ooplab7;

import java.util.Scanner;

public class mySupercar {
    public static void main(String[] args) {
        //create object as Supercar
        //default constructor
        Supercar s1 = new Supercar();
        s1.setBrand("Honda");
        s1.setColor("Red");
        s1.setSize("2500");
        s1.setSpeed("200");
        s1.setCountry("Thai");
        System.out.println(s1.getBrand());
        System.out.println(s1.getColor());
        System.out.println(s1.getSize());
        System.out.println(s1.getSpeed());
        System.out.println(s1.getCountry());

        System.out.println(s1.toString());

        Supercar s2 = new Supercar("MG", "Green",
                "3000","150","England");
        System.out.println(s2.toString());

        s2.setBrand("MG s");
        System.out.println(s2.toString());
        //user assign data to object
        Supercar s3 = new Supercar();
        s3 = inputData(s3);
        System.out.println(s3.toString());
    }

    private static Supercar inputData(Supercar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a supercar info");
        System.out.print("Brand: ");
        s.setBrand(scanner.nextLine());
        System.out.print("Color: ");
        s.setColor(scanner.nextLine());
        System.out.print("Size: ");
        s.setSize(scanner.nextLine());
        System.out.print("Speed: ");
        s.setSpeed(scanner.nextLine());
        System.out.print("Country: ");
        s.setCountry(scanner.nextLine());

        return s;
    }//inputData
}//class
