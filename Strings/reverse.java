package Strings;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Enter a String ");
       String st=s.nextLine();
       System.out.println(reverse_str(st));
       s.close();
    }
    public static String reverse_str(String str){
        char ch[]=str.toCharArray();
        int sp=0;
        int ep=ch.length-1;
        char temp;
        while(sp<ep){
         temp=ch[sp];
         ch[sp]=ch[ep];
         ch[ep]=temp;
         sp++;
         ep--;
        }
        String result = String.valueOf(ch);
        return result;
    }
    
}
