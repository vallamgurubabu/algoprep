// time = o(n)
// space = o(1)



package Arrays.prefix_sum;

import java.util.Scanner;

public class prefixsum_optimal {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[] = new int[n];
    int pref[]= new int[n];
    for(int i =0;i<n;i++){
        a[i]=s.nextInt();
    }
    s.close();
    pref[0]=a[0];
    for(int j =1;j<n;j++){
      pref[j]=pref[j-1]+a[j];
    }
    System.out.print("Prefix sum = ");
    for(int j =1;j<n;j++){
      System.out.print(pref[j]+" ");
    }
 
    }
      
}
