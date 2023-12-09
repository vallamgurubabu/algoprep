package Arrays;

import java.util.Scanner;

public class max {
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an arry : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        s.close();
        System.out.println("max num in given array elements is : "+max_num(arr));
    }
    public static int max_num(int arr[]){
        int max= arr[0];
        for(int  i=1;i<arr.length;i++){
           if (max<arr[i]) {
            max=arr[i];
           }
        }
        return max;

    }  
}
