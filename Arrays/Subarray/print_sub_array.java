package Arrays.Subarray;

import java.util.Scanner;

public class print_sub_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n];
        for(int i =0;i<n;i++){
            a[i]=s.nextInt();
        }
        subArray(a);
        s.close();
    }
    public static void subArray(int a[]){
        int n = a.length;
        for(int s =0;s<n;s++){
          for(int e=s;e<n;e++){
            for(int i =s;i<=e;i++){
               System.out.print(a[i]+" ");
            }
            System.err.println();
             
          }
        }
    }
    
}
