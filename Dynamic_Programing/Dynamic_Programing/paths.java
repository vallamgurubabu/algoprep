package Dynamic_Programing;
import java.util.*;

public class paths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a M,N value : ");
        int m = s.nextInt();
        int n = s.nextInt();
        s.close();
        System.out.println("Number of ways : "+paths_count(m, n));

    }
    public static int paths_count(int m,int n){
        int dp[][]= new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        return helper(dp,m-1,n-1);
    }
    public static int helper(int dp[][],int i,int j){
        if (i==0||j==0) {
            return 1;
        }
        if (dp[i][j]!=-1) {
            return dp[i][j];
        }
        int x=helper(dp, i-1, j);
        int y= helper(dp, i, j-1);
        dp[i][j]=x+y;
        return x+y;
    }
}
