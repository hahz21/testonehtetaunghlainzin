package exam;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int a[]={5,4,1,8,6,9};
        Arrays.sort(a);
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
