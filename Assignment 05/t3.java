// Task 03
import java.util.Scanner; 
public class t3 {
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    int n = sc.nextInt();
    int m=2*n-1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      int k=i*2-1;
      for(int j=1;j<=m;j++){
        if(i==1){
          System.out.print(1);
          break;
        }
        else if (i==n){
          System.out.print(j);
        }
        else{
          if(j==1){
            System.out.print(1);
          }
          else if (j==k){
            System.out.print(k);
          }
          else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}