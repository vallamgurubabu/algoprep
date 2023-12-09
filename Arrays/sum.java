package Arrays;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an arry : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Sum of array elements is : "+sum_num(arr));
        s.close();
    }
    public static int sum_num(int arr[]){
        int sum = 0;
        for(int  i=0;i<arr.length;i++){
           sum=sum+arr[i];
        }
        return sum;

    }

    
}
