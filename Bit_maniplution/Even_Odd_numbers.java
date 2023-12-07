package Bit_maniplution;
import java.util.*;
public class Even_Odd_numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Positve Number ");
        int n = s.nextInt();
        if ((n >> 1) << 1 == n) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

}
