package exam;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.print("please enter no between 0 and 3:");
        int num=new Scanner(System.in).nextInt();
        switch (num){
            case 1:
                System.out.println("one");
                System.out.println("tik");
                System.out.println("1");
                break;
            case 0:
                System.out.println("thonenya");
                System.out.println("0");
                System.out.println("zero");
                break;
            case 3:
                System.out.println("thone");
                System.out.println("3");
                System.out.println("three");
                break;
            default:
                System.out.println("default");
        }
    }
}
