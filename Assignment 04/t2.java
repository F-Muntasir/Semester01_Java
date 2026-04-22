//Task 02
import java.util.Scanner;
public class t2{
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    System.out.println("Please Enter number of Herbs (H):");
    int h=sc.nextInt();
    System.out.println("Please Enter number of Crystals (C):");
    int c=sc.nextInt();
    int n=0;
    int q=2;
    int r=3;
    while(h-r>=3 && c-1>=2){
      n++;
      System.out.println("Potion-"+n+"created");
      h=h-3;
      c=c-2;
      System.out.println("Remaining Herbs: "+h+", Remaining Crystals: "+c);
      while((h<=3&&h>0)&& (c<=2&&c>0)){
        n++;
        System.out.println("Potion-"+n+"created");
        h=h-3;
        c=c-2;
        System.out.println("Remaining Herbs: "+h+", Remaining Crystals: "+c);
      }
    }
    System.out.println("Potions Created: "+n);
    if (n%2==0){
      System.out.println("Stable Elixir");
    }
    else{
      System.out.println("Volatile Brew");
    }
  }
}