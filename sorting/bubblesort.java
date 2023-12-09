package sorting;

import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an array size : ");
        int n = s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter an array Elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i]=s.nextInt();
        }
        bubble_sort(arr);
        System.out.println("Sorted array is :");
         for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
    public static void bubble_sort(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
              
            }

        }

    } 
}
