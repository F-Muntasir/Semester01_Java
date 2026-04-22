//Task 03
import java.util.Scanner;
public class t3{
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    System.out.println("Energy (E):");
    int e=sc.nextInt();
    System.out.println("Number of river (N):");
    int n=sc.nextInt();
    int j=1;
    while(e>=0){
      while (j<=n){
        System.out.println("Enter River Distance D"+j+":");
        int d=sc.nextInt();
        j++;
        if (d<=5){
          e=e-2;
        }
        else{
          e=e-(d/2);
        }
        if(e>0&&j>n){
          System.out.println("All done");
          System.out.println(e+" energy left");
        }
        else if(e<0){
          int k=j-1;
          System.out.println("Tired at River "+k);
          break;
        }
      }
    }
  }
}
