package basics.control_flow;

public class eg1 {
    public static void main(String[] args) {
        //if else,if else if else loke nee
        int a=4;
        int b=5;
        if (a>b){
            System.out.println("a is greater than b");
        }else {
            System.out.println("a is less than b");
        }
        String day="Mon";
        if (day.equals("Mon")){
            System.out.println("this weekday");
        } else if (day.equals("tue")) {
            System.out.println("this is free day");
        }else {
            System.out.println("I don't know");
        }
        //switch case loke nee
        int num=7;
        switch (num){
            case 3:
                System.out.println(3);
                System.out.println("three");
                System.out.println("thone");
                break;
            case 4:
                System.out.println("four");
                System.out.println(4);
                System.out.println("for");
                break;
            case 5:
                System.out.println("fight");
                System.out.println("five");
                System.out.println(5);
                break;
            default:
                System.out.println("default");
        }
        //while loop pack nee
        int n=2;
        while (n<4){
            System.out.println("a is less than 4");
            n++;
        }
        int v=5;
        do {
            System.out.println(v);
            v++;
        }
        while (v!=8);
        //for loop pak nee
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);

        }

    }
}
