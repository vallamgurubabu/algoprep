package Strings;

import java.util.Scanner;

public class char_toggle {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a String ");
       String st=s.nextLine();
       int n = st.length();
       char c[]=new char[n];
       for(int i =0;i<n;i++){
        c[i]=st.charAt(i);
       } 
       toggle(c);
       for(int i =0;i<n;i++){
        System.out.print(c[i]+"");
       }
       s.close();
    }
    public static void toggle(char c[]){
       for(int i =0;i<c.length;i++){
        if (c[i]>=65&&c[i]<=90) {
            c[i]=(char)(c[i]+32);
        }else{
            c[i]=(char)(c[i]-32);
        }
       } 
    }
    
}
