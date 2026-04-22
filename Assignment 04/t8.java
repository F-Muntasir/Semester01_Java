//Task 08
import java.util.Scanner;
public class t8{
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter an integer");
    int n= sc.nextInt();
    int m=0;
    int q=0;
    int r=1;
    while(r<=n){
      System.out.println("Enter number"+r);
      int t=sc.nextInt();
      if(t>=0){
        m++;
      }
      else {
        q++;
      }
      r++;
    }
    System.out.println(m+" Non-nagative Numbers");
    System.out.println(q+" Negaive Numbers");
  }
}