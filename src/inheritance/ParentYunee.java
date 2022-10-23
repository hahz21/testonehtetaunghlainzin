package inheritance;
class A{
    int a=3;
    A(int number,int num){
        System.out.println("this is"+number);
    }
}
public class ParentYunee extends A{
    int b=4;

    public ParentYunee(int number, int num, int b) {
        super(number, num);
        this.b = b;
        System.out.println("Con b");
    }

    public static void main(String[] args) {
//        ParentYunee obj=new ParentYunee();
//        int sum= obj.b+ obj.a;
//        System.out.println(sum);
        ParentYunee objB=new ParentYunee(5,6,7);
    }
}
