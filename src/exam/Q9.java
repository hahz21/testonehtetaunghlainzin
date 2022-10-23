package exam;

import java.util.Objects;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int a[]={2,3,4,1,7};
        System.out.print("pls eneter the array no do you want to see:");
        int ind=new Scanner(System.in).nextInt();

        for (int i = 0; i < a.length; i++) {
            if(Objects.equals(i, ind-1)){
                System.out.print("the index is:"+i);
                System.out.print("the no is:"+a[i]);
            }
        }
    }
}
