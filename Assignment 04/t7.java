//Task 07
public class t7{
  public static void main(String [] args){
    int n=1;
    int m=0;
    while(n<=600){
      if((n%7==0 || n%9==0)&& !(n%7==0 && n%9==0)){
        m=m+n;
      }
      n++;
    }
    System.out.println(m);
  }
}