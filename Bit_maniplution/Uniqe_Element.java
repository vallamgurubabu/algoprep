// if the array have only one unique element
package Bit_maniplution;

import java.util.Scanner;

public class Uniqe_Element {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a array size ");
        int n = s.nextInt();
        System.out.println("Enter an array elements");
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int result=0;
        for(int i =0;i<n;i++){
            result=result^arr[i];
        }
        System.out.println(result);
        s.close();
    }
}
