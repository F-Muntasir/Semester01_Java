//task 05
public class t5 {
    public static void main(String [] args){
        int [] num= {85,90,75,44,99};
        String [] name={"Bob","Alice","Max","Marry","Rosy"};
        int n = num.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(num[j]>num[j+1]) {
                    int temp=num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                    String temp2=name[j+1];
                    name[j+1]=name[j];
                    name[j]=temp2;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i =0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        for(int i =0;i<n;i++){
            System.out.print(name[i]+" ");
        }
    }
}
