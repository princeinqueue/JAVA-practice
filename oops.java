// // // import javax.print.DocFlavor.STRING;

// // // class pen{
// // //     String color;
// // //     String type;
// // //     public void write(){
// // //         System.out.println("hello Prince");
// // //     }
// // //     public void color(){
// // //         System.out.println(this.color);
// // //     }
// // // }
// // // class Student{
// // //     String name;
// // //     int roll;
// // //     int age;
// // //     //polymorphism
// // //     public void printname(String name){
// // //         System.out.println(name);}
// // //         public void printname(int age){
// // //             System.out.println(age);
// // //         }
// // //         public void printname(String name,int age){
// // // System.out.println(name+" "+age);
// // //         }
// // //         // System.out.println(this.name);
// // //         // System.out.println(this.age);}
// // //         //student constructor
// // //         Student(String name, int age) {
// // //             this.name=name;
// // //             this.age=age;

// // //             System.out.println("constructor called");
// // //         }
    
// // // }
// // // public class oops {
// // //     public static void main(String[] args) {
// // //         pen p1= new pen();
// // //         p1.color="blue";
// // //         p1.type="ball";
// // //         p1.write();
// // //         pen p2=new pen();
// // //         p2.color="red";
// // //         p2.type="gel";
// // //         p1.color();
// // //         p2.color();
// // //         Student s1=new Student("prince",18);
// // //         s1.name="prince";
// // //         s1.age=18;
// // // s1.printname(s1.name,s1.age);
// // //     }
    
// // // }
// // class Shape{
// // public void area(){
// //     System.out.println("displays area");
// // }


// // }
// // //inheritance
// // class Triangle extends Shape{
// //     public void area(int l,int b){System.out.println(1/2*l*b);
         
// //     }
// // }
// // class circle extends Shape{
// //     public void area(int r){
// //         System.out.println(3.14*r*r);
// //     }


// // }
// // public class oops{
// //     public static void main(String[] args) {
// //         circle c1=new circle();
// //         c1.area(10);

// //     }
// // }

// ;

// abstract class Animals{
//     abstract void walk();

// }
//     class Horse extends Animals{
//         public void walk(){
//             System.out.println("walks on four legs");
//         }
//     }
//     class HEN extends Animals{
//         public void walk(){
// System.out.println("walks on two legs");
//         }
//     }


// public class oops{
//     public static void main(String[] args) {
//         Horse h1= new Horse();
//         h1.walk();
//     }
// }
interface Animals{
    void walk();
}
class horse implements Animals{
    public void walk(){
        System.out.println("walks on four legs");

    }
}
public class oops{
    public static void main(String[] args) {
        horse h1=new horse();
        horse.walk();
         
    }
}