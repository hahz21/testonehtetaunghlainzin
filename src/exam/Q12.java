package exam;

import java.util.Objects;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        int a[]={2,3,4,1,5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("plz enter a position which do you wnat to del:");
        int value=new Scanner(System.in).nextInt();
        for (int i = 0; i < a.length; i++) {
            if(Objects.equals(i,value-1)){
                System.out.println("delete is done ");

            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
