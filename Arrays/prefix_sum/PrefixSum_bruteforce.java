
// time =o(n*n)
// space=o(1)


package Arrays.prefix_sum;

import java.util.Scanner;

public class PrefixSum_bruteforce {
public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[] = new int[n];
    int pref[]= new int[n];
    for(int i =0;i<n;i++){
        a[i]=s.nextInt();
    }
    s.close();
    for(int i =0;i<n;i++){
        int sum=0;
        for(int j =0;j<=i;j++){ 
           sum=sum+a[j];
        }
        pref[i]=sum;
    }
    System.out.print("Prifix sum = ");
    for(int i =0;i<n;i++){
        System.out.print(pref[i]+" ");
    }
}
    
}