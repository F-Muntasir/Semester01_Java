// Task 06
import java.util.Scanner; 
public class t6 {
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    int n = sc.nextInt();
    int m=2*n-1;
    for (int i=1;i<=n;i++){
      for(int j=n-1;j>=n-i+1;j--){
        System.out.print(" ");
      }
      int k=2*(n-i)+1;
      for(int j=1;j<=k;j++){
        if (i==n){
          System.out.print(1);
          break;
        }
        else{
          if(j<=n-i+1){
            System.out.print(j);
          }
          else{
            int l=k-j+1;
            System.out.print(l);
          }
        }
      }
      System.out.println();
    }
  }
}