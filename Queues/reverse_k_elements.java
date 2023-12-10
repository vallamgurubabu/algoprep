package Queues;
import java.util.*;
public class reverse_k_elements {
    public static void main(String[] args) {
        Queue <Integer> q1 = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter K value : ");
        int k = s.nextInt();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.add(60);
        reverseAtKElements(q1, k);
        s.close();
    }
    public static Queue<Integer> reverseAtKElements(Queue<Integer>q1,int k){
       Stack <Integer> q2 = new Stack<>();
        int n = q1.size();
        for(int i = 1;i<=k;i++){
          q2.push(q1.remove());
        }
        for(int i =1;i<=k;i++){
            q1.add(q2.pop());
        }
        for(int i=1;i<=n-k;i++){
            q1.add(q1.remove());
        }
        return q1;
    }
    
}
