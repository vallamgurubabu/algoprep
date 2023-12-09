package Arrays;

import java.util.Scanner;

public class equal_to_K_of_i_j {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an arry : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter K value : ");
        int k = s.nextInt();
        System.out.println(result(arr, k));
        s.close();

    }
    public static boolean result(int arr[],int k){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
}
