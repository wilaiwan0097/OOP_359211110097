//condition
//        score 0-49 grade F
//        score 50-59 grade D
//        score 60-69 grade C
//        score 70-79 grade B
//        score 80-100 grade A
package ooplab3;

import java.util.Scanner;

public class CalGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        int count =0;
        for (int i=1;i<=3;i++) {
            System.out.print("Enter your score(0-100): ");
            score = scanner.nextInt();
            if (score < 0 || score > 100) {
                count++;
                if (count == 3) {
                    System.out.println("System Error.");
                    break;
                }
            } else {
//        test condition score
                if (score < 49) System.out.println("your grade is F");
                else if (score < 59) System.out.println("your grade is D");
                else if (score < 69) System.out.println("your grade is C");
                else if (score < 79) System.out.println("your grade is B");
                else System.out.println("you grade is A");
                break;
            }
        }//for

    }//main



}//class
