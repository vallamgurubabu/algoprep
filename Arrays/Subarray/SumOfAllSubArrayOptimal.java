package Arrays.Subarray;

import java.util.Scanner;

public class SumOfAllSubArrayOptimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n];
        for(int i =0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println(sumsubArray(a));
        s.close();

    }
    public static int sumsubArray(int a[]){
        int ans=0;
        int n=a.length;
        for(int i=0;i<n;i++){
          int contr = (i+1)*(n-i);
          ans+=contr*a[i];
        }
        return ans;
    }
}
