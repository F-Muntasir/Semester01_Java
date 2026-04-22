//Task 06
import java.util.Scanner;
public class t6{
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    int n= sc.nextInt();
    int t=1;
    int p=0;
    int k=0;
    int m=n;
    while(t<=n){
      
      if(n%t==0 && t!=n){
        p++;
        k=k+t;
      }
      t++;
    }    
    if(p==1){
      System.out.println(n+" is a prime number");
    }
    else{
      System.out.println(n+" is not a prime number");
    }
    if (k==m){
      System.out.println(n+" is a perfect number");
    }
    else{
      System.out.println(n+" is not a perfect number");
    }
  }
}