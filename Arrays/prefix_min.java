package Arrays;
import java.util.*;
 public class prefix_min {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int a[]= new int[n];
            for(int i =0;i<n;i++){
                a[i]=s.nextInt();
            }
            s.close();
            min_arr(a);
        }
        public static void min_arr(int a[]){
            int n = a.length;
            int min[]=new int[n];
            min[0]=a[0];
            for(int i =1;i<n;i++){
               min[i]=Math.min(min[i-1],a[i]);
               
            }
            for(int i=0;i<n;i++){
                System.out.print(min[i]+" ");
            }
        }
        
    }
     

