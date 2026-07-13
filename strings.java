import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        //string declaration
        String name ="prince";
        String fullname ="prince kumar";
//string input
Scanner sc = new Scanner(System.in);
String Name=sc.next();
System.out.println("i am "+ Name);
//concatenation
String firstname="prince";
String Lastname="Kumar";
String Fullname= firstname+Lastname;
System.out.println(Fullname);
//length of string
System.out.println(Fullname.length());
//printing all the character of a string
for(int i=0;i<Fullname.length();i++){
    System.out.println(Fullname.charAt(i));
}
//comparing two string
String name1="prince";
String name2="varnika";
if(name1.compareTo(name2)==0){
    System.out.println("string are equal");
}
else{
    System.out.println("string are not equal");
}
    }
}
