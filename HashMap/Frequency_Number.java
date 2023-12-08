package HashMap;
import java.util.*;
public class Frequency_Number {
  public static void main(String[] args) {
    int arr[]={3,5,3,6,2,4,7,3};
    int query[]={3,5,6,2,4,7};
    Frequency(arr,query);
  }
  public static void Frequency(int arr[],int query[]){
    int n = arr.length;
    int m = query.length;

    HashMap<Integer,Integer> hm =new HashMap<>();
    for(int i=0;i<n;i++){
        if(hm.containsKey(arr[i])==true){
            int temp=hm.get(arr[i]);
            hm.put(arr[i],temp+1);
        }else{
            hm.put(arr[i],1);
        }
    }
    for(int i=0;i<m;i++){
        if(hm.containsKey(query[i])==true){
          System.out.println(query[i]+"->"+hm.get(query[i]));
        }else{
            System.out.println("0");
        }
    }
  }
}
