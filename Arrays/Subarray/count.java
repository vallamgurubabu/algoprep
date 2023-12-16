package Arrays.Subarray;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
    int n =s.nextInt();
    int count=(n*(n+1))/2; 
    System.out.print(count);
      s.close();
    }
    
}
