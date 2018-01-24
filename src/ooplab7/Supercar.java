package ooplab7;
//talking about Supercar?
//1.Car brand
//2.Car color
//3.Car engine size
//4.Max speed
//5.country of origin
public class Supercar {
    //properties of Supercar
    private String brand;
    private String color;
    private String size;
    private String speed;
    private String country;
    //constructor
    //Default constructor
    public Supercar () {}
    //constructor by own
    public Supercar (String brand,String color,String size,String speed,String country){
        //assign data to properties
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.speed = speed;
        this.country = country;
    }//Supercar
    //getter and setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}//class
