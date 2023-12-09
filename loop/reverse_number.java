package loop;

import java.util.Scanner;

public class reverse_number {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");
        int num=s.nextInt();
        int reverse = reverse(num);
        System.out.println(reverse);
        s.close();
    }
    public static int reverse(int num){
        int rev=0;
        while(num!=0){
         rev=rev*10+num%10; 
         num=num/10;
        }
        return rev;

    }
    
}
