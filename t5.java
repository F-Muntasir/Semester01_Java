// Task 05
import java.util.Scanner; 
public class t5 {
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    int n = sc.nextInt();
    for (int i=1;i<=n;i++){
      for (int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      int k =2*i-1;
      
      for(int j=1;j<=k;j++){
        if(i==1){
          System.out.print(1);
          break;
        }
        else {
          if(j<=i){
            System.out.print(j);
          }
          else {
            int l=k-j+1;
            System.out.print(l);
            l--;
          }
        }
      }
      System.out.println();
    }
  }
}