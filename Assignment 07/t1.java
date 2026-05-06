// task 01
import java.util.Scanner;
public class t1 {
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("N = ");
        int n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Original array:");
          for(int i=0;i<a.length;i++){
              System.out.print(a[i]+" ");
          }
        System.out.println();
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                a[i]=1;
            }
            else{
                a[i]=0;
            }
        }
        System.out.println("After modifying :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            }
        }
    }
