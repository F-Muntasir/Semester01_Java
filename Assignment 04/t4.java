//Task 04
import java.util.Scanner;
public class t4{
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    int n= sc.nextInt();
    while(n>0){
      int d = n%10;
      n=n/10;
      System.out.print(d);
      if (n!=0){
        System.out.print(", ");
      }
    }
  }
}