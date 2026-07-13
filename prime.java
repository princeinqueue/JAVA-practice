
public class prime {
public static void main(String[] args) {
    int num=29;
    primenum(num);
}
    
public static void primenum(int n){
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            System.out.println(n+ "is not a prime number");
            return;
        }
    }
    System.out.println(n+"is a prime number");
}
}
