package practice;

import java.util.Scanner;

public class Find_Element_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns respectively: ");
        int x=11;
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] numbers=new int[n][m];
        System.out.println("Enter Elements of 2D array");
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers[i].length;j++){
                System.out.format(" Values for i=%d and j=%d ",i,j);
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int[]num: numbers){
            for(int a:num){
                if(a==x) {
                    System.out.println("Element found");
                }
            }
        }
    }
}
