package Stack;
import java.util.*;
public class adjduplicatesString_rev {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String s1 = s.nextLine();
    s.close();
    System.out.println(remove_duplicates(s1));
}
  public static String remove_duplicates(String str){
    Stack <Character> s = new Stack<>();
    int n = str.length();
    for(int i = 0 ;i<n;i++){
        if (s.empty()) {
            s.push(str.charAt(i));
        }else{
            if(s.peek()==str.charAt(i)){
                s.pop();
            }else{
                s.push(str.charAt(i));
            }
        }
    }
    char [] chaarr = new char[s.size()];
    for(int i = chaarr.length-1; i>=0;i--){
          chaarr[i]=s.pop();
    }
    return String.valueOf(chaarr);
  }  
}
