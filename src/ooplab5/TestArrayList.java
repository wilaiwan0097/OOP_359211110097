package ooplab5;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
    //ArrayList
    ArrayList list = new ArrayList();
        list.add("TIK");
        list.add("NAT");
        list.add("GIRL");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);
        list.add(1, "YAYA");
        System.out.println(list);
//        print with for loop
        for (int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }//for i

        System.out.println(list.indexOf("YAYA"));
        list.set(1, "BABY");
        System.out.println(list);

    //Object Data
    ArrayList numList = new ArrayList();
    Integer x = 10;
        numList.add(x);
        System.out.println(numList);
    Double y = 10.10;
        numList.add(y);
        System.out.println(numList);


}//main


}//class

