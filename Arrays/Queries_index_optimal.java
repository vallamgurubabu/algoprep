package Arrays;
// time =o(n)
// space = o(n)
import java.util.Scanner;

public class Queries_index_optimal {
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
                 int prefix[]=prefixsum(a);
                 int Q= q.length;
                 for(int i=0;i<Q;i++){
                    int left = q[i][0];
                    int right = q[i][1];
                    
                    if(left>0){
                        
                        System.out.print(prefix[right]-prefix[left-1]+" ");
                    }else{
                        
                        System.out.print(prefix[right]+" ");
                    }
                    
               }
        }
        public static int[] prefixsum(int a[]) {
            int n = a.length;
            int pre[] = new int[n];
            pre[0] = a[0];
            for (int i = 1; i < n; i++) {
                pre[i] = pre[i - 1] + a[i];
            }
            return pre;
        }
} 
