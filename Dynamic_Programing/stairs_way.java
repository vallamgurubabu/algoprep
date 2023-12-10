package Dynamic_Programing;

import java.util.*;

public class stairs_way {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number of stairs we have to climb : ");
        int n = s.nextInt();
        s.close();
        System.out.println("the Number of Ways to climb : "+climb(n));

    }
    public static int climb(int n ){
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return climbhelper(dp,n);
    }
    public static int climbhelper(int dp[],int n){
        if (n==1||n==2) {
            return 1;
        }
        int a=climbhelper(dp, n-1);
        int b = climbhelper(dp, n-2);
        dp[n]=a+b;
        return dp[n];
    }
    
}
