package exam;

public class Q1 {
    public static void main(String[] args) {
        int a=5;
        for (int i = a-1; i > 0; i--) {
            a*=i;
        }
        System.out.println(a);
    }
}
