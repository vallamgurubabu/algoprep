package Arrays;
import java.util.Scanner;
public class rotate_arr_k_times {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of an arry : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the stat and end to rotate \n the start and end should be less than or equal to "+n);
        int sp=s.nextInt();
        int ep=s.nextInt();
        System.out.print("Enter K value : ");
        
        int k = s.nextInt();
        reverse(arr,sp,ep);
        reverse(arr,sp,k-1);
        reverse(arr,k,ep);
        System.out.print("After the reverse : ");
         
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    public static void reverse(int arr[],int sp,int ep){
        int n = arr.length;
        if (sp<=n||ep<=n) {
          while(sp<ep){
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }   
        }
       
    }
}



    

