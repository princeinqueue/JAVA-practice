public class strings2 {
   public static void main(String[] args) {
    //string builder
    StringBuilder sb= new StringBuilder("prince");
    System.out.println(sb);
    //char at index=0
System.out.println(sb.charAt(0));
//set char at index 0
sb.setCharAt(0,'P');
System.out.println(sb);
//insert at index 0
sb.insert(0, 's');
System.out.println(sb);
//delete the extra n
sb.delete(0,3 );
System.out.println(sb);
//add to end
sb.append("Mangla");
System.out.println(sb);
//length
sb.length();
System.out.println(sb);
//reverse a string
for(int i=0;i<sb.length()/2;i++){
    int front=i;
    int back=sb.length() -1 -i;
    char frontchar=sb.charAt(front);
    char backchar=sb.charAt(back);
    sb.setCharAt(front,backchar);
    sb.setCharAt(back,frontchar);
}
System.out.println(sb);
   } 
}
