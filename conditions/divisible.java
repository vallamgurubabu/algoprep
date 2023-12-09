package conditions;

import java.util.Scanner;

public class divisible {
    public static void main(String args[]){
        Scanner  s = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = s. nextInt();
        if (n%2 == 0 || n%3 == 0) {
         System.out.println(n+"Divisible by 2 or 3");
        }else{
            System.out.println(n+"Not divisible by 2 or 3");
        }
        s.close();
    }
    
}
