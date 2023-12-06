package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class removerOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an array size : ");
        int n = s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter an array Elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i]=s.nextInt();
        }
        
        System.out.println("Cost :"+removeCos(arr));

    }
    public static int removeCos(int arr[]){
        int ans=0;
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int temp=arr[i]*(n-i);
            ans=ans+temp;
        }
        return ans;
    }
    
}
