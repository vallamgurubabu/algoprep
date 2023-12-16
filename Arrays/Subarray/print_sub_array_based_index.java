package Arrays.Subarray;

import java.util.Scanner;

public class print_sub_array_based_index {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int st = s.nextInt();
        int en = s.nextInt();
        int a[]=new int[n];
        for(int i =0;i<n;i++){
            a[i]=s.nextInt();
        }
        print_subArray(a,st,en);
        s.close();
    }
    public static void print_subArray(int a[],int s,int e){
            for(int j =s;j<e;j++){
                System.out.print(a[j]+" ");
            }
        
    }
   
}
