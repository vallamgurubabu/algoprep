package Recursion;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = s.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n ){
        if(n==1){
           return 1;
        }
        return n*fact(n-1);   
    }
    
}
