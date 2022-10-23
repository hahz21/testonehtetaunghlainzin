package exam;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.print("today is weekend or weekday?");
        String a=new Scanner(System.in).nextLine();
        if(a.equals("weekend")){
            System.out.println("have a good rest");
        } else if (a.equals("weekday")) {
            System.out.println("try hard and good luck sir");
        }else {
            System.out.println("u write smthing wrong");
        }

    }
}
