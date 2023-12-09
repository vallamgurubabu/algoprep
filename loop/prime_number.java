package loop;
import java.util.Scanner;

public class prime_number {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = s.nextInt();
        isprime(num);
        s.close();

    }
       public static void isprime(int num){
       int flag = 0;
        for(int i = 2 ; i < num ;){
         if(num%i==0){
            flag=1;
         }
         break; 
        }
        if(flag==0){
          System.out.println("Prime number");
        }else{
          System.out.println("Not a Prime Number");
        }
    }
    
}
