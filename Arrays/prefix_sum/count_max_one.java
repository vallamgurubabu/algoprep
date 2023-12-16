package Arrays.prefix_sum;

import java.util.Scanner;

public class count_max_one {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = s.nextInt();
        System.out.println("Enter array Elements");
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            
            arr[i]=s.nextInt();

        }
        System.out.println(count_max_one_morethanitself(arr));
        s.close();
   
    }
    public static int count_max_one_morethanitself(int arr[]){
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        int count=0;
        for(int i =0 ;i<n;i++){
            if (max==arr[i]) {
                count++;
            }
        }
        return n-count;

    }
    
}
