//task 03
import java.util.Scanner;
public class t3 {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        double a = sc.nextDouble();
        double s =sc.nextDouble();
        double t = calcTax(a,s);
        System.out.println(t);
        calcYearlyTax();
    }
    //task 3A
    public static double calcTax(double a,double s){
        double r=0;
        if(a<18 || s<10000){
            r=0;
            return r;
        }
        if(s>=10000 && s<=20000 && a>=18){
            r=s*0.07;
            return r;
        }
        if (s>20000 && a>=18){
            r=s*0.14;
            return r;
        }
        return r;
    }
//    task 3B
    public static void calcYearlyTax(){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double y =0;
        for(int i=1;i<=12;i++){
            double s =sc.nextDouble();
            double t= calcTax(a,s);
            System.out.printf("Month %d tax: %.1f",i,t);
            System.out.println();
            y+=t;
        }
        System.out.printf("total yearly tax: %.1f",y);
    }
}
