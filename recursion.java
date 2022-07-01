package practice;

public class recursion {
    static int factorial(int n){
        //factorial(n) =n * n-1 * ...* 1
        //factorial(n)=n*factorial(n-1)
       if(n==0 || n==1){
           return 1;}
       else{
           return n * factorial(n-1);
       }
    }
    //
    static int factorial_iterative(int n){
        //factorial(n) =n * n-1 * ...* 1
        //factorial(n)=n*factorial(n-1)
        if(n==0 || n==1){
            return 1;}
        else{
            int product=1;
            for(int i=1;i<=n;i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
       int x=6;
        System.out.println("The factorial value is: "+factorial(x));
        System.out.println("The factorial value is: "+factorial_iterative(x));

    }
}
