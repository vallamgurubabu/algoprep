package Arrays;

import java.util.Scanner;

public class print_column_wise {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Enter row and column size of an arry : ");
        int row=s.nextInt();
        int column = s.nextInt();
        int arr[][] = new int[row][column];
        System.out.println("Enter an array elements : ");
        for(int i=0;i<row;i++){
            for(int j = 0;j<column;j++){
               arr[i][j]=s.nextInt();  
            }  
         }
         System.out.println("column wise matrix is :");
         for(int i=0;i<column;i++){
            for(int j = 0;j<row;j++){
               System.out.print(arr[j][i]+" ");  
            }  
            System.out.println("");
         }
        }
     
    
}
