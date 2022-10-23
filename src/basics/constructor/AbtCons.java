package basics.constructor;

public class AbtCons {
    AbtCons(){
        System.out.println("ajsfd");
    }
    AbtCons(int a){
        System.out.println("asid");
    }
    AbtCons(int a,int b){
        System.out.println("uyt");
    }
    void sum(){
        System.out.println("ajsfdi");
    }
    public static void main(String[] args) {
        AbtCons obj=new AbtCons();
        obj.sum();
        new AbtCons(12);
        new AbtCons(12,53);
    }
}
