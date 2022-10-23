package basics.array;

public class jaggedArry {
    public static void main(String[] args) {
        int nums[][]=new int[3][];
        nums[0]=new int[5];
        nums[1]=new int[3];
        nums[0][0]=12;
        nums[0][1]=2;
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i);
            }
            System.out.println();

        }
    }
}
