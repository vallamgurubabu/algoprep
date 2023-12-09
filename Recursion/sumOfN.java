package Recursion;
import java.util.*;

public class sumOfN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();
        System.out.println("sum = "+sum(n));
        s.close();
    }
    public static int sum(int n){
         if(n==1){
            return n;
         }
         int temp= sum(n-1);
         return temp+n;
    }
    
}
