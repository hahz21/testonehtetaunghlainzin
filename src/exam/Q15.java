package exam;

public class Q15 {
    public static void main(String[] args) {
        int a[]={2,4,3,1,5,7,6};
        int odd=0;
        int even=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("the even no is"+even);
        System.out.println("the odd no is"+odd);
    }
}
