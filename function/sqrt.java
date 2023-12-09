package function;
import java.util.Scanner;
public class sqrt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = s.nextInt();
        System.out.println("squre root of "+n+" is "+sqrt_num(n));
        s.close();
    }
    public static int sqrt_num(int n){
        int result=0;
        for(int i=1;i*i<=n;i++){
            result=i;
        }
        return result;
    }
}
