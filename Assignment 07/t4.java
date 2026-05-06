//task 04
import java.util.Scanner;
public class t4 {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the length of array 1:");
     int f1 =sc.nextInt();
     int a []= new int[f1];
        System.out.println("Please enter the elements of arr1");
        for(int i =0;i< a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Please enter the length of array 2 :");
        int f2=sc.nextInt();
        int b []= new int[f2];
        System.out.println("Please enter the elements of arr1");
        for(int i =0;i< b.length;i++) {
            b[i] = sc.nextInt();
        }
        int c=0;
        for(int i =0;i< a.length;i++) {
            for(int j = 0; j < b.length; j++) {
                if(b[j]==a[i]){
                    c++;
                }
            }
        }
        if(c==b.length){
            System.out.println("Array 2 is a subset of Array 1.");
        }
        else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }
    }
}
