package Dynamic_Programing;

import java.util.*;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N value : ");
        int n = s.nextInt();
        s.close();
        for(int i = 0;i<=n;i++){
         System.out.print(fib(i)+" ");
        }
        System.out.println(" = Fibonacci series of "+n +"th element is "+fib(n));
        
    }
    public static int fib(int n ){
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        return fibhelper(dp,n);
    }
    public static int fibhelper(int dp[],int n){
        if (n==0||n==1) {
            return n;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        int a = fibhelper(dp, n-1);
        int b = fibhelper(dp, n-2);
        dp[n]=a+b;
        return dp[n];
        
    }
}
