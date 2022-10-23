package exam;

public class Q3 {
    static int largst(int a[]){
        int lrg=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>lrg){
                lrg=a[i];
            }
        }
        return lrg;
    }

    public static void main(String[] args) {
        int[] a ={17,24,12,78,62};
        System.out.println("the largest number is "+largst(a));
    }
}
