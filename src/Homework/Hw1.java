package Homework;

import java.util.Arrays;
import java.util.Scanner;
class Userinputs{
    String input=new Scanner(System.in).nextLine();
}
public class Hw1 {
    static Userinputs userinputs() {
        return new Userinputs();
    }

    static int gr(int a) {
        String[] arr = new String[a];
        for (int i = 0; i < a; i++) {
            System.out.print("enter no.");
            arr[i] = userinputs().input;

        }

        for (int no = 0; no < arr.length; no++) {
            System.out.println(arr[no]);
        }
        Arrays.sort(arr);
        System.out.println("the largest no is" + arr[arr.length - 1]);
        System.out.println("the smallest no is"+arr[0]);
        int c = 0;
        return c;
    }

    public static void main(String[] args) {
        System.out.print("The number of int do you want to add: ");
        int intn = Integer.parseInt(userinputs().input);
        System.out.println(gr(intn));
    }
}
