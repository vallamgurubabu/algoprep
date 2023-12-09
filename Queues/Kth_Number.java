package Queues;
import java.util.*;
public class Kth_Number {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a K value : ");
    int k = s.nextInt();
    System.out.println("Kth number is : "+kthnum(k));
    s.close();
}
public static String kthnum(int k){
    Queue <String> q1 = new LinkedList<>();
    q1.add("1");
    q1.add("2");
    String result="";
    for(int i =1;i<=k;i++){
         String temp = q1.remove();
         result=temp;
         q1.add(temp+"1");
         q1.add(temp+"2");
    }
    return result;
}
}
