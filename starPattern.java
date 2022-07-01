package practice;

public class starPattern {
    static void pattern1(int x){
        for(int i=0;i<x;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(9);
    }
}
