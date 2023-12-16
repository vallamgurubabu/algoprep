package Arrays.prefix_sum;

import java.util.Scanner;

public class prefix_max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]= new int[n];
        for(int i =0;i<n;i++){
            a[i]=s.nextInt();
        }
        s.close();
        max_arr(a);
    }
    public static void max_arr(int a[]){
        int n = a.length;
        int max[]=new int[n];
        max[0]=a[0];
        for(int i =1;i<n;i++){
           max[i]=Math.max(max[i-1],a[i]);
           
        }
        for(int i=0;i<n;i++){
            System.out.print(max[i]+" ");
        }
    }
    
}
