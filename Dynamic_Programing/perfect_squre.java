package Dynamic_Programing;

import java.util.*;

public class perfect_squre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N value : ");
        int n = s.nextInt();
        s.close();
        System.out.println(numbersqure(n));
    }
    public static int numbersqure(int n){
       int dp[] = new int[n+1];
       Arrays.fill(dp,-1);
       return helper(dp,n);
    }
    public static int helper(int dp[],int n ){
        if(n==0||n==1){
            return n;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        int min = Integer.MAX_VALUE;
        for(int i =1;i*i<=n;i++){
          int temp = helper(dp,n-i*i);
          min=Math.min(min, temp);

        }
        dp[n]=min+1;
        return dp[n];
    }
    
}
