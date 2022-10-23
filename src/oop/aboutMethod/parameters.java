package oop.aboutMethod;

import java.util.Scanner;

public class parameters {
   static String fullname(String a,String b) {
        String firstName=a;
        String lastName=b;
        return firstName+" "+lastName;
    }

    public static void main(String[] args) {
//        System.out.println(Fullname("ahfhf","asjfa"));
//        System.out.println(Fullname("mugiwara","no luffy"));
        System.out.print("enter ur first name :");
        String firstname=new Scanner(System.in).nextLine();
        System.out.print("enter ur last name :");
        String lastname=new Scanner(System.in).nextLine();
        System.out.println(fullname(firstname,lastname));
    }
}
