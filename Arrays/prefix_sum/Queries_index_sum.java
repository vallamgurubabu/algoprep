package Arrays.prefix_sum;

import java.util.Scanner;

// Queries index sum of give array
// time o(Q*n)
// space o(1) 
public class Queries_index_sum {
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      int n = s.nextInt();
      int q=s.nextInt();
      int a[]=new int [n];
      int queries[][]= new int[q][2];  
      for(int i =0;i<n;i++){
        a[i]=s.nextInt();
      }
      for(int i =0;i<q;i++){
        for(int j =0;j<2;j++){
           queries[i][j]=s.nextInt();
        }
      }
      s.close();
      index_sum(a,queries);
      

    }
    public static void  index_sum(int a[],int q[][]){
             int Q= q.length;
             for(int i=0;i<Q;i++){
                int left = q[i][0];
                int right = q[i][1];
                int sum=0;
                for(int j=left;j<=right;j++){
                    sum=sum+a[j];
                }
                System.out.print(sum+" ");
             }
    }
}
