package Dynamic_Programing;

import java.util.Scanner;

public class minpath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter M,N values : ");
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println("Enter an array elements :  ");
        int arr[][]=new int[m][n];
        int dp[][]=new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        s.close();
       System.out.println("sum of Minimum path is "+path_sum(arr, dp, m-1, n-1)); 
    }
    public static int path_sum(int arr[][],int dp[][],int i,int j){
        if (i==0&&j==0) {
            return arr[i][j];
        }
        if (i<0||j<0||arr[i][j]==0) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][j]!=-1) {
            return dp[i][j];
        }
        int x = path_sum(arr, dp, i-1, j);
        int y = path_sum(arr, dp, i, j-1);
        dp[i][j]=Math.min(x,y)+arr[i][j];
        return dp[i][j];
    }
}
