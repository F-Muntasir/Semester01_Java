//task 02
import java.util.Arrays;
import java.util.Scanner;
public class t2 {
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("N = ");
        int n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter a number: ");
            a[i] = sc.nextInt();
            System.out.println();
        }
        int m=sc.nextInt();
        int o =0;
        for(int i=0;i<a.length;i++) {
            if (m == a[i]) {
                System.out.println(a[i] + " is at index " + i);
                o++;
                break;
            }

            }
        if (o == 0) {
            System.out.println("Element not found");
        }
        }
    }

