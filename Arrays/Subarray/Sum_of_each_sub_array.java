package Arrays.Subarray;

import java.util.Scanner;

public class Sum_of_each_sub_array {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n];
        for(int i =0;i<n;i++){
            a[i]=s.nextInt();
        }
        sum_of_each_sub(a);
        s.close();
    }
    public static void sum_of_each_sub(int a[]){
        int pre[]=prefixsum(a);
        
        for(int s =0;s<a.length;s++){
            
            for(int e=s;e<a.length;e++){
                 if(s==0){
                    System.out.print(pre[e]); 
                 }else{
                   System.out.print(pre[e]-pre[s-1]);
                 }
                 System.out.println(" ");
            }
           
        }
    }
    public static int[ ] prefixsum(int a[]){
        int n =a.length;
        int p[]=new int[n];
        p[0]=a[0];
        for(int i =1;i<n;i++){
            p[i]=p[i-1]+a[i];
        }
        return p;

    }
    
}
