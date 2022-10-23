package exam;

import java.util.Objects;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        int b;
        int a[]={2,3,4,1,5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("plz enter a value which do you wnat to del:");
        int value=new Scanner(System.in).nextInt();
        for (int i = 0; i < a.length; i++) {
            if(value==a[i]){
                System.out.println("delete is done ");
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
