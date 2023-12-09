package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class distinct_Good_integers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an array size : ");
        int n = s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter an array Elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i]=s.nextInt();
        }
        System.out.println(goodInteger(arr));
        s.close();
    }
    public static int goodInteger(int arr[]){
        int n = arr.length;
        int count=0;
        Arrays.sort(arr);
        for(int i = 0;i<n;i++){
            if(arr[i]==i){
                count++;
            }
        }
        return count;
    }
    
}
