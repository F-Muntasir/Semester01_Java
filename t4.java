// Task 04
import java.util.Scanner; 
public class t4 {
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    int n = sc.nextInt();
    int m = 2*n-1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      int k=2*i-1;
      for(int j=1;j<=m;j++){
        if(i==1){
          System.out.print(1);
          break;
        }
        else if(i==n){
          if(j==1){
            System.out.print(1);
          }
          else if(j==k){
            System.out.print(k);
          }
          else{
            System.out.print(" ");
          }
        }
        else{
          if(j==1){
            System.out.print(1);
          }
          else if(j==k){
            System.out.print(k);
          }
          else{
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
    for(int i=2;i<=n;i++){
      for(int j=1;j<=i-1;j++){
        System.out.print(" ");
      }
      int k=2*(n-i)+1;
      for(int j=1;j<=m;j++){
        if(i==n){
          System.out.print(1);
          break;
        }
        else{
          if (j==1){
            System.out.print(1);
          }
          else if(j==k){
            System.out.print(k);
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