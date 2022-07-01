package practice;
import java .util.Scanner;
public class fibonacci {
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int c){
        if(c>0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(c - 1);
        }
    }
    public static void main(String[] args) {
        int x=10;
//        int  n1=0,n2=1,n3;
//        System.out.print(n1+" "+n2);
//        for(int i=2;i<x;i++){
//            n3=n1+n2;
//            System.out.print(" "+n3);
//            n1=n2;
//            n2=n3;
//        }
        System.out.print(n1+" "+n2);
        printFibonacci(x-2);
    }
}
