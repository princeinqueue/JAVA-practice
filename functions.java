import java.util.*;
public class functions {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    //add two numbers and return their sum
    // public static int calculatesum(int a,int b){
    //     int sum=a+b;
    //     return sum;}
//multiply two numbers and give their product
// public static int calculateproduct(int a,int b){
//     int product=a*b;
// return product;}
//to calculate factorial of number
public static int fact(int n){
    int factorial=1;
    for(int i=n;i>=1;i--){
        factorial=factorial*i;
    }
        return factorial;
}
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        // String name=sc.next();
        int a=sc.nextInt();
        int b=sc.nextInt();
    // int sum=calculatesum(a, b);
    // System.out.println(sum);
// int product=calculateproduct(a,b);
// System.out.println(product);
int n=sc.nextInt();
int factorial=fact(n);
System.out.println(factorial);
        }    }

