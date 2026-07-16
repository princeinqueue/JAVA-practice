import java.util.Scanner;
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;

    }
    Student(Student s1){
        this.name=s1.name;
        this.age=s1.age;

    }
    void printData(){
        System.out.println("Name:" + name + "Age:"+age);
    }
}
public class oops1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        String name=sc.next();
        System.out.println("ENTER YOUR AGE");
        int age= sc.nextInt();
        Student s1= new Student(name,age);
        Student s2=new Student(s1);
        s2.printData();
    }
}
