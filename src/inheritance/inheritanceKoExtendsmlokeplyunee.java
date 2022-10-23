package inheritance;

class Student {
    String name;
    int age;
    Address address;
    public Student(String name,int age,Address address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void show(){
        System.out.println(address.country);
        System.out.println(address.city);
        System.out.println(address.homeno);
    }

    public static void main(String[] args) {
        Address address1=new Address("Ygn","Myanmar","12e");
        Student student1=new Student("mg mg",20,address1);
        student1.show();
    }
}
