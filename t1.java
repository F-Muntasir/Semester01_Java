// Task 01
import java.util.Scanner;
public class t1 {
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int o= 2*n-1;
    for (int i=1;i<=o;i++){
      if (i%2!=0){
        for (int m=1;m<=(o-i)/2;m++){
          System.out.print(" ");
        }
      }
      for (int j=1;j<=i;j++){ 
        if(i%2!=0){
          System.out.print(j);
        }
      }
      if(i%2!=0){
        System.out.println();
      }
    }
    for (int i=o-1;i>=1;i--){
      if (i%2!=0){
        for (int m=1;m<=(o-i)/2;m++){
          System.out.print(" ");
        }
      }
      for (int j=1;j<=i;j++){
        if(i%2!=0){
          System.out.print(j);
        }
      }
      if(i%2!=0){
        System.out.println();
      }
    }
  }
}