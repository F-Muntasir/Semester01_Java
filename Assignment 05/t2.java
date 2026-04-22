// Task 02
import java.util.Scanner; 
public class t2 {
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    int n = sc.nextInt();
    for (int i=1; i<=n; i++){
      for (int j=1; j<=n-i;j++){
        System.out.print(" ");
      }
      for (int j=1; j<=n;j++){
        if (i==1){
          System.out.print(n);
          break;
        }
        else if (i==n){
          System.out.print(j);
        }
        else{
          if (j==1){
            System.out.print(n-i+1);
          }
          else if (j==i){
            System.out.print(n);
          }
          else{
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}