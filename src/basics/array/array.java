package basics.array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int numbers[]={1,3,4,2,5,7,66,55,88};
        System.out.println(numbers.length);
        System.out.println(numbers[8]);//array akhn twy ka shi tae hr yae -1 nhoke pyy yin ya tae akhnn no. ko pl htae khine pee htoke pya loi ya
        System.out.println(numbers[0]);
        System.out.println(Arrays.toString(numbers));//arrays ko string anay nae change chin dr ko thone ya ml
    }
}
