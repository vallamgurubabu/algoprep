package Bit_maniplution;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();
        if ((num & 1) == 0) {
          System.out.println(num + " is even");
        } else {
          System.out.println(num + " is odd");
        }
        s.close();
      }
}
