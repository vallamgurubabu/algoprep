package Arrays;

import java.util.Scanner;

public class print_wave_form_L_R_R_L {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an arry : ");
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter an array elements : ");
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
            arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Wave type array : ");
         for(int i=0;i<n;i++){
            if(i%2==0){
             for(int j = 0;j<n;j++){
             System.out.print(arr[i][j]+" ");
             }
            }else{
               for(int j = n-1;j>=0;j--){
              System.out.print(arr[i][j]+" ");
             } 
            }
            System.out.println("");
            
        }
    }
    
}
