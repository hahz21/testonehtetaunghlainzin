package exam;

public class Q13 {
    public static void main(String[] args) {
        int a[]={12,3,2,4,1,2,3};
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a.length; i1++) {
                if (i1==i){
                    System.out.println("del duplicate done");
                }
            }
        }
    }
}
