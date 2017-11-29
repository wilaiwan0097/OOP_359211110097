package ooplab2;

public class TestVariable {
    public static void main(String[] args) {
        //  Integer
        int i;
        i=10;
        System.out.println("i="+i);
        int j =20;
        System.out.println("j="+j);
        System.out.println("i+j="+(i+j));
        System.out.println("i*j="+(i+j));
        System.out.println("i/j="+(i+j));
        //double v = 50.5;
        double v;
        System.out.println("v"+v);
        i=(int)v;
        System.out.println(i);
        System.out.println(v);

//      charector
        char c = 'x';
        System.out.println(c);

        //String
        String s = "Hello,world";
        System.out.println(s);
        String name = "I'm TIK";
        System.out.println(s+" "+name);
        String msg = s.concat(" "+name);
        System.out.println(msg);
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.length());
        System.out.println(msg.replace('o','g'));

        //Boolean
        boolean b = true;
        boolean b1 = false;
        System.out.println(b+" "+b1);

//      Shortcut Operator
        int number = 10;
        System.out.println(number);
        number+=1;//number=number+1;
        number-=5;//number=number-5;
        int x = number++;
        
    }//main
}//class
