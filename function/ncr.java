package function;

import java.util.Scanner;

public class ncr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n and r values : ");
        int n=s.nextInt();
        int r=s.nextInt();
        int  nfact=fact(n);
        int rfact=fact(r);
        int nmrfact=fact(n-r);
        int ncr = nfact/(rfact*nmrfact);
        System.out.println(ncr);

       s.close();
        
    }
    public static int fact(int num){
        int ans=1;
        for(int i =1;i<=num;i++){
            ans=ans*i;
        }
        return ans;
    }
    
}
