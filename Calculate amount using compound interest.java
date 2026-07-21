
    import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
double p=sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();
       double amount=0;
        amount=p*Math.pow((1+rate/100.0),time);

        System.out.printf("%.1f\n",amount);
    }
}

