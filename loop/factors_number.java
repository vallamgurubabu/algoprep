package loop;

import java.util.Scanner;

public class factors_number {
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        int count=0;
        for(int i = 1 ;i<=num ;i++){
            if(num%i==0){
               System.out.print(i+" ");
               count++;
            }
        }

        System.out.println(" ");
        System.out.println("the number of factors of a "+ num + " is "+count);
    }
}
