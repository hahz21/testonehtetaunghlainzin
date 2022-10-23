package oop.aboutMethod;

class Person{
    String name="some";
}

public class PersaonalCall {
     String nam(){
        return "god usopp";
    }
    static Person person(){
        return new Person();
    }

    public static void main(String[] args) {
        String name=person().name;
        System.out.println(name);

    }
}
