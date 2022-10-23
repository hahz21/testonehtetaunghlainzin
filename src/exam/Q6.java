package exam;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.print("please enter the day:");
        String num=new Scanner(System.in).nextLine();
        switch (num){
            case "Monday":
                System.out.println("Monday");
                System.out.println("weekday");
                break;
            case "Tuesday":
                System.out.println("weekday");
                System.out.println("tuesday");
                break;
            case "Wednesday":
                System.out.println("weekday");
                System.out.println("wednesday");
                break;
            case "Friday":
                System.out.println("weekday");
                System.out.println("Friday");
                break;
            case "Thursday":
                System.out.println("weekday");
                System.out.println("thursday");
                break;
            case "Saturday":
                System.out.println("weekend");
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("weekend");
                System.out.println("sunday");
                break;
            default:
                System.out.println("default");
        }
    }
}
