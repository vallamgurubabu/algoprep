package Arrays.prefix_sum;

import java.util.Scanner;

public class Equilibrium_index {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s. nextInt();
        int a[]=new int[n];
        for(int i =0;i<n;i++){
            a[i]=s.nextInt();
        }
        s.close();
        System.out.println(pivot_count(a));
    }
    public static int pivot_count(int a[]){
        int n =a.length;
        int ans =0;
        int prefix[]=prefixsum(a);
        for(int i=1;i<n-1;i++){
         int left=prefix[i-1];
         int right=prefix[n-1]-prefix[i];
         
         if(left==right){
             ans++;
         }
         if(0==prefix[n-1]-prefix[0]){
            ans++;
         }
         if(prefix[n-2]==0){
            ans ++;
         }

        }
        return ans;
    }
    public static int[] prefixsum(int a[]){
        int  n = a.length;
        int pre[]=new int[n];
        pre[0]=a[0];
        for(int i =1;i<n;i++){
            pre[i]=pre[i-1]+a[i];
        }
        return pre;
    } 
}
