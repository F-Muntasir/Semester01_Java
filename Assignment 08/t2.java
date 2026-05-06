//task 02
import java.util.Scanner;
public class t2 {
//    task 2A
    public static void showdots (int a){
        for(int i =1;i<=a;i++)
            System.out.print(".");
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        showdots(a);
        System.out.println();
        show_palindrome(a);
        System.out.println();
        showDiamond(a);
    }
//    task 2B
    public static void show_palindrome(int a){
        for(int i =1;i<=a;i++){
            System.out.print(i);
        }
        for(int i =a-1;i>=1;i--){
            System.out.print(i);
        }
    }
//    task 2C
    public static void showDiamond(int a ){

        for (int i=1;i<=a;i++){

                showdots(a-i);
                show_palindrome(i);
                showdots(a-i);

            System.out.println();
        }
        for(int i=1;i<=a-1;i++){
            showdots(i);
            show_palindrome(a-i);
            showdots(i);
            System.out.println();
        }
    }
}
