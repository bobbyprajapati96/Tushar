package unacademy.arrays;

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        ArrayList<Integer> k=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int arr[]=new int[100];
            String s=sc.next();
            for(int x=0;x<s.length();x++)
            {
                arr[s.charAt(x)-'0']++;
            }
            int temp=arr[0];
            int ans=0;
            for(int x=1;x<s.length();x++)
            {
                if(arr[x]>temp)
                {
                    temp=arr[x];
                    ans=x;
                }
            }
            k.add(ans);
        }
        for(int m:k)
            System.out.println(m);
    }
}