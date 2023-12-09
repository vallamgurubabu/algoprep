package function;

import java.util.Scanner;

public class sum_mul_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = s.nextInt();
        sum_mul(n);
        s.close();

    }
    public static void sum_mul(int n ){
        int result=0;
        int sum=0;
        int mul=1;
        while(n!=0){
            int rem = n%10;
            sum=sum+rem;
            mul=mul*rem;
            n=n/10;
        }
        result=mul-sum;
       System.out.println(result);
    }
    
}
