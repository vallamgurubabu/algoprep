package Arrays;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of an arry : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        reverse(arr);
        System.out.print("After the reverse : ");
         
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    public static void reverse(int arr[]){
        int sp=0;
        int ep=arr.length-1;
        while(sp<ep){
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
    }
}
