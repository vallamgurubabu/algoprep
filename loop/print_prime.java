package loop;
import java.util.*;
public class print_prime {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = s.nextInt();
        for(int i=1;i<=num;i++){
            if (isprime(i)) {
                System.out.print(i+" ");
            }
        }
     s.close();

    }
    public static boolean isprime(int num){
        int flag = 0;
         for(int i =2;i<num;i++){
          if(num%i==0){
             flag=1;
          }
          break; 
         }
         if(flag==0){
           return true;
         }else{
           return false;
         }
     }
    
}
