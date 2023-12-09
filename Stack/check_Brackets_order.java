package Stack;
import java.util.*;
public class check_Brackets_order {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s1 = s.nextLine();
        s.close();
        System.out.println(check(s1));
    }
    public static boolean check(String str){
        Stack <Character> s = new Stack<>();
        int n = str.length();
        for(int i =0 ;i<n;i++){
            if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
                s.push(str.charAt(i));
            }else{
                if(str.charAt(i)==')'&& s.peek()=='('){
                    s.pop();
                }else if(str.charAt(i)=='}'&& s.peek()=='{'){
                    s.pop();
                }else if(str.charAt(i)==']'&&s.peek()=='['){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if (s.empty()) {
            return true;
        }
        return false;
    }    
}
