package practice;

import java.util.Scanner;

public class CBSEPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of English");
        int eng=sc.nextInt();
        System.out.println("Enter Marks of Chemistry");
        int chem=sc.nextInt();
        System.out.println("Enter Marks of Maths");
        int maths=sc.nextInt();
        System.out.println("Enter Marks of Science");
        int sci=sc.nextInt();
        System.out.println("Enter Marks of Physics");
        int phy=sc.nextInt();
        double total=eng+chem+sci+phy+maths;
        double percent=(total/500)*100;
        System.out.println("your percentage = "+percent+"%");
    }
}
