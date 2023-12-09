package Binary_Search;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an array size : ");
        int n = s.nextInt();
        System.out.print("Enter an array elements : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter Search Key ");
         int k = s.nextInt(); 
         System.out.println(BSearch(arr, k));
         s.close();
    }
    public static boolean BSearch(int arr[],int k){
        int n = arr.length;
        int low=0;
        int high=n;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>k){
                low=mid+1;
            }else if(arr[mid]<k){
                high=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
    
}
