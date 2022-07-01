package practice;

public class Multiplication {
    static void print(int x){

        for(int i=1;i<=10;i++){
//            System.out.println(i*x);
            System.out.format("%d * %d = %d\n",x,i,x*i);

        }
    }
    public static void main(String[] args) {
       print(120);
    }
}
