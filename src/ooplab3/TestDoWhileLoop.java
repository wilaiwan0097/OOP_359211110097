package ooplab3;

import java.util.Scanner;

public class TestDoWhileLoop {
    public static void main(String[] args) {
//        do-while
            int n=1;
            do {
                //statement
                System.out.print(n+" ");
            }while (++n <= 10);
//              correct password
        int pin = 1234;
        int count = 0;
        int input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your password :");
            input = scanner.nextInt();
            count++;
            if (input == pin) {
                System.out.println("Your passeord id correct.");
                break;
            }
            if (input == 3) {
                System.out.println("System error.");
                break;
            }
        }while (input != pin);

    }//main
}//class
