import java.util.*;
public class Pattern {
public static void main(String[] args) {
 
//     //rectangle star pattern
    int n=6;
    int m=7;
    //outer loop(rows)
    for(int i=1;i<=n;i++){
        //inner loop(columns)
        for(int j=1;j<=m;j++){
            System.out.print("*");

        }
        System.out.println();
    }

//hollow rectangle
int m=10;
int n=5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=m;j++){
        if(i==1||j==1||i==n||j==m){
            System.out.print("*");
        }
        else{
            System.out.print (" ");
        }
    }
    System.out.println();
}
    
//star triangle
int n=5;
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
    System.out.print("*");
}
System.out.println(" ");}


// //inverted half triangle
int n=5;
for(int i=n;i>=1;i--){
for(int j=1;j<=i;j++){
    System.out.print("*");
}
System.out.println(" ");}



//right pyramid
int n =5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){System.out.print(" ");}
for( int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();}

//half pyramid with numbers
int n=5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}
//inverted pyramid with numbers
int n=5;
for(int i=1;i<=n;i++){
    for(int j=1; j<=n-i+1;j++){
        System.out.print(j);
    }
    System.out.println();
}}}