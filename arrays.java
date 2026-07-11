import java.util.*;
public class arrays {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=30;
        marks[1]=90;
        marks[2]=50;
     for(int i=0;i<3;i++){
        System.out.println(marks[i]);}
Scanner sc= new Scanner(System.in);
int size=sc.nextInt();
 int numbers[]=new int[size];
 for(int i=0;i<size;i++){
    numbers[i]=sc.nextInt();
 }
 for(int i=0;i<size;i++){
    System.out.println(numbers[i]);
 }
//      }  
//     }
//searnch  a number and output the finding index
int number[]={20,30,40,55};
int find=sc.nextInt();
for(int i=0;i<5;i++){
    if(number[i]==find){
        System.err.println(i);
        break;
    }
}
    }}