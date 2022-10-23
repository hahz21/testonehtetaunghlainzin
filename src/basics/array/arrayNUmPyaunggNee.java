package basics.array;

import java.util.Arrays;

public class arrayNUmPyaunggNee {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]*3+"\t");
        }
        System.out.println();
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]*3+"\t");
        }
        for (int num : nums) {
            System.out.println(num);
        }
        //two dimesional arry sout neee
        int nos[][]={{1,2,3,},{4,5,6},{7,8,9}};
        //two dimensional arry ka nay swl htoke nee
        System.out.println(Arrays.toString(nos[0]));
        System.out.println(nos[0][0]);
        for (int y = 0; y < nos.length; y++) {
            for (int a = 0; a <nos[y].length ; a++) {
                System.out.print(nos[y][a]);
            }
            System.out.println("");
        }
        for (int[] no : nos) {
            for (int b : no) {
                System.out.print(b+"\t");
            }
            System.out.println();
        }
         }

}
