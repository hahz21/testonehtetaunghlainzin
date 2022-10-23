package basics.constructor;

public class BankCard {
   static String name;
    int id;
    static int amount;
    public BankCard(int i,String n,int am){
        this.id=i;
        this.name=n;
        this.amount=am;
        System.out.println("id"+id+"name:"+name+"amount:"+amount);
    }
    static int Insert(int amt){
        amount+=amt;
        System.out.println("the amt u add is "+amt);
        return amount;
    }
    static void Withdraw(int amt){
        if (amt>=amount){
            System.out.println("u can't withdraw this amt");
        }else {
            amount-=amt;
            System.out.println("successful withdraw.Your amt is "+amount);
        }
    }
    static void Show(int id){
        if (id == 1) {
            System.out.println("name: "+name+" amount: "+amount);
        }
        else {
            System.out.println("ther is nothing");
        }
    }

    public static void main(String[] args) {
        new BankCard(1,"god usopp",10000);
        System.out.println(Insert(100000));
        Withdraw(20000);
        Show(1);
    }
}
