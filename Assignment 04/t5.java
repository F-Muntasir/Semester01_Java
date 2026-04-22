//Task 05
import java.util.Scanner;
public class t5{
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter ther N-digit vault code:");
    int n= sc.nextInt();
    int l=n;
    int s=1;
    while(n>0){
      int d = n%10;
      n=n/10;
      s=s*10;
    }
    while (l>0){
      int k=l/(s/10);
      l=l%(s/10);
      s=s/10;
      System.out.print(k);
      if (l!=0){
        System.out.print(", ");
      }
    }
  }
}