package Arrays.prefix_sum;

import java.util.Scanner;

public class product_Except_itself {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            
            arr[i]=s.nextInt();

        }
        int p[]=product(arr);
        for(int i=0;i<n;i++){
            System.out.print(p[i]+" ");
        }
        s.close();
    }
    public static int[] product(int a[]){
        int n = a.length;
        int p[]=new int[n];
        p[0]=a[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]*a[i];
        }
        int sufix=1;
        for(int i =n-1;i>0;i--){
            p[i]=p[i-1]*sufix;
            sufix=sufix*a[i];
        }
        p[0]=sufix;
        return p;
    }
}
