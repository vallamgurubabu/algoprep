package Arrays.TwoDArray;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
    int n =s.nextInt();
    int a [][]=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          a[i][j]=s.nextInt();
        }
    } 
    s.close(); 
    transpose_matrix(a);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          System.out.print(a[i][j]+" ");
        }
        System.out.println();
    } 
    }
    public static void transpose_matrix(int a[][]){
        int n =a.length;
        for(int i =1;i<n;i++){
            for(int j=0;j<i;j++){
               int temp=a[i][j];
               a[i][j]=a[j][i];
               a[j][i]=temp;
            }
        }
    }

    
}
