package ooplab4;

public class TestMethods {
    //method
    //type 1
    public static void A() {
        System.out.println("Hello A");
    }//A
    //type2
    public static void B (int x,int y) {
        System.out.println(x+" "+y);
    }
    //type3
    public static int c (int x,int y) {
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        A();
        B(5,10);
        int x = 10,y =20;
        //type 3 return value management
        //1
        int num = c(x,y);
        System.out.println(num);
    }//main
}//class
