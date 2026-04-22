// Task 07
import java.util.Scanner;
public class t7 {
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    int n = sc.nextInt();
    int m=(n+1)/2;
    int o=m+1;
    
    for (int i=1;i<=m;i++){
      for(int j=m-1;j>=m-i+1;j--){
        System.out.print(" ");
      }
      int k=2*(m-i)+1;
      for(int j=1;j<=k;j++){
        if (i==n){
          System.out.print(1);
          break;
        }
        else{
          System.out.print(j);
        }
      }
      System.out.println();
    }
    
    for(int i=o;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      int k =2*i-1;
      for (int j=1;j<=(2*(i-((n-1)/2))-1);j++){
        
        if(i==n){
          System.out.print(j);
        }
        else{
          System.out.print(j);
        }
        
        
      }
      System.out.println();
    }
  }
}