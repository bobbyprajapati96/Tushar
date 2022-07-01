package Recursion;

public class factorial {
  public static int fact(int n)
  {
      if(n==1 || n==0) {
          return 1;
      }
     int a= fact(n-1);
      int fact1=n*a;
     return fact1;
  }
    public static void main(String[] args) {
       int x= fact(3);
        System.out.println(x);
    }
}
