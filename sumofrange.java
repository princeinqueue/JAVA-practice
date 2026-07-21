public class sumofrange {
    static int sumOfRange(int min, int max){
    int sum=0;
 if(min>max){
     return 0;
 }
    
    else{
        for(int i=min;i<=max;i++){
            sum+=i;
        }
    }
    return sum;
}
}
