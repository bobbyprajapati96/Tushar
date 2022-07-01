package Recursion;

public class fibnonacci {
    public static void printFibo(int a,int b,int n)
    {
         if(n==0)
         {
             return;
         }
        int c=a+b;
        System.out.println(c);
        printFibo(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println(a);
        System.out.println(b);

        int n=7;
        printFibo(a,b,n-2 );
    }
}
