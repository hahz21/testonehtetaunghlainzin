package Homework;

import java.util.Scanner;
class Userinput{
    int input=new Scanner(System.in).nextInt();}
public class AftrSwp {
    static Userinput userinputs() {
        return new Userinput();
    }
    static String aft(int a, int b){
        System.out.println("This is before swapping" + a + " and" + b);
        return a + "" +b;
    }
    public static void main(String[] args) {
        System.out.println("pls enter no. : ");
        int inp1= userinputs().input;
        System.out.println("pls enter no  : ");
        int inp2= userinputs().input;

    }
}
