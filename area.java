import java.util.Scanner;

public class area {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int l=sc.nextInt();
    int b=sc.nextInt();
     int rec=area(l,b);
     System.out.println(rec);
}
    
public static int  area(int l,int b){
 int area=l*b;
 return area;   
}
}