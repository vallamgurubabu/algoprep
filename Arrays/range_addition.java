package Arrays;

import java.util.Scanner;

public class range_addition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int Q= s.nextInt();
        int a[]= new int[n];
        int queries[][]=new int[Q][3];
        for(int i =0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<Q;i++){
            for(int j=0;j<3;j++){
                queries[i][j]=s.nextInt();
            }
        }
        int result[]=range_add(a,queries);
        for(int i =0;i<n;i++){
            System.out.print(result[i]+" ");
        }
        s.close();

    }
    public static int[] range_add(int a[],int queries[][]){
        int n =a.length;
        int Q=queries.length;
        int result[]=new int[n];
        for(int i=0;i<Q;i++){
            int st=queries[i][0];
            int end=queries[i][1];
            int inc=queries[i][2];

            result[st]+=inc;
            if(end+1<n){
                result[end+1]-=inc;
            }

        }
        int prefixsum[]=new int[n];
        prefixsum[0]=result[0];
        for(int i =1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+result[i];
        }
        return prefixsum;
    }
    
}
