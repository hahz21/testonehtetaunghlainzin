package exam;

public class Q14 {
    public static void main(String[] args) {
        int a = 0;
        int arr[]={3,4,2,5,4,2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            a = a +arr[i];
        }
        System.out.println("the sum of the array is"+a);
    }
}
