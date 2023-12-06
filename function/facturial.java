package function;

import java.util.Scanner;

public class facturial {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        System.out.print("facturial of a number is : ");
        int fact=fact(num);
        System.out.println(fact);
    }
    public static int fact(int num){
        int ans=1;
        for(int i = 1; i<=num;i++){
            ans=ans*i;
           
        }
        return ans;
    }

}
