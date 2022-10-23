package exam;

public class Q2 {
    static int swap(int a,int b){
        System.out.println("a="+a+"b="+b);
        return a;
    }

    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println(a+" "+b);
        System.out.println(swap(b,a));
    }
}
