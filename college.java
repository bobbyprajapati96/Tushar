package practice;

import java.util.Scanner;

public class college {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        System.out.println(s);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z'))
            {
                ++count;
            }

        }
        System.out.println(count);
    }

}
