package star;

public class s6 {
    public static void main(String args[]){
        int n=7;
        int nsp=n/2;
        int nst=1;
        for(int i = 1;i<=n/2;i++){
            for(int j =1 ;j<=nsp;j++){
              System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
              System.out.print("*");
            }
            
                nst=nst+2;
                nsp--;
           
           System.out.println("");
        }
        
    }
}