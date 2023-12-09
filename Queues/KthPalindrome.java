package Queues;
import java.util.*;
public class KthPalindrome {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a K value : ");
    int k = s.nextInt();
    System.out.println("Kth number is : "+kthnum(k));
    s.close();
}
public static String kthnum(int k){
    Queue <String> q1 = new LinkedList<>();
    q1.add("11");
    q1.add("22");
    String result="";
    for(int i =1;i<=k;i++){
         String temp = q1.remove();
         result=temp;
         String left=temp.substring(0, temp.length()/2);
         String right=temp.substring(temp.length()/2, temp.length());
         q1.add(left+"11"+right);
         q1.add(left+"22"+right);
    }
    return result;
}
}

