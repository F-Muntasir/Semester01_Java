//task 01
import java.util.Scanner;
public class t1 {
    //task 1A
    public static boolean isPrime (int a ){
        if(a==1){
            boolean k = false;
            return k;
        }
        else if (a%2!=0 && a%3 !=0 && a%5 !=0 && a%7!=0 || a==2 || a==3 || a==5 || a==7) {
            boolean k = true;
            return k;
        }
        else {
            boolean k=false;
            return k;
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean checkPrime= isPrime(n);
        boolean checkPerfect= isPerfect(n);
        int result= speciel_sum(n);
        System.out.println(checkPrime);
        System.out.println(checkPerfect);
        System.out.println(result);
    }
    //task 1B
    public static boolean isPerfect(int a){
        int k=0;
        for(int i =1;i<a;i++)
            if(a%i==0){
                k+=i;
            }
        if(k==a){
            boolean j= true;
            return j;
        }
        else {
            boolean j = false;
            return j;
        }
    }
    //task 1C
    public static int speciel_sum (int a){
        int k=0;
        for (int i=1;i<=a;i++){
        if(isPerfect(i)==true || isPrime(i)==true){
            k+=i;
        }
        }
        return k;
    }
}
