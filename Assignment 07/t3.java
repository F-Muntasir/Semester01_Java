//task 03
import java.util.Scanner;
public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter a number:");
            a[i] = sc.nextDouble();
        }
        double max = a[0];
        int maxI = 0;
        double min=a[0];
        int minI=0;
        double sum=0;

        for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                    maxI = i;
                }
            if (a[i] < min) {
                min = a[i];
                minI = i;
            }
            sum+=a[i];
        }
        double ava=sum/n;
        System.out.println("Maximum element " + max + " found at index " + maxI);
        System.out.println("Minimum element " + min + " found at index " + minI);
        System.out.println("Summation: "+sum);
        System.out.printf("Avarage: %.2f",ava);
    }
}