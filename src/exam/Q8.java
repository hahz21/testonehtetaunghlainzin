package exam;

public class Q8 {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4,5},
                {5,4,3,2,1},
                {7,8,9,1,5,7,7}}      ;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
